
create database Tpitest;
use Tpitest;


create TABLE Employer
(
	ID int auto_increment,
    Username varchar(30) not null,
    Title varchar(30) not null,
    Department varchar(30) not null,
    salary decimal,
    primary key(id)
);
insert into Employer values(null,'Long','Staff','CNTT',1000000);
insert into Employer values(null,'Minh','Teacher','Math',9000000);
insert into Employer values(null,'Viet','Worker','engine',999999);
select from Employer;