create database db7;
use db7;
create table BankMaster(Acno int primary key, Cname varchar(10) not null ,City varchar(40) default 'hyderabad' , Balance int not null , Branchcode int, foreign key (Branchcode) references Branchs(Branchcode));

create table Branchs(Branchcode int ,location varchar(10) not null ,primary key(Branchcode));

create table BankTransactions(Acno int ,Trantype char(1) , Trandate datetime not null ,Amt int not null);

insert into Branchs(Branchcode , location)
values (101 , 'Kalyan' ),
(102, 'Ulhasnagar' ),
(103, 'Nagpur' ),
(104, 'Bhopalwadi'),
(105, 'Pune');

insert into BankMaster(Acno ,Cname ,City ,Balance ,Branchcode)
values (10, 'Madhura' ,'Kalyan' ,5000,101 ),
(20, 'Prathamesh','Ulhasnagar', 8175, 102),
(30, 'Tanvi' ,'Thane', 40000,104),
(40, 'Vedant','Dombivali', 81500,102),
(50, 'Sekiro', 'Gamegaon', 5000, 101);

insert into  BankTransactions(Acno , Trantype, Trandate, Amt)
values(10 , 'w' , '12-06-2020' , '18:25:00',50000),
(20 , 'd' , '15-07-2020' , '19:00:00',70000),
(30 , 'w' , '17-06-2020' , '18:25:00',90000),
(20, 'd' , '12-08-2020' , '20:45:00',40000),
(10 , 'w' , '27-06-2020' , '21:25:00',69000);


/*
1)List the Bank Master details which customer have at least 30000 and
above?
*/

select * from BankMaster where Balance >=30000;

/*
2)List the All branchs,Bank Master details which branch have the
customers.
*/
select * from branchs, BankMaster where location in Cname;

/*
3)List the Bank master details which customer maximum no.of times
‘w’ transaction done.
*/

select * from BankTransactions where Trantype is 'w';

/*
4)Find the total bal based on branch code and which branch total bal
is above 100000 those branch,customer details.
*/

select * from Branchs where Branchcode >= 100000;

/*
5)To display all bankmaster details for given acno using ‘procedure’
*/

/*
6)To get all transaction details based on date wise.
*/
select * from BankTransactions where Trandate;

/*
7)To list the 3rd maximum balance customer details.
*/

select * from BankMaster where Balance = 69000;