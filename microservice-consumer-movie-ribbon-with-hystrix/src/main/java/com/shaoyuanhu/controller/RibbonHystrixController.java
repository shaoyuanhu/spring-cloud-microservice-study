package com.shaoyuanhu.controller;

import com.shaoyuanhu.pojo.User;
import com.shaoyuanhu.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: ShaoYuanHu
 * @Date: Created in 2018-01-16
 */
@RestController
public class RibbonHystrixController {

    @Autowired
    private RibbonHystrixService ribbonHystrixService;

    @RequestMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id){
        return ribbonHystrixService.findById(id);
    }

}
