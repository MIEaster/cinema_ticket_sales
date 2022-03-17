-- 创建数据库表
create database `cinema_ticket_sales`;

use cinema_ticket_sales;

-- drop table `customer`;
create table `customer`
(
    `customer_id`       int(11) primary key auto_increment comment '用户ID',
    `customer_name`     nvarchar(50) not null comment '用户名称',
    `customer_password` nvarchar(50) not null comment '用户密码',
    `customer_phone`    nvarchar(11) comment '用户电话',
    `customer_email`    nvarchar(50) comment '用户邮箱',
    `customer_Status`   int(1)   default 1 comment '用户状态(0:表示禁用,1:表示使用中)',
    `create_time`       datetime DEFAULT CURRENT_TIMESTAMP comment '自动创建时间',
    `update_time`       datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '自动修改时间'
) CHARACTER SET = UTF8mb4 comment '用户表'
  auto_increment = 111100;

insert into customer(customer_name, customer_password, customer_phone, customer_email, customer_Status)
VALUES ('钟灿贵', '123456', 17770733641, '17770733641@qq.com', 1);


insert into customer(customer_name, customer_password, customer_phone, customer_email, customer_Status)
VALUES ('zcc', '123456', 17770733642, '17770733642@qq.com', 1);
insert into customer(customer_name, customer_password, customer_phone, customer_email, customer_Status)
VALUES ('zcd', '123456', 17770733643, '17770733643@qq.com', 0);

select *
from customer;

-- drop table `administrator`
create table `administrator`
(
    `admin_id`       int(11) primary key auto_increment comment '管理id',
    `admin_name`     varchar(20) not null comment '管理用户名',
    `admin_password` varchar(22) not null comment '管理用户密码',
    `admin_role`     int(1) comment '管理权限'
) CHARACTER SET = UTF8mb4 comment '管理员表'
  auto_increment = 100;

insert into administrator(admin_name, admin_password, admin_role)
VALUES ('czf', '123456', '1'),
       ('ljq', '123456', '2'),
       ('hyd', '123456', '2'),
       ('zcc', '123456', '2');

select *
from administrator;

-- drop table remaining_tickets;
create table `remaining_tickets`
(
    `remaining_id`    int(11) primary key auto_increment comment '余票ID',
    `movie_name`      nvarchar(50) not null comment '片名',
    `screening_time`  datetime     not null comment '片映时间',
    `movie_duration`  float(8, 2)  not null comment '影片时长',
    `cinema_name`     nvarchar(50) not null comment '电影院名字',
    `playback_room`   nvarchar(20) not null comment '播放厅',
    `fare`            float(8, 2)  not null comment '票 价',
    `remaining_seats` int(11)      not null comment '剩余座位'
) CHARACTER SET = UTF8mb4 comment '余票表'
  auto_increment = 121200;

insert into remaining_tickets(movie_name, screening_time, movie_duration, cinema_name, playback_room, fare,
                              remaining_seats)
VALUES ('雄狮少年', '2022-03-12 08:00:00', 104.00, '海上影城(格力海岸店)', '01', 50.00, 60);


-- drop table  ticket_refund
create table `ticket_refund`
(
    `refund_id`      int(11) primary key auto_increment comment '退票ID',
    `details_id`     int(11)      not null comment '订单ID',
    `customer_name`  nvarchar(50) not null comment '用户名称',
    `movie_name`     nvarchar(50) not null comment '片名',
    `screening_time` datetime     not null comment '片映时间',
    `cinema_name`    nvarchar(50) not null comment '电影院名字',
    `playback_room`  nvarchar(20) not null comment '播放厅',
    `seats`          nvarchar(20) not null comment '座位',
    `fare`           float(4, 2)  not null comment '票价',
    `ticketing_date` datetime    DEFAULT CURRENT_TIMESTAMP comment '退票时间',
    `commission`     float(4, 2) default 0.00 comment '手续费',
    `actual_refund`  float(4, 2)  not null comment '实退金额'
) CHARACTER SET = UTF8mb4 comment '退票表'
  auto_increment = 141400;

