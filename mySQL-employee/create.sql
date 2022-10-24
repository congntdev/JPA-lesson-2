create database employees;

create table employees.employee (
id int auto_increment primary key,
full_name varchar(255) not null,
position varchar(255),
check_in datetime,
check_out datetime,
created_at datetime,
updated_at datetime)