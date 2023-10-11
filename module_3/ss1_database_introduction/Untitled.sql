create database demo;

use demo;

create table student(
 id int primary key auto_increment,
 name varchar(200),
 age int,
 country varchar(50)
);
create table class(
id int primary key auto_increment,
name varchar(200)
);
create table teacher(
id int primary key auto_increment,
name varchar(200),
 age int,
 country varchar(50)
);
insert into student value(1,"Hữu",25,"Việt Nam");
select* from student;
insert into class value(1,"C0723G1");
insert into teacher value(1,"Huu",25,"VietNam");
update teacher set name = "Thuận" where id = 1;
select* from teacher;

