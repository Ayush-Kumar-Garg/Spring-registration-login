package com.example.registration_login_project.registration_login_project.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration_login_project.registration_login_project.model.role;
import com.example.registration_login_project.registration_login_project.model.user;
import com.example.registration_login_project.registration_login_project.repository.userRepository;
import com.example.registration_login_project.registration_login_project.web.dto.userRegistrationDto;

@Service
public class userServiceImpl implements userService{

    @Autowired
    private userRepository userRepository;

    @Override
    public user save(userRegistrationDto registrationDto) {
       user user = new user(registrationDto.getFirstName(),
                             registrationDto.getLastName(),
                              registrationDto.getEmail(),
                               Arrays.asList(new role("user_role")));

        return userRepository.save(user);
    };
   
   
    


   
}
