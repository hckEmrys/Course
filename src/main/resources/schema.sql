create table student
(
id int primary key,
name varchar(100),
college varchar(100)
);


create table course
(
courseID int primary key,
courseName varchar(100) not null
);


create table course_student
(
id int not null,
courseID int not null,
primary key (id,courseID),
foreign key (id) references student(id) on DELETE CASCADE,
foreign key (courseID) references course(courseID) on DELETE CASCADE
);


create table review
(
reviewId int primary key,
review varchar(255) not null,
courseID int,
foreign key(courseID) References course(courseID) on Delete CASCADE
);


