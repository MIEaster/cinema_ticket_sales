# cinema_ticket_sales

## 用户表

```mysql
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
```



## 管理员表

```mysql
-- drop table `administrator`
create table `administrator`
(
    `admin_id`       int(11) primary key auto_increment comment '管理id',
    `admin_name`     varchar(20) not null comment '管理用户名',
    `admin_password` varchar(22) not null comment '管理用户密码',
    `admin_role`     int(1) comment '管理权限'
) CHARACTER SET = UTF8mb4 comment '管理员表'
  auto_increment = 100;
```



## 余票表

```mysql
-- drop table remaining_tickets; 
create table `remaining_tickets`
(
    `remaining_id`    int(11) primary key auto_increment comment '余票ID',
    `movie_name`      nvarchar(50) not null comment '片名',
    `screening_time`  datetime     not null comment '片映时间',
    `movie_duration`  float(3, 2)  not null comment '影片时长',
    `playback_room`   nvarchar(20) not null comment '播放厅',
    `seats_remaining` nvarchar(20) not null comment '座位余数',
    `fare`            float(4, 2)  not null comment '票价',
    `remaining_votes` int(11)      not null comment '余票数'
) CHARACTER SET = UTF8mb4 comment '余票表'
  auto_increment = 121200;
```



## 售票表

```mysql
-- drop table  ticketing;
create table `ticketing`
(
    `ticketing_id`   int(11) primary key auto_increment comment '售票ID',
    `movie_name`     nvarchar(50) not null comment '片名',
    `release_time`   datetime     not null comment '上映时间',
    `movie_duration` float(3, 2)  not null comment '影片时长',
    `playback_room`  nvarchar(20) not null comment '播放厅',
    `seats`          nvarchar(20) not null comment '座位余数',
    `fare`           float(4, 2)  not null comment '票价',
    `Arrival`        float(4, 2)  not null comment '实收',
    `change`         float(4, 2) comment '找零',
    `ticketing_date` datetime DEFAULT CURRENT_TIMESTAMP comment '售票时间',
    `tickets_sold`   int(11) comment '售票数(售出)'
) CHARACTER SET = UTF8mb4 comment '售票表'
  auto_increment = 131300;
```



## 退票

```mysql
-- drop table  ticket_refund
create table `ticket_refund`
(
    `refund_id`      int(11) primary key auto_increment comment '退票ID',
    `movie_name`     nvarchar(50) not null comment '片名',
    `screening_time` datetime     not null comment '片映时间',
    `fare`           float(4, 2)  not null comment '票价',
    `ticketing_date` datetime comment '售票时间',
    `Commission`     float(4, 2) default 0.00 comment '手续费',
    `Actual Refund`  float(4, 2)  not null comment '实退金额'
) CHARACTER SET = UTF8mb4 comment '退票表'
  auto_increment = 141400;
```



## 订单表

```mysql
-- drop table orders;
create table `orders`
(
    `orders_id`   int(11) primary key auto_increment comment '订单ID',
    `customer_id` int(11) not null comment '用户ID',
    `movie_id`    int(11) not null comment '影片id',
    `playback_id` int(11) not null comment '播放厅id'
) CHARACTER SET = UTF8mb4 comment '订单表'
  auto_increment = 151500;
```



## 电影票总表

```mysql
-- drop table total_sales;
create table `total_sales`
(
    `sales_id`       int(11) primary key auto_increment comment '总售表ID',
    `movie_name`     nvarchar(50) not null comment '片名',
    `screening_time` datetime     not null comment '片映时间',
    `playback_room`  nvarchar(20) not null comment '播放厅',
    `seats_taken`    int(11) comment '落座数',
    `fare`           float(4, 2)  not null comment '票价',
    `all_count`      int(11) comment '总票数',
    `movie_duration` float(3, 2)  not null comment '影片时长'
) CHARACTER SET = UTF8mb4 comment '电影票总售表'
  auto_increment = 161600;
```



## 订单细节表

```mysql
-- drop table  order_details
create table `order_details`
(
    `details_id`      int(11) primary key auto_increment comment '订单细节ID',
    `orders_id`       int(11) comment '订单ID',
    `screening_time`  datetime     not null comment '片映时间',
    `playback_room`   nvarchar(20) not null comment '播放厅',
    `seats`           nvarchar(20) not null comment '座位',
    `fare`            float(4, 2)  not null comment '票价',
    `Commission`      float(4, 2) default 0.00 comment '手续费',
    `ticketing_time`  datetime comment '售票时间',
    `extraction_time` datetime comment '取票时间'
) CHARACTER SET = UTF8mb4 comment '订单细节表'
  auto_increment = 151600;

```



## 电影院地址表

```mysql
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
```



## 电影院播放厅使用状态表

```mysql
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
```



## 拍片表

```mysql
-- drop table scheduling;
create table `scheduling`
(
    `scheduling_id` int(11) primary key auto_increment comment '排片ID',
    `room_id`       int(11)     not null comment '播放厅id',
    `start_time`    datetime comment '开始播放影片时间',
    `end_time`      datetime comment '结束影片播放时间',
    `fare`          float(4, 2) not null comment '票价'
) CHARACTER SET = UTF8mb4 comment '排片表'
  auto_increment = 181800;
```



## 座位表

```mysql
-- drop table  seats;
create table `seats`
(
    `seats_id`   int(11) primary key auto_increment comment '座位id',
    `room_id`    int(11) not null comment '播放厅id',
    `rows_count` int(11) comment '行数',
    `col_count`  int(11) comment '列数'
) CHARACTER SET = UTF8mb4 comment '座位表'
  auto_increment = 202000;

```



## 电影表

```mysql
-- drop table movie;
create table `movie`
(
    `movie_id`       int(11) primary key auto_increment comment '电影id',
    `movie_name`     nvarchar(50) not null comment '片名',
    `type`           nvarchar(255) comment '类型',
    `movie_duration` float(3, 2)  not null comment '影片时长',
    `actors`         nvarchar(20) not null comment '演员',
    `director`       nvarchar(20) not null comment '导演',
    `Rating`         int(2) comment '评分(1~10)',
    `poster`         nvarchar(255) comment '海报'
) CHARACTER SET = UTF8mb4 comment '电影表'
  auto_increment = 191900;
```

