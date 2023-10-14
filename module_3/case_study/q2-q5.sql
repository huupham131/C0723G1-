use case_study;
-- Q2 Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select *
from staff
where (((name_staff like 'H%') or (name_staff like 'T%') or (name_staff like 'K%')) and (char_length(name_staff) <=15));
-- Q3 Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select *
from customer
where ((datediff(curdate(),customer.birthday))/365) between 18 and 50
and (address like '% Đà Nẵng' or address like '% Quảng Trị');
-- Q4 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select c.id,c.name_customer,count(ct.id) as quantity_rent
from customer c
join contract ct on c.id = ct.id_customer
join type_customer tc on c.id_type_customer = tc.id
where tc.`name` = 'Diamond'
group by c.id
order by quantity_rent;
-- 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
-- (Với tổng tiền được tính theo công thức như sau: 
-- Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 
-- cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra). 
select c.id, c.name_customer,tc.`name`, ct.id, s.name_service, ct.start_date, ct.end_date, 
(ifnull(s.price,0) + sum(ifnull(cd.quantity,0) * ifnull(acs.price,0))) as total
from customer c
join type_customer tc on c.id_type_customer = tc.id
left join contract ct on c.id = ct.id_customer
left join service s on ct.id_service = s.id
left join contract_detail cd on ct.id = cd.id_contract
left join accompanied_service acs on cd.id_accompanied_service = acs.id
group by c.id, ct.id
order by c.id;
