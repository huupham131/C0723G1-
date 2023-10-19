use case_study;
-- 21.	Tạo khung nhìn có tên là v_nhan_vien để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” 
-- và đã từng lập hợp đồng cho một hoặc nhiều khách hàng bất kì với ngày lập hợp đồng là “12/12/2019”.
create view v_nhan_vien as
select st.* 
from staff st
join contract ct on ct.id_staff = st.id
where (address like '%Hải Châu%') and ct.id in (
select id
from contract 
where start_date = '2019-12-12');
-- 22.	Thông qua khung nhìn v_nhan_vien thực hiện cập nhật địa chỉ thành “Liên Chiểu” đối với tất cả các nhân viên 
-- được nhìn thấy bởi khung nhìn này.
update v_nhan_vien
set address = replace(address,'Hải Châu', 'Liên Chiểu')
where address like '%Hải Châu%';
-- 23.	Tạo Stored Procedure sp_xoa_khach_hang dùng để xóa thông tin của một khách hàng nào đó với ma_khach_hang 
-- được truyền vào như là 1 tham số của sp_xoa_khach_hang.
delimiter //
create procedure sp_xoa_khach_hang( p_id int)
begin
delete from customer
where p_id = id;
end //
delimiter ;
-- 24.	Tạo Stored Procedure sp_them_moi_hop_dong dùng để thêm mới vào bảng hop_dong với yêu cầu sp_them_moi_hop_dong 
-- phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung, với nguyên tắc không được trùng khóa chính và đảm bảo toàn 
-- vẹn tham chiếu đến các bảng liên quan.

delimiter //
create procedure sp_them_moi_hop_dong( p_start_date datetime, p_end_date datetime, p_deposits double, p_id_staff int,
p_id_customer int,  p_id_service int) 
begin
if exists (select id from staff where p_id_staff = id) then
	if exists (select c.id from customer c where p_id_customer = c.id) then
		if exists (select id from service where p_id_service = id) then
			insert into contract (start_date, end_date, deposits, id_staff, id_customer, id_service)
            value (p_start_date, p_end_date, p_deposits, p_id_staff, p_id_customer, p_id_service);
		else select 'id service not exist';
        end if;
	else select 'id customer not exist';
	end if;
else select 'id staff not exist';
end if;
end //
delimiter ;
call sp_them_moi_hop_dong('2000-12-12', '2000-12-12', 2131, 10,1,1);
-- 25.	Tạo Trigger có tên tr_xoa_hop_dong khi xóa bản ghi trong bảng hop_dong thì hiển thị tổng số lượng bản ghi còn
-- lại có trong bảng hop_dong ra giao diện console của database.
delimiter //
create trigger tr_xoa_hop_dong
after delete on contract
for each row
begin
declare total int;
declare nofi varchar(50);
select count(id) into total from contract;
set nofi = concat('total of contract is ', total);
signal sqlstate '45000' set message_text = nofi;
end //
delimiter ;
drop trigger tr_xoa_hop_dong;
set sql_safe_updates = 0;
delete from contract
where id = 17;
set sql_safe_updates = 1;
-- 26.	Tạo Trigger có tên tr_cap_nhat_hop_dong khi cập nhật ngày kết thúc hợp đồng, cần kiểm tra xem thời gian cập nhật
-- có phù hợp hay không, với quy tắc sau: Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày.
-- Nếu dữ liệu hợp lệ thì cho phép cập nhật, nếu dữ liệu không hợp lệ thì in ra thông báo “Ngày kết thúc hợp đồng phải
-- lớn hơn ngày làm hợp đồng ít nhất là 2 ngày” trên console của database.
delimiter //
create trigger tr_cap_nhat_hop_dong
before update on contract
for each row
begin
declare nofi varchar(100);
if((new.end_date - new.start_date)>2) then
update contract
set old.start_date = new.start_date,
old.end_date = new.end_date;
else 
set nofi = 'Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày';
signal sqlstate '45000'
set message_text = nofi;
end if;
end
//
delimiter ;
drop trigger tr_cap_nhat_hop_dong;
update contract
set start_date = '2000-12-12',
end_date = '2000-01-12'
where id = 16;
-- 27.Tạo Function thực hiện yêu cầu sau:
-- a.Tạo Function func_dem_dich_vu: Đếm các dịch vụ đã được sử dụng với tổng tiền là > 2.000.000 VNĐ.
delimiter //
create function func_dem_dich_vu()
returns int
deterministic
begin
declare total_service int;
with temp as (select s.id, sum(ifnull(s.price,0) + ifnull(cd.quantity,0) * ifnull(acs.price,0)) as total
from contract ct
join service s on ct.id_service = s.id
join contract_detail cd on ct.id = cd.id_contract
join accompanied_service acs on cd.id_accompanied_service = acs.id
group by s.id
having total >2000000)
select count(id) into total_service 
from temp;
return total_service;
end
//
delimiter ;
select func_dem_dich_vu();
-- b.Tạo Function func_tinh_thoi_gian_hop_dong: Tính khoảng thời gian dài nhất tính từ lúc bắt đầu làm
-- hợp đồng đến lúc kết thúc hợp đồng mà khách hàng đã thực hiện thuê dịch vụ (lưu ý chỉ xét các khoảng thời
-- gian dựa vào từng lần làm hợp đồng thuê dịch vụ, không xét trên toàn bộ các lần làm hợp đồng).
--  Mã của khách hàng được truyền vào như là 1 tham số của function này.
delimiter //
create function func_tinh_thoi_gian_hop_dong(f_id_customer int)
returns int
deterministic
begin
declare max_time int;
select max(datediff(end_date, start_date)) into max_time
from contract ct
join customer c on ct.id_customer = c.id
where ct.id_customer = f_id_customer;
return max_time;
end
//
delimiter ;
select func_tinh_thoi_gian_hop_dong(4);
-- 28.	Tạo Stored Procedure sp_xoa_dich_vu_va_hd_room để tìm các dịch vụ được thuê bởi khách hàng với loại dịch vụ là
-- “Room” từ đầu năm 2015 đến hết năm 2019 để xóa thông tin của các dịch vụ đó (tức là xóa các bảng ghi trong bảng dich_vu)
-- và xóa những hop_dong sử dụng dịch vụ liên quan (tức là phải xóa những bản gi trong bảng hop_dong) và những bản liên quan khác.
delimiter //
create procedure sp_xoa_dich_vu_va_hd_room() 
begin
with temp as (
select s.id as id_service , ct.id as id_contract, cd.id as id_contract_detail 
from service s
join type_service ts on ts.id = s.id_type_service
join contract ct on ct.id_service = s.id
join contract_detail cd on cd.id_contract = ct.id
where ts.name ='Room' and (year(start_date) between 2015 and 2019)
)
delete from service 
where id in (select id_service from temp);
delete from contract 
where id in (select id_contract from temp);
delete from contract_detail  
where id in (select id_contract_detail from temp);
end //
delimiter ;