
use employee;

create table emp_pd(p_id int primary key auto_increment, name varchar(50),DOB date, mobile1 varchar(10),email varchar(30), aadhaar varchar(12),pan varchar(10));

insert into emp_pd values(null, 'pooja','2003-08-29','9876543210','pooja@gamil.com','876545123409','PRJ8765432');

insert into emp_pd values(null, 'prutha','2010-11-30','9346543210','prutha@gamil.com','812345123409','PRJ9765432');

select * from emp_pd;

drop table emp_pay;

create table emp_contact(id int primary key auto_increment,p_id int references emp_pd(p_id), mobile2 varchar(10), email2 varchar(30));


create table emp_communication(id int primary key auto_increment,p_id int references emp_pd(p_id), address1 varchar(200), address2 varchar(200));

create table emp_register(id int primary key auto_increment,p_id int references emp_pd(p_id), DoJ date, dpt varchar(30),post varchar(30));

create table emp_department(id int primary key auto_increment,p_id int references emp_pd(p_id), d_name varchar(30), location varchar(100));

create table emp_payroll(id int primary key auto_increment,p_id int references emp_pd(p_id), post varchar(30), salary int,emp_name varchar(30));

insert into emp_contact values(null,1,'8976543220','poojarj@gmail.com')

insert into emp_contact values(null,3,'8546543220','prutharjj@gmail.com')

insert into emp_communication values(null,1,'afaufeb  csfsug9b uffuh','bxf gcugwiuegf jbv ie')

insert into emp_communication values(null,3,'kenivervbu yyecyuc ubcue','ndjv vievneniv eejnierjbre')

insert into emp_register values(null,1,'2010-06-11','software development','project head')

insert into emp_register values(null,3,'2014-11-11','software development','head')

insert into emp_department values(null,1,'software','mumbai')

insert into emp_department values(null,3,'software','delhi')

insert into emp_payroll values(null,1,'project head',50000.00,'pooja')

insert into emp_payroll values(null,3,'head',80000.00,'prutha')

create table emp_payroll(id int primary key auto_increment,p_id int references emp_pd(p_id), post varchar(30), salary float(7),emp_name varchar(30));

drop table emp_payroll;

select * from emp_contact

select * from emp_contact

delete from emp_pd where p_id=2

select * from emp_communication

insert into emp_pd values(null, 'priti','2000-10-06','8766543210','priti@gamil.com','873448763409','PRJ8032432');

insert into emp_contact values(null,3,'8974543220','pritirj@gmail.com')

select * from emp_pd as p JOIN emp_contact as c ON p.p_id=c.id JOIN emp_communication as m ON p.p_id=m.id JOIN emp_register as r ON p.p_id=r.id JOIN emp_department as d ON p.p_id=d.id JOIN emp_payroll as q ON p.p_id=q.id;


