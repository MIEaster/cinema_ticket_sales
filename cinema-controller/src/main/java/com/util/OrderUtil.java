package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderUtil {
    public String OrderId(){
        Date newTime = new Date();
        //设置时间格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddhhmmss");
        //获取的时间，是本机的时间
        String formatDate1 = sdf1.format(newTime);
        String orderId=formatDate1 + (int)((Math.random()*9+1)*10000000);
        return orderId;
    }
}
