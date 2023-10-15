use case_study;
-- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ 
-- chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
select s.id, s.name_service, s.acreage, s.price, ts.`name` as name_type_service
from service s
join type_service ts on s.id_type_service = ts.id
where s.id not in (select ct.id
from contract ct
where (year(ct.start_date) = 2021 and quarter(ct.start_date) = 1 ));
-- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu 
-- của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.
select s.id, s.name_service, s.acreage , s.max_persons, s.price, ts.`name` as name_type_service
from service s
left join type_service ts on s.id_type_service = ts.id
left join contract ct on s.id = ct.id_service
where (year(ct.start_date) = 2020 and not year(ct.start_date) = 2021)
group by s.id;
-- 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.
-- Cách 1
select distinct name_customer
from customer;
-- Cách 2
select name_customer
from customer
group by name_customer;
-- Cách 3 
select name_customer
from customer
union select name_customer
from customer