package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/user") //use that to assign our main path
public class UserController {
    @Autowired //use to that remove container in service class and get that object
    private UserService userService;
    //data add the database

    @PutMapping(path="/reg-user")
    public String regUser(@RequestBody UserDTO userDTO){
        String msg=userService.userReg(userDTO);
        return "success full register";
    }
    //that method parameter is userDto type object
}
