use case_study;
-- 11.Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” 
-- và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
select acs.id, acs.name, acs.status
from accompanied_service acs
join contract_detail cd on cd.id_accompanied_service = acs.id
join contract ct on ct.id = cd.id_contract
join customer c on c.id = ct.id_customer
join type_customer tc on tc.id = c.id_type_customer
where tc.name = 'Diamond' and (c.address like '%Vinh' or c.address like 'Quảng Ngãi');
-- 12.Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, 
-- so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc của tất cả các dịch vụ đã từng được
-- khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
select ct.id, st.name_staff, c.name_customer, c.phone_number as customer_phone_number,s.id as id_service, s.name_service,
sum(ifnull(quantity,0)) as quantity_acs, ct.deposits
from contract ct
join staff st on st.id = ct.id_staff
join customer c on c.id = ct.id_customer
join service s on s.id = ct.id_service
left join contract_detail cd on ct.id = cd.id_contract
where ( year(start_date)= 2020 and quarter(start_date) = 4 ) and s.id not in(
select id_service from contract
where quarter(start_date) in (1,2) and year(start_date) = 2021)
group by ct.id;
-- 13.Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
--  (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
with quantity_acs as(
select acs.id, acs.name, sum(quantity) as quantity_acs
from contract_detail cd
join accompanied_service acs  on cd.id_accompanied_service = acs.id
group by acs.id)
select * 
from quantity_acs
where quantity_acs = (
select max(quantity_acs)
from quantity_acs);
-- 14.Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung
-- (được tính dựa trên việc count các ma_dich_vu_di_kem).
set sql_mode=(select replace(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
select ct.id as id_contract, ts.name as type_service_name, acs.name as accompanied_service_name, 
count(cd.id_accompanied_service) as count_used_acs
from contract ct
join service s on s.id = ct.id_service
join type_service ts on ts.id = s.id_type_service
join contract_detail cd on ct.id =cd.id_contract
join accompanied_service acs on acs.id = cd.id_accompanied_service
group by cd.id_accompanied_service
having count(cd.id_accompanied_service) = 1;
-- 15.Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai,
--  dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
select st.id, st.name_staff, l.name_level, d.name_department, st.phone_number, st.address
from staff st
join level l on l.id = st.id_level
join department d on d.id = st.id_department
join contract ct on ct.id_staff = st.id
group by st.id
having count(ct.id)<=3