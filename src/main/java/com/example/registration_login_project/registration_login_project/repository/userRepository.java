package com.example.registration_login_project.registration_login_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registration_login_project.registration_login_project.model.user;

public interface userRepository extends JpaRepository<user, Long> {
    
}
