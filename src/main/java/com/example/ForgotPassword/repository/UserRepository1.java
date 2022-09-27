package com.example.ForgotPassword.repository;

import com.example.ForgotPassword.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository1 extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
