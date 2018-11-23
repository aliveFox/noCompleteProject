package com.zwfu.fm.controller;

import com.alibaba.fastjson.JSONObject;
import com.zwfu.fm.bean.system.User;
import com.zwfu.fm.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户控制层
 *
 * @author LiSong
 * @date 2018/11/22 17:22
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getUser")
    public String getUser(){
        User user = userService.getUserById(1);
        return JSONObject.toJSONString(user);
    }

}
