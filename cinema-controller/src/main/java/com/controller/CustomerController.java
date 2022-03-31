package com.controller;


import com.VO.ResponeVO;
import com.entity.Customer;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.service.CustomerService;
import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/customer")
public class CustomerController {
   @Resource
    private CustomerService service;

   @RequestMapping("/info")
    public ResponeVO getInfo(int id){
       Customer customerById = service.getCustomerById(id);
       if (customerById != null){
           return  new ResponeVO(400,"没有改用户信息",null);
       }
       return  new ResponeVO(200,"有该用户信息",customerById);
   }

   @RequestMapping("/update/info")
    public ResponeVO updateInfo( Customer customer){

       int i = service.updateCustomer(customer);
       if (i==0){
           return  new ResponeVO(400,"ERROR",null);
       }
       return  new ResponeVO(200,"succoer",i);
   }
   @RequestMapping("/allinfo")
    public ResponeVO getAllInfo(){
       List<Customer> all = service.all();
       if (all.isEmpty()){
           return  new ResponeVO(400,"",null);
       }
       return new ResponeVO(200,"",all);
   }
}
