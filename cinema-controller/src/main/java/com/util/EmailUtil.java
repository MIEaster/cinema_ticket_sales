package com.util;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class EmailUtil {
    public void send(String email,String vaule){
        HtmlEmail send=new HtmlEmail();
        try {
            send.setHostName("smtp.qq.com");
            send.setSmtpPort(456);
            send.setCharset("UTF-8");
            send.addTo(email);
            send.setFrom("2206106986@qq.com","验证码服务");
            send.setAuthentication("2206106986@qq.com","mthdhunridtrdihg");
            send.setSubject("验证码：");
            send.setMsg(vaule);
            send.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }

    }
}
