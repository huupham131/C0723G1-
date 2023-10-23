drop database if exists pet_store;
create database if not exists pet_store;
use pet_store;
create table type_customer(
id_type_customer int primary key auto_increment,
name_type_customer varchar(50) not null
);
create table type_pet(
id_type_pet  int primary key auto_increment,
name_type_pet varchar(50) not null
);
create table pet(
id_pet int primary key auto_increment,
name_pet varchar(50) not null,
weight int not null,
id_type_pet int not null,
foreign key (id_type_pet) references type_pet(id_type_pet)
);
create table customer(
id_customer int primary key auto_increment,
name_customer varchar(50) not null,
phone_number varchar(50) not null,
address varchar(200) not null,
id_type_customer int not null,
id_pet int not null,
username_customer varchar(50) not null unique,
password_customer varchar(50) not null,
foreign key (id_type_customer) references type_customer(id_type_customer),
foreign key (id_pet) references pet(id_pet)
);
create table employees(
id_employee int primary key auto_increment,
employee_name varchar(50),
roles varchar(20) not null,
birthday date,
phone_number varchar(10) not null,
address varchar(50) not null,
identification_card varchar(12) not null,
salary int,
unique(username,roles,phone_number,identification_card),
check (roles in ('ADMIN' and 'EMPLOYEE')),
username varchar(50) not null,
password varchar(50) not null
);
create table if not exists service(
id_service int auto_increment primary key,
service_name varchar(50) not null,
service_price int not null,
unit int not null
);
create table if not exists bill(
id_bill int auto_increment primary key,
id_customer int not null,
id_employee int not null,
start_time datetime not null,
end_time datetime not null,
foreign key(id_customer) references customer(id_customer),
foreign key(id_employee) references employees(id_employee)
);
create table if not exists detail_service(
id_detail_service int auto_increment primary key,
id_service int not null,
id_bill int not null,
quantity int default 0,
foreign key (id_service) references service(id_service),
foreign key (id_bill) references bill(id_bill)
);