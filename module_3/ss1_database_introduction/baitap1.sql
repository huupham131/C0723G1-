create database quan_ly_vat_tu;
use quan_ly_vat_tu;
create table nha_cung_cap(
ma_nha_cc int not null auto_increment primary key,
ten_nha_cc varchar(30) not null,
dia_chi varchar(50),
sdt int unique not null
);
create table don_dat_hang(
so_dh int not null auto_increment primary key,
ngay_dat_hang date not null,
ma_nha_cc int not null,
foreign key (ma_nha_cc) references nha_cung_cap(ma_nha_cc)
);
create table vat_tu(
ma_vat_tu int not null auto_increment primary key,
ten_vat_tu varchar(30) not null
);
create table don_dat_hang_detail(
so_dh int not null,
ma_vat_tu int not null,
primary key ( so_dh , ma_vat_tu),
foreign key (so_dh) references don_dat_hang(so_dh),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);
create table phieu_xuat(
so_px int not null auto_increment primary key,
ngay_xuat date not null
);
create table phieu_xuat_detail(
don_gia_xuat float not null,
so_luong_xuat int not null,
so_px int not null,
ma_vat_tu int not null,
primary key (so_px, ma_vat_tu),
foreign key (so_px) references phieu_xuat(so_px),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);
create table phieu_nhap(
so_pn int not null auto_increment primary key,
ngay_nhap date not null
);
create table phieu_nhap_detail(
don_gia_nhap float not null,
so_luong_nhap int not null,
so_pn int not null,
ma_vat_tu int not null,
primary key (so_pn, ma_vat_tu),
foreign key (so_pn) references phieu_nhap (so_pn),
foreign key (ma_vat_tu) references vat_tu (ma_vat_tu)
);

