/*
create database javaiii;

CREATE USER 'yevoli'@'localhost' IDENTIFIED BY 'yevoli123';

GRANT ALL ON javaiii.* TO 'yevoli'@'localhost' IDENTIFIED BY 'yevoli123';
*/
use javaiii;

create table employee (
id int AUTO_INCREMENT not null,
username nvarchar(70) not null,
password nvarchar(70) not null,
first_name varchar(70) not null,
last_name nvarchar(70) not null,
address nvarchar(200) null,
city nvarchar(70) null,
province nvarchar(70) null,
postal_code nvarchar(70) null,
email nvarchar(70) not null,
phone_number nvarchar(70) null,
social_media_url nvarchar(200) null,
is_deleted bit not null default false,
PRIMARY KEY (id),
UNIQUE (username),
UNIQUE (id)
);

create table employer (
id int AUTO_INCREMENT not null,
username nvarchar(70) not null,
password nvarchar(70) not null,
company_name nvarchar(70) not null,
contact_name varchar(70) not null,
address nvarchar(200) null,
city nvarchar(70) null,
province nvarchar(70) null,
email nvarchar(70) not null,
phone_number nvarchar(70) null,
is_deleted bit not null default false,
PRIMARY KEY (id),
UNIQUE (company_name),
UNIQUE (username),
UNIQUE (id)
);

create table language (
iso_code nvarchar(3) not null,
language_name nvarchar(30) not null,
PRIMARY KEY (iso_code),
UNIQUE (iso_code)
);

create table programming_language (
id int AUTO_INCREMENT not null,
programming_language nvarchar(20) not null,
PRIMARY KEY (id),
UNIQUE (id)
); /* has multiple frameworks*/

create table framework (
id int AUTO_INCREMENT not null,
framework nvarchar(40) not null,
programming_language_id int not null,
PRIMARY KEY (id),
FOREIGN KEY (programming_language_id) REFERENCES programming_language (id),
UNIQUE (id)
);

create table field (
id int AUTO_INCREMENT not null,
field nvarchar(50) not null,
PRIMARY KEY (id),
UNIQUE (id)
);

create table interest (
id int AUTO_INCREMENT not null,
interest nvarchar(50) not null,
PRIMARY KEY (id),
UNIQUE (id)
);

create table education (
id int AUTO_INCREMENT not null,
employee_id int not null,
degree_name nvarchar(100) not null,
designation nvarchar(50) not null,
school_name nvarchar(150) not null,
start_date datetime not null,
end_date datetime not null,
is_deleted bit not null default false,
FOREIGN KEY (employee_id) REFERENCES employee (id),
PRIMARY KEY (id),
UNIQUE (id)
);

create table experience (
id int AUTO_INCREMENT not null,
employee_id int not null,
company nvarchar(70) not null,
title nvarchar(100) not null,
description nvarchar(500) null,
start_date datetime not null,
end_date datetime not null,
FOREIGN KEY (employee_id) REFERENCES employee (id),
PRIMARY KEY (id),
UNIQUE (id)
); /*field, programming languages, language*/


create table employee_programming_language (
id int AUTO_INCREMENT not null,
employee_id int not null,
programming_language_id int not null,
FOREIGN KEY (employee_id) REFERENCES employee (id),
FOREIGN KEY (programming_language_id) REFERENCES programming_language (id),
PRIMARY KEY (id),
UNIQUE (id)
);

create table employee_language (
id int AUTO_INCREMENT not null,
employee_id int not null,
iso_code nvarchar(3) not null,
FOREIGN KEY (employee_id) REFERENCES employee (id),
FOREIGN KEY (iso_code) REFERENCES language (iso_code),
PRIMARY KEY (id),
UNIQUE (id)
);

create table experience_language (
id int AUTO_INCREMENT not null,
experience_id int not null,
language_code nvarchar(3) not null,
FOREIGN KEY (experience_id) REFERENCES experience (id),
FOREIGN KEY (language_code) REFERENCES language (iso_code),
PRIMARY KEY (id),
UNIQUE (id)
);

