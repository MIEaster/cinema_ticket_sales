package com.controller;

import com.VO.ResponeVO;
import com.VO.request.AddUserVO;
import com.entity.Customer;
import com.service.CustomerService;
import com.service.SmsService;
import com.util.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private CustomerService userService;
    @Autowired
    private SmsService smsService;

    @RequestMapping("/code")
    @ResponseBody
    public ResponeVO code(String email){
        String code = smsService.generateCode();
        EmailUtil emailUtil = new EmailUtil();
        emailUtil.send(email, code);
        System.out.println("code:========: " + code);
        return new ResponeVO(200, "ok", code);
    }

    @RequestMapping("/add")
    @ResponseBody
    public ResponeVO adduser(@RequestBody AddUserVO vo, String code){
        boolean validCode;
        System.out.println(code);
        System.out.println(vo);
        validCode = smsService.checkCode(code);
        System.out.println(validCode);
        if(validCode){
            Customer email = userService.getEmail(vo.getUserEmail());
            if(email==null){
                boolean b = userService.insertUser(vo);
                return new ResponseVO(200,"ok",b);
            }else {
                return new ResponseVO(404,"error","已存在用户："+email);
            }
        }else {
            return new ResponseVO(404,"error","重新获取验证码");
        }

    }

}
