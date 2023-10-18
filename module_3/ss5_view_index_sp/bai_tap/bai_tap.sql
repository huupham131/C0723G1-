create database ss5_bt;
use ss5_bt;
-- tạo bảng products
create table products(
id int primary key auto_increment,
product_code varchar(10) not null unique,
product_name varchar(45) not null,
product_price int not null check (product_price>= 0),
product_amount int not null check (product_amount >= 0),
product_description varchar(100) not null,
product_status bit not null
);
-- Tạo dữ liệu
insert into products
value
(1, 'PD-01', 'Bút', 5000, 20, 'Bút có bi', 1),
(2, 'PD-02', 'Vở', 10000, 10, 'Ô ly', 1),
(3, 'PD-03', 'Compa', 15000, 25, 'Nhựa', 0),
(4, 'PD-04', 'Thước', 10000, 10, 'Nhựa dẻo', 0);
-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
create unique index i_product_code on products(product_code);
-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
create index i_product_name_price on products(product_name, product_price);
-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
explain select * from products
where product_code = 'PD-03';
explain select * from products
where product_name = 'Thước' and product_price = 15000;
-- So sánh câu truy vấn trước và sau khi tạo index
explain select * from products
where product_name = 'Thước' and product_price = 15000;
-- Khi tạo index thì rows = 4
drop index i_product_name_price on products;
explain select * from products
where product_name = 'Bút chì' or product_price = 15000;
-- khi không có index thì rows = 1
-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
create view w_products as 
select product_code, product_name, product_price, product_status
from products;
select * from w_products;
-- Tiến hành sửa đổi view
update w_products
set product_name = 'Bút chì'
where product_code = 'PD-01';
-- Tiến hành xoá view
drop view w_products;
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure get_all_products()
begin
select * from products;
end //
delimiter ;
-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure sp_create_new_product(p_product_code varchar(10),p_product_name varchar(45),
p_product_price int,p_product_amount int,p_product_description varchar(100),p_product_status bit)
begin
insert into products(product_code, product_name, product_price, product_amount, product_description, product_status)
value
(p_product_code, p_product_name, p_product_price, p_product_amount, p_product_description, p_product_status);
end //
delimiter ;
call sp_create_new_product ('PD-05','Cục Tẩy',5000,5,'made in Tàu',1);
call get_all_products;
-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure sp_update_product(p_id int, p_product_code varchar(10),p_product_name varchar(45),
p_product_price int,p_product_amount int,p_product_description varchar(100),p_product_status bit)
begin
update products
set 
product_code = p_product_code, 
product_name = p_product_name, 
product_price = p_product_price, 
product_amount = p_product_amount, 
product_description = p_product_description, 
product_status = p_product_status
where id = p_id;
end //
delimiter ;
call sp_update_product (5, 'PD-06', 'Cục Gôm', 6000, 6, 'made in VN', 0);
call get_all_products;
-- Tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure sp_delete_product(p_id int)
begin
delete from products
where id = p_id;
end //
delimiter ;
call sp_delete_product(5);
call get_all_products;