create table experience_programming_language (
id int AUTO_INCREMENT not null,
experience_id int not null,
programming_language_id int not null,
FOREIGN KEY (experience_id) REFERENCES experience (id),
FOREIGN KEY (programming_language_id) REFERENCES programming_language (id),
PRIMARY KEY (id),
UNIQUE (id)
);

create table experience_field (
id int AUTO_INCREMENT not null,
experience_id int not null,
field_id int not null,
FOREIGN KEY (experience_id) REFERENCES experience (id),
FOREIGN KEY (field_id) REFERENCES field (id),
PRIMARY KEY (id),
UNIQUE (id)
);

create table job_posting (
id int AUTO_INCREMENT not null,
employer_id int not null,
company_name nvarchar(70) not null,
job_title nvarchar(100) not null,
job_description nvarchar(500) not null,
years_of_experience int null, 
start_date datetime null,
end_date datetime null,
is_deleted bit not null default false,
PRIMARY KEY (id),
FOREIGN KEY (employer_id) REFERENCES employer (id),
UNIQUE (id)
); /* languages, programming languages, field */

/*INT TABLE: Job postings - Languages*/
create table job_posting_language (
id int AUTO_INCREMENT not null,
job_posting_id int not null,
language_code nvarchar(3) not null,
FOREIGN KEY (job_posting_id) REFERENCES job_posting (id),
FOREIGN KEY (language_code) REFERENCES language (iso_code),
PRIMARY KEY (id),
UNIQUE (id)
);

create table job_posting_programming_language (
id int AUTO_INCREMENT not null,
job_posting_id int not null,
programming_language_id int not null,
FOREIGN KEY (job_posting_id) REFERENCES job_posting (id),
FOREIGN KEY (programming_language_id) REFERENCES programming_language (id),
PRIMARY KEY (id),
UNIQUE (id)
);

create table job_posting_field (
id int AUTO_INCREMENT not null,
job_posting_id int not null,
field_id int not null,
FOREIGN KEY (job_posting_id) REFERENCES job_posting (id),
FOREIGN KEY (field_id) REFERENCES field (id),
PRIMARY KEY (id),
UNIQUE (id)
);


create table job_search (
id int AUTO_INCREMENT not null,
employee_id int not null,
job_title nvarchar(100) not null,
is_deleted bit not null default false,
FOREIGN KEY (employee_id) REFERENCES employee (id),
PRIMARY KEY (id),
UNIQUE (id)
); /* languages, programming languages, field */

/*INT TABLE: Job search - Languages*/
create table job_search_language (
id int AUTO_INCREMENT not null,
job_search_id int not null,
language_code nvarchar(3) not null,
FOREIGN KEY (job_search_id) REFERENCES job_search (id),
FOREIGN KEY (language_code) REFERENCES language (iso_code),
PRIMARY KEY (id),
UNIQUE (id)
);

create table job_search_programming_language (
id int AUTO_INCREMENT not null,
job_search_id int not null,
programming_language_id int not null,
FOREIGN KEY (job_search_id) REFERENCES job_search (id),
FOREIGN KEY (programming_language_id) REFERENCES programming_language (id),
PRIMARY KEY (id),
UNIQUE (id)
);

create table job_search_field (
id int AUTO_INCREMENT not null,
job_search_id int not null,
field_id int not null,
FOREIGN KEY (job_search_id) REFERENCES job_search (id),
FOREIGN KEY (field_id) REFERENCES field (id),
PRIMARY KEY (id),
UNIQUE (id)
);

/*
use javaiii;
drop table job_search_field;
drop table job_search_programming_language;
drop table job_search_language;
drop table job_search;
drop table job_posting_field;
drop table job_posting_programming_language;
drop table job_posting_language;
drop table job_posting;
drop table experience_field;
drop table experience_programming_language;
drop table experience_language;
drop table employee_language;
drop table employee_programming_language;
drop table experience;
drop table education;
drop table interest;
drop table field;
drop table framework;
drop table programming_language;
drop table language;
drop table employer;
drop table employee;