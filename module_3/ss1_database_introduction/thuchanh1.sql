create database quanlydiemthi;
use quanlydiemthi;
create table hocsinh(
MaHS varchar(20) primary key,
TenHS varchar(50),
NgaySinh datetime,
Lop Varchar(20),
GT varchar(20)
);
create table monhoc(
MaMH varchar(20) primary key,
TenMH varchar(50),
MaGV varchar(20)
);
create table bangdiem(
MaHS varchar(20),
MaMH varchar(20),
DiemThi int,
NgayKT datetime,
primary key(MaHS, MaMH),
foreign key(MaHS) references hocsinh(MaHS),
foreign key(MaMH) references monhoc(MaMH)
);
create table giaovien(
MaGV varchar(20) primary key,
TenGV varchar(20),
SDT varchar(10)
);
alter table monhoc add constraint FK_MaGV foreign key(MaGV) references giaovien(MaGV);