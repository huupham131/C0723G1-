create database case_study;
use case_study;

create table positions(
id int primary key,
name_position varchar(45) not null
);
create table `level`(
id int primary key,
name_level varchar(45) not null
);
create table department(
id int primary key,
name_department varchar(45) not null
);
create table staff(
id int primary key,
name_staff varchar(45) not null,
birthday date not null,
id_card varchar(45) check(length(id_card)=9 or length(id_card) =12 ) not null unique,
salary double not null check(salary > 0),
phone_number varchar(45) check(length(phone_number) = 10) not null unique,
email varchar(45) unique,
address varchar(45) not null,
id_position int not null,
id_level int not null,
id_department int not null,
foreign key (id_position) references positions(id),
foreign key (id_level) references level(id),
foreign key (id_department) references department(id)
);
create table type_customer(
id int primary key,
`name` varchar(45) not null 
);
create table customer(
id int primary key,
name_customer varchar(45) not null,
birthday date not null,
gender bit(1) not null,
id_card varchar(45) check(length(id_card)=9 or length(id_card) =12 ) not null unique,
phone_number varchar(45) check(length(phone_number) = 10) not null unique,
email varchar(45) unique,
address varchar(45) not null,
id_type_customer int not null,
foreign key (id_type_customer) references type_customer(id)
);
create table type_service(
id int primary key,
`name` varchar(45) not null 
);
create table rental_type(
id int primary key,
`name` varchar(45) not null 
);
create table service(
id int primary key,
name_service varchar(45) not null,
acreage int not null check(acreage>0),
price double not null check(price>=0),
max_persons int not null check(max_persons>0),
standard_room varchar(45) not null,
other_utility_descriptions varchar(45) not null,
pool_area double check(pool_area>=0),
numbers_floor int check(numbers_floor>=0),
free_service text,
id_rental_type int not null,
id_type_service int not null,
foreign key (id_rental_type) references rental_type (id),
foreign key (id_type_service) references type_service(id)
);
create table accompanied_service(
id int primary key,
`name` varchar(45) not null,
price double not null check(price>=0),
unit varchar(10) not null,
`status` varchar(45) not null
);
create table contract(
id int primary key,
start_date datetime not null,
end_date datetime not null,
deposits double not null check(deposits>=0),
id_staff int not null,
id_customer int not null,
id_service int not null,
foreign key (id_staff) references staff(id),
foreign key (id_customer) references customer(id),
foreign key (id_service) references service(id)
);
create table contract_detail(
id int primary key,
id_contract int not null,
id_accompanied_service int not null,
quantity int not null check(quantity>=0),
foreign key (id_contract) references contract(id),
foreign key (id_accompanied_service) references accompanied_service(id)
);
-- Add data to table
insert into positions (id, name_position)
value (1, 'Quản Lý'),
		(2, 'Nhân Viên');
insert into `level` (id, name_level)
value (1, 'Trung Cấp'),
		(2, 'Cao Đẳng'),
        (3, 'Đại Học'),
        (4, 'Sau Đại Học');
insert into department (id, name_department)
value (1, 'Sale-Marketing'),
		(2, 'Hành chính'),
        (3, 'Phục vụ'),
        (4, 'Quản lý');
