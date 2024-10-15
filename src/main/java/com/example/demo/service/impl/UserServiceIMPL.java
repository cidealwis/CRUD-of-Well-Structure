package com.example.demo.service.impl;

import com.example.demo.Entity.UserEntity;
import com.example.demo.dto.UserDTO;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //assign that service and put the container that UserServiceIMPL
public class UserServiceIMPL implements UserService {
    @Autowired
    private UserRepo userRepo; //access database
    @Override
    public String userReg(UserDTO userDTO) {
        if(!userRepo.existsByEmail(userDTO.getEmail())){
            // convert DTO to --> Entity
            UserEntity user=new UserEntity(
                    userDTO.getUserName(),
                    userDTO.getEmail()
            );
            userRepo.save(user); //save the database
            return "user save success fully";
        }else {
           return "User is all ready exists";
        }

    }
}
