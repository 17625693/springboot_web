create database db_product default charset utf8;
use db_product;
create table products(pid int not null primary key auto_increment,pname varchar(200),type varchar(50),price double,create_time timestamp);