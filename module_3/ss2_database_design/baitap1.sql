create database quan_ly_vat_tu;
use quan_ly_vat_tu;
create table nha_cung_cap(
ma_nha_cc int not null auto_increment primary key,
ten_nha_cc varchar(30) not null,
dia_chi varchar(50),
sdt int not null
);
create table don_dat_hang(
so_dh int not null auto_increment primary key,
ngay_dat_hang datetime not null
);
create table vat_tu(
ma_vat_tu int not null auto_increment primary key,
ten_vat_tu varchar(30) not null
);
create table phieu_xuat(
so_px int not null auto_increment primary key,
ngay_xuat datetime not null,
don_gia_xuat float not null,
so_luong_xuat int not null
);
create table phieu_nhap(
so_pn int not null auto_increment primary key,
ngay_nhap datetime not null,
don_gia_nhap float not null,
so_luong_nhap int not null
);
