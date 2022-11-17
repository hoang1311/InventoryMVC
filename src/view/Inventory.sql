DROP DATABASE IF EXISTS Inventory ;
CREATE DATABASE Inventory
go

use Inventory
go

DROP TABLE IF EXISTS employee ;
create table employee(
 username varchar(30) not null primary key,
 password varchar(30) not null,
)
insert into employee (username , password) values (
'admin' ,'123456'
)




DROP TABLE IF EXISTS category;
create table category (
id varchar(30) not null primary key,
name nvarchar(50) not null ,
)
insert into category(id , name) values (
'LZQ11' ,'Phone'
), ('LZQ12' ,'Laptop'), ('LZQ13' ,'Tivi')



DROP TABLE IF EXISTS product;
create table product(
id varchar(20) not null primary key,
name nvarchar(50) not null ,
quantity int not null,
category varchar(30) not null ,
price int not null 
)
insert into product(id , name , quantity, category , price) values (
'BZL10','Ihpone 14 Pro max' ,'1203','Phone',23
)

DROP TABLE IF EXISTS customer;
create table customer (
id varchar(20) not null primary key,
name nvarchar(50) not null ,
phone  int not null
)

insert into customer(id , name , phone) values (
'BZL10','Pham Ngoc Binh' ,0987654321
)


DROP TABLE IF EXISTS hoadonxuat
;
create table hoadonxuat(
id varchar(20) not null primary key,
cosId varchar(20) not null foreign key references customer(id),
createdAt date not null
)
insert into hoadonxuat(id , cosId , createdAt) values (
'BZL10','BZL10' ,'2008-11-11'
)



DROP TABLE IF EXISTS chitiethoadonxuat;
create table chitiethoadonxuat (
id varchar(20) not null primary key,
invoiceId varchar(20) not null foreign key references hoadonxuat(id)  ,
productId  varchar(20) not null foreign key references product(id),
amount int not null,
)
insert into chitiethoadonxuat(id , invoiceId , productId , amount) values (
'BZL','BZL10' ,'BZL10' , 3
)

DROP TABLE IF EXISTS supplier;
create table supplier (
id varchar(20) not null primary key,
name nvarchar(50) not null ,
phone  int 
)
insert into supplier(id , name , phone) values (
'BZL10','Pham Ngoc Binh' ,0987654321
)

create table hoadonnhap(
id varchar(20) not null primary key,
supplierId varchar(20) not null foreign key references supplier(id),
createdAt date not null
)
insert into hoadonnhap(id , supplierId , createdAt) values (
'BZL11','XXX' ,'2008-11-11'
)


DROP TABLE IF EXISTS chitiethoadonnhap;
create table chitiethoadonnhap (
id varchar(20) not null primary key,
invoiceId varchar(20) not null foreign key references hoadonnhap(id)  ,
productId  varchar(20) not null foreign key references product(id),
amount int not null,
)

insert into chitiethoadonnhap(id , invoiceId , productId, amount) values (
'BZL10','BZL10' ,'BZL10', 12
)

select * from hoadonnhap

delete from hoadonxuat join chitiethoadonxuat on  chitiethoadonxuat.invoiceId = hoadonxuat.id
where hoadonxuat.id='BZL10'