insert into staff (id, name_staff, birthday, id_card, salary, phone_number, email, address, id_position, id_level, id_department)
value 
(1, 'Nguyễn Văn An', '1970-11-07', '456231786', 10000000, '0901234121', 'annguyen@gmail.com', '295 Nguyễn Tất Thành, Đà Nẵng', 1, 3, 1),
(2, 'Lê Văn Bình', '1997-04-09', '654231234', 7000000, '0934212314', 'binhlv@gmail.com', '22 Yên Bái, Đà Nẵng', 1, 2, 2),
(3, 'Hồ Thị Yến', '1995-12-12', '999231723', 14000000, '0412352315', 'thiyen@gmail.com', 'K234/11 Điện Biên Phủ, Gia Lai', 1, 3, 2),
(4, 'Võ Công Toản', '1980-04-04', '123231365', 17000000, '0374443232', 'toan0404@gmail.com', '77 Hoàng Diệu, Quảng Trị', 1, 4, 4),
(5, 'Nguyễn Bỉnh Phát', '1999-12-09', '454363232', 6000000, '0902341231', 'phatphat@gmail.com', '43 Yên Bái, Đà Nẵng', 2, 1, 1),
(6, 'Khúc Nguyễn An Nghi', '2000-11-08', '964542311', 7000000, '0978653213', 'annghi20@gmail.com', '294 Nguyễn Tất Thành, Đà Nẵng', 2, 2, 3),
(7, 'Nguyễn Hữu Hà', '1993-01-01', '534323231', 8000000, '0941234553', 'nhh0101@gmail.com', '4 Nguyễn Chí Thanh, Huế', 2, 3, 2),
(8, 'Nguyễn Hà Đông', '1989-09-03', '234414123', 9000000, '0642123111', 'donghanguyen@gmail.com', '111 Hùng Vương, Hà Nội', 2, 4, 4),
(9, 'Tòng Hoang', '1982-09-03', '256781231', 6000000, '0245144444', 'hoangtong@gmail.com', '213 Hàm Nghi, Đà Nẵng', 2, 4, 4),
(10, 'Nguyễn Công Đạo', '1994-01-08', '755434343', 8000000, '0988767111', 'nguyencongdao12@gmail.com', '6 Hoà Khánh, Đồng Nai', 2, 3, 2);
insert into type_customer (id, `name`)
value
(1, 'Diamond'),
(2, 'Platinium'),
(3, 'Gold'),
(4, 'Silver'),
(5, 'Member');
insert into customer (id, name_customer, birthday, gender, id_card, phone_number, email, address, id_type_customer)
value
(1, 'Nguyễn Thị Hào', '1970-11-07', b'0', '643431213', '0945423362', 'thihao07@gmail.com', '23 Nguyễn Hoàng, Đà Nẵng', 5),
(2, 'Phạm Xuân Diệu', '1992-08-08', b'1', '865342123', '0954333333', 'xuandieu92@gmail.com', 'K77/22 Thái Phiên, Quảng Trị', 3),
(3, 'Trương Đình Nghệ', '1990-02-27', b'1', '488645199', '0373213122', 'nghenhan2702@gmail.com', 'K323/12 Ông Ích Khiêm, Vinh', 1),
(4, 'Dương Văn Quan', '1981-07-08', b'1', '543432111', '0490039241', 'duongquan@gmail.com', 'K453/12 Lê Lợi, Đà Nẵng', 1),
(5, 'Hoàng Trần Nhi Nhi', '1995-12-09', b'0', '795453345', '0312345678', 'nhinhi123@gmail.com', '224 Lý Thái Tổ, Gia Lai', 4),
(6, 'Tôn Nữ Mộc Châu', '2005-12-06', b'0', '732434215', '0988888844', 'tonnuchau@gmail.com', '37 Yên Thế, Đà Nẵng', 4),
(7, 'Nguyễn Mỹ Kim', '1984-04-08', b'0', '856453123', '0912345698', 'kimcuong84@gmail.com', 'K123/45 Lê Lợi, Hồ Chí Minh', 1),
(8, 'Nguyễn Thị Hào', '1999-04-08', b'0', '965656433', '0763212345', 'haohao99@gmail.com', '55 Nguyễn Văn Linh, Kon Tum', 3),
(9, 'Trần Đại Danh', '1994-07-01', b'1', '432341235', '0643343433', 'danhhai99@gmail.com', '24 Lý Thường Kiệt, Quảng Ngãi', 1),
(10, 'Nguyễn Tâm Đắc', '1989-07-01', b'1', '344343432', '0987654321', 'dactam@gmail.com', '22 Ngô Quyền, Đà Nẵng', 2);
insert into type_service (id, `name`)
value 
(1, 'Villa'),
(2, 'House'),
(3, 'Room');
insert into rental_type (id, `name`)
value 
(1, 'year'),
(2, 'month'),
(3, 'day'),
(4, 'hour');
insert into service (id, name_service, acreage, price, max_persons, standard_room, other_utility_descriptions, pool_area, numbers_floor, free_service, id_rental_type, id_type_service)
value
(1, 'Villa Beach Front', 25000, 1000000, 10, 'vip', 'Có hồ bơi', 500, 4, null, 3, 1),
(2, 'House Princess 01', 14000, 5000000, 7, 'vip', 'Có thêm bếp nướng', null, 3, null, 2, 2),
(3, 'Room Twin 01', 5000, 1000000, 2, 'normal', 'Có tivi', null, null, '1 Xe máy, 1 Xe đạp', 4, 3),
(4, 'Villa No Beach Front', 22000, 9000000, 8, 'normal', 'Có hồ bơi', 300, 3, null, 3, 1),
(5, 'House Princess 02', 10000, 4000000, 5, 'normal', 'Có thêm bếp nướng', null, 2, null, 3, 2),
(6, 'Room Twin 02', 3000, 900000, 2, 'normal', 'Có tivi', null, null, '1 Xe máy', 4, 3);
insert into accompanied_service (id, `name`, price, unit, `status`)
value
(1, 'Karaoke', 10000, 'giờ', 'tiện nghi, hiện tại'),
(2, 'Thuê xe máy', 10000, 'chiếc', 'hỏng 1 xe'),
(3, 'Thuê xe đạp', 20000, 'chiếc', 'tốt'),
(4, 'Buffet buổi sáng', 15000, 'suất', 'đầy đủ đồ ăn, tráng miệng'),
(5, 'Buffet buổi trưa', 90000, 'suất', 'đầy đủ đồ ăn, tráng miệng'),
(6, 'Buffet buổi tối', 16000, 'suất', 'đầy đủ đồ ăn, tráng miệng');
insert into contract (id, start_date, end_date, deposits, id_staff, id_customer, id_service)
value
(1, '2020-12-08', '2020-12-08', 0, 3, 1, 3),
(2, '2020-07-14', '2020-07-21', 200000, 7, 3, 1),
(3, '2021-03-15', '2021-03-17', 50000, 3, 4, 2),
(4, '2021-01-14', '2021-01-18', 100000, 7, 5, 5),
(5, '2021-07-14', '2021-07-15', 0, 7, 2, 6),
(6, '2021-06-01', '2021-06-03', 0, 7, 7, 6),
(7, '2021-09-02', '2021-09-05', 100000, 7, 4, 4),
(8, '2021-06-17', '2021-06-18', 150000, 3, 4, 1),
(9, '2020-11-19', '2020-11-19', 0, 3, 4, 3),
(10, '2021-04-12', '2021-04-14', 0, 10, 3, 5),
(11, '2021-04-25', '2021-04-25', 0, 2, 2, 1),
(12, '2021-05-25', '2021-05-27', 0, 7, 10, 1);
insert into contract_detail (id, quantity, id_contract, id_accompanied_service)
value
(1, 5, 2, 4),
(2, 8, 2, 5),
(3, 15, 2, 6),
(4, 1, 3, 1),
(5, 11, 3, 2),
(6, 1, 1, 3),
(7, 2, 1, 2),
(8, 2, 12, 2);
