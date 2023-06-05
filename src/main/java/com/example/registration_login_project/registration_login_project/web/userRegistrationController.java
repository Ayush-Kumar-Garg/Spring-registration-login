package com.example.registration_login_project.registration_login_project.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.registration_login_project.registration_login_project.service.userService;
import com.example.registration_login_project.registration_login_project.web.dto.userRegistrationDto;


@Controller
@RequestMapping("/registration")
public class userRegistrationController {
    
    @Autowired
    private userService userService;

    @ModelAttribute("user")
    public userRegistrationDto userRegistrationDto(){
        return new userRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String regiterUserAccount(@ModelAttribute("user") userRegistrationDto registrationDto){
        userService.save(registrationDto);
        return "return:/registration?succes";
    }
}
