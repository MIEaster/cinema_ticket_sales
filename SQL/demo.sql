use demo;

create table order_info(
  order_id varchar(50) primary key,
  order_status tinyint(1) not null, -- 0:取消订单 1:未⽀付 2:已⽀付
  order_message varchar(100)
);