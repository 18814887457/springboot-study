package com.zola.studyexception.controller;

import com.zola.studyexception.entity.User;
import com.zola.studyexception.exception.BizException;
import com.zola.studyexception.utils.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/index")
public class IndexController {


    @GetMapping("/index")
    public AjaxResult test(){

        User user = new User();

        if(user.getUsername() == null) {
            throw new NullPointerException();
        }

        System.out.println(user.getUsername());


        return AjaxResult.error("ssss");
    }
}