insert into ticket_refund(details_id, customer_name, movie_name, screening_time, cinema_name, playback_room, seats,
                          fare, actual_refund)
values (151600, '钟灿贵', '雄狮少年', '2022-03-12 08:00:00', '海上影城(格力海岸店)', '01', '1', 50, 50);

select *
from ticket_refund;

-- drop table orders;
/*create table `orders`
(
    `orders_id`   int(11) primary key auto_increment comment '订单ID',
    `customer_id` int(11) not null comment '用户ID',
    `movie_id`    int(11) not null comment '影片id',
    `playback_id` int(11) not null comment '播放厅id'
) CHARACTER SET = UTF8mb4 comment '订单表'
  auto_increment = 151500;

insert into orders(customer_id, movie_id, playback_id)
VALUES (111100, 191900, 171800);*/

-- drop table  order_details
create table `order_details`
(
    `details_id`      int(11) primary key auto_increment comment '订单细节ID',
    `customer_name`   nvarchar(50) not null comment '用户名称',
    `movie_name`      nvarchar(50) not null comment '电影名称',
    `screening_time`  datetime     not null comment '片映时间',
    `cinema_name`     nvarchar(50) not null comment '电影院名字',
    `playback_room`   nvarchar(20) not null comment '播放厅',
    `seats`           nvarchar(20) not null comment '座位',
    `fare`            float(8, 2)  not null comment '票价',
    `Commission`      float(8, 2) default 0.00 comment '手续费',
    `ticketing_time`  datetime    DEFAULT CURRENT_TIMESTAMP comment '售票时间',
    `extraction_time` datetime comment '取票时间'
) CHARACTER SET = UTF8mb4 comment '订单细节表'
  auto_increment = 151600;

insert into order_details(customer_name, movie_name, screening_time, cinema_name, playback_room, seats, fare)
VALUES ('钟灿贵', '雄狮少年', '2022-03-12 08:00:00', '海上影城(格力海岸店)', '01', '1', 50.00);

select *
from order_details;

-- drop table total_sales;
create table `total_sales`
(
    `sales_id`       int(11) primary key auto_increment comment '总售表ID',
    `movie_name`     nvarchar(50) not null comment '片名',
    `screening_time` datetime     not null comment '片映时间',
    `cinema_name`    nvarchar(50) not null comment '电影院名字',
    `playback_room`  nvarchar(20) not null comment '播放厅',
    `seats_taken`    int(11) comment '落座数',
    `fare`           float(8, 2)  not null comment '票价',
    `all_count`      int(11) comment '总票数',
    `movie_duration` float(8, 2)  not null comment '影片时长'
) CHARACTER SET = UTF8mb4 comment '电影票总售表'
  auto_increment = 161600;

insert into total_sales(movie_name, screening_time, cinema_name, playback_room, seats_taken, fare, all_count,
                        movie_duration)
VALUES ('雄狮少年', '2022-03-12 08:00:00', '海上影城(格力海岸店)', '01', 1, 50.00, 1, 104.00);


-- drop table cinema_address
create table `cinema_address`
(
    `cinema_id`     int(11) primary key auto_increment comment '电影院id',
    `cinema_name`   nvarchar(50)  not null comment '电影院名字',
    `address`       nvarchar(255) not null comment '电影院地址',
    `cinema_phone`  nvarchar(50) comment '电影院联系电话',
    `cinema_status` int(1) default 1 comment '使用状态(0:表示禁用,1:表示使用中)'
) CHARACTER SET = UTF8mb4 comment '电影院地址表'
  auto_increment = 171700;

insert into cinema_address(cinema_name, address, cinema_phone, cinema_status)
VALUES ('海上影城(格力海岸店)', '香洲区情侣北路格力海岸商业街1号4层', null, 1);

