package com.guli.gmall.user.controller;

import com.guli.gmall.user.bean.beanUserInfo;
import com.guli.gmall.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    // 方法返回值，方法的传入参数！
//    @RequestMapping("findAll")
//    public String findAll(){
//          userInfoService.findAll();
//        // list.html
//        return "list";
//    }
    @RequestMapping("findAll")
    @ResponseBody // @ResponseBody 返回json 字符串， 还可以将数据直接显示到页面！
    public List<beanUserInfo> findAll(){
        // list.html
        return userInfoService.findAll();
    }

}

