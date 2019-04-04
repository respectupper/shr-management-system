--创建用户表
create table t_user(
user_id int primary key auto_increment,
user_phone varchar(11),
user_name nvarchar(8),
user_pwd varchar(15),
department_id int,
position_id int,
salary double,
create_date date,
update_date date,
foreign key(department_id) references t_department(department_id),
foreign key(position_id) references t_position(position_id)
);
--创建部门表
create  table t_department(
department_id int primary key auto_increment,
department_name nvarchar(10),
create_date date,
update_date date
);
--创建职位表
create table t_position(
position_id int primary key auto_increment,
department_id int,
position_name nvarchar(10),
create_date date,
update_date date,
foreign key(department_id) references t_department(department_id)
);
--创建奖惩记录表
create table t_rewards_and_penalties(
rap_id int primary key auto_inrement,
r_p int(1),
rap_details nvarchar(50),
user_id int,
rap_salary double,
create_date date,
update_date date,
foreign key(user_id) references t_user(user_id)
);
--创建培训表
create table t_train(
train_id int primary key auto_inrement,
train_details nvarchar(50),
user_id int,
create_date date,
update_date date,
foreign key(user_id) references t_user(user_id)
);
--创建培训用户对应表
create table t_user_train(
user_train_id int primary key auto_inrement,
train_id int,
user_id int,
create_date date,
update_date date,
foreign key(user_id) references t_user(user_id)
);
--创建考勤记录表
create table t_check_work_attendance_info(
cwai_id int primary key auto_inrement,
user_id int,
create_date date,
update_date date,
foreign key(user_id) references t_user(user_id)