/*       ('中影Face电影城(夏湾店)', '香洲区夏湾路184号-194号综合楼3、4楼(夏湾市场旁)', null, 1),
       ('国艺都会影城', '香洲区昌盛路376号华发新天地商业街2101铺', null, 1),
       ('环球星梦国际影城', '香洲区唐家湾唐家湾镇金鼎金峰中路15号(金鼎商业城2楼)', null, 1),
       ('诚丰影城(香洲店)', '香洲区童心路18号(青少年妇女儿童活动中心科技楼)', null, 1);
*/
select *
from cinema_address;

-- drop table  cinema_room;
create table `cinema_room`
(
    `room_id`       int(11) primary key auto_increment comment '播放厅id',
    `cinema_id`     int(11) comment '电影院id',
    `playback_room` nvarchar(20) not null comment '播放厅',
    `room_status`   int(1) default 1 comment '使用状态(0:表示禁用,1:表示使用中)',
    `total_seats`   int(11)      not null comment '总座位数'
) CHARACTER SET = UTF8mb4 comment '电影院播放厅使用状态表'
  auto_increment = 171800;

insert into cinema_room (cinema_id, playback_room, room_status, total_seats)
VALUES (171700, '01', 1, 60),
       (171700, '02', 1, 45),
       (171700, '03', 1, 60);



select *
from cinema_room;

-- drop table scheduling;
create table `scheduling`
(
    `scheduling_id` int(11) primary key auto_increment comment '排片ID',
    `room_id`       int(11)      not null comment '播放厅id',
    `movie_name`    nvarchar(50) not null comment '片名',
    `start_time`    datetime comment '开始播放影片时间',
    `end_time`      datetime comment '结束影片播放时间',
    `fare`          float(8, 2)  not null comment '票价'
) CHARACTER SET = UTF8mb4 comment '排片表'
  auto_increment = 181800;

insert into scheduling(room_id, movie_name, start_time, end_time, fare)
VALUES (171800, '雄狮少年', '2022-03-12 08:00:00', '2020-03-12 10:04:00', 50.00);

select *
from scheduling;

-- drop table movie;
create table `movie`
(
    `movie_id`       int(11) primary key auto_increment comment '电影id',
    `movie_name`     nvarchar(50)  not null comment '片名',
    `type`           nvarchar(255) comment '类型',
    `movie_duration` float(8, 2)   not null comment '片长',
    `actors`         nvarchar(255) not null comment '演员',
    `director`       nvarchar(255) not null comment '导演',
    `screenwriter`   nvarchar(255) not null comment '编剧',
    `release_date`   date          not null comment '上映日期',
    `Rating`         int(2) comment '评分(1~10)',
    `poster`         nvarchar(255) comment '海报'
) CHARACTER SET = UTF8mb4 comment '电影表'
  auto_increment = 191900;

insert into movie(movie_name, type, movie_duration, actors, director, screenwriter, release_date, Rating, poster)
VALUES ('雄狮少年', '剧情,喜剧,动画', 104.00, '大昕,大雄,郭皓,李盟,李佳思,蔡壮壮', '孙海鹏', '里则林',
        '2021-12-17', null, null);

select *
from movie;


-- drop table type;
create table `type`
(
    `type_id`   int(11) primary key auto_increment comment '类型',
    `type_name` nvarchar(255) comment '类型名'
) CHARACTER SET = UTF8mb4 comment '类型'
  auto_increment = 212100;

insert into type(type_name)
values ('剧情'),
       ('喜剧'),
       ('动画');

select *
from type;
-- drop table  seats;
create table `seats`
(
    `seats_id` int(11) primary key auto_increment comment '座位id',
    `room_id`  int(11)       not null comment '播放厅id',
    `seat_num` nvarchar(255) not null comment '座位数'
) CHARACTER SET = UTF8mb4 comment '座位表'
  auto_increment = 202000;

insert into seats(room_id, seat_num)
values (171800, 1)
