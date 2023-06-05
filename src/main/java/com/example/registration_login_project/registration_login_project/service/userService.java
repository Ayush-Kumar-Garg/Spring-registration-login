package com.example.registration_login_project.registration_login_project.service;

import com.example.registration_login_project.registration_login_project.model.user;
import com.example.registration_login_project.registration_login_project.web.dto.userRegistrationDto;

public interface userService {
   user save(userRegistrationDto registrationDto);
}
