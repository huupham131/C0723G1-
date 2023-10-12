create database quan_ly_ban_hang;
use quan_ly_ban_hang;
create table customer(
customer_id int not null auto_increment primary key,
customer_name varchar(20),
customer_age int not null check (customer_age >=16)
);
create table `order`(
order_id int not null auto_increment primary key,
order_date date not null,
order_total_price float not null,
customer_id int not null,
foreign key(customer_id) references customer(customer_id)
);
create table product(
product_id int not null auto_increment primary key,
product_name varchar(20) not null,
product_price float not null
);
create table order_detail(
od_quantity int not null,
product_id int not null,
order_id int not null,
primary key (product_id, order_id),
foreign key (product_id) references product (product_id),
foreign key (order_id) references `order` (order_id)
);