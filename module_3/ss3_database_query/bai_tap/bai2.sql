create database quan_ly_ban_hang;
use quan_ly_ban_hang;
create table customer(
customer_id int auto_increment primary key,
customer_name varchar(25) not null,
customer_age tinyint not null check (customer_age >9)
);
create table `order`(
order_id int auto_increment primary key,
customer_id int not null,
order_date date not null,
order_total_price int check(order_total_price>0),	
foreign key(customer_id) references customer(customer_id)
);
create table product(
product_id int auto_increment primary key,
product_name varchar(25) not null,
product_price int not null check(product_price >0)
);
create table order_detail(
order_id int not null,
product_id int not null,
od_quantity int not null check(od_quantity>0),
primary key (product_id, order_id),
foreign key (product_id) references product (product_id),
foreign key (order_id) references `order` (order_id)
);
insert into customer(customer_name,customer_age)
values
('Minh Quan',10),
('Ngoc Oanh',20),
('Hong Ha',50);
insert into `order`(customer_id,order_date,order_total_price)
values
(1,'2006-03-21',null),
(2,'2006-03-23',null),
(1,'2006-03-16',null);
insert into product(product_name,product_price)
values
('May Giat',3),
('Tu Lanh',5),
('Dieu Hoa',7),
('Quat',1),
('Bep Dien',2);
insert into order_detail
values
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select order_id, order_date, order_total_price 
from `order`;
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c.*,p.product_name
from customer c
join `order` o on c.customer_id = o.customer_id
join order_detail od on o.order_id = od.order_id
join product p on od.product_id = p.product_id;
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select c.customer_name,ifnull(o.customer_id, 'Ko mua gì cả') as products
from customer c
left join `order` o on c.customer_id = o.customer_id
where o.customer_id is null;
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. 
-- Giá bán của từng loại được tính = odQTY*pPrice)
select o.order_id, o.order_date, od.od_quantity * p.product_price as total_price_order
from `order` o 
left join order_detail od on o.order_id = od.order_id
left join product p on p.product_id = od.product_id

