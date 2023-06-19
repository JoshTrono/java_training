package com.revature.TaskManager.service;

import com.revature.TaskManager.config.GlobalExceptionHandler;
import com.revature.TaskManager.dto.UserDTO;
import com.revature.TaskManager.entity.Users;
import lombok.RequiredArgsConstructor;
import com.revature.TaskManager.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Cacheable("users")
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
    public Users saveUser(UserDTO user) {
        Users usertoSave = new Users();
        usertoSave.setUsername(user.getUsername());
        usertoSave.setPassword(user.getPassword());
        usertoSave.setEmail(user.getEmail());
        logger.info(user.toString());
        logger.info("User saved");
        logger.info(usertoSave.toString());
        return userRepository.save(usertoSave);
    }
    public Users getUserById(Long id) {
        return (Users) userRepository.findById(id).orElseThrow(() -> new GlobalExceptionHandler.CustomException("User not found"));
    }
    public Users getUserByTokenLong (String token) {
        return (Users) userRepository.findByToken(token).orElseThrow(() -> new GlobalExceptionHandler.CustomException("User not found"));
    }

    public Users getUserByUsername(String assignTo) {
        return (Users) userRepository.findByUsername(assignTo).orElseThrow(() -> new GlobalExceptionHandler.CustomException("User not found"));
    }

    public Users getUserByPassword(String password) {
        return (Users) userRepository.findByPassword(password).orElseThrow(() -> new GlobalExceptionHandler.CustomException("User not found"));
    }
}
