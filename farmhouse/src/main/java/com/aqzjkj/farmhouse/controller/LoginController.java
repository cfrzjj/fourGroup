package com.aqzjkj.farmhouse.controller;

import com.aqzjkj.farmhouse.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(@RequestBody User user){
        String username = "";
        String password = "";
        if(user != null){
             username = user.getUsername();
             password = user.getPassword();
        }
        return password;
//        String p = password;

    }
}
