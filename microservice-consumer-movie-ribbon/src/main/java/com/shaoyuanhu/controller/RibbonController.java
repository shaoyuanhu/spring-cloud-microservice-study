package com.shaoyuanhu.controller;

import com.shaoyuanhu.pojo.User;
import com.shaoyuanhu.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: ShaoYuanHu
 * @Date: Created in 2018-01-15
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id){
        return ribbonService.findById(id);
    }


}
