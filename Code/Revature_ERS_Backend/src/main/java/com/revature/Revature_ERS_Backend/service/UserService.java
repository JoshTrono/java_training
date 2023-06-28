package com.revature.Revature_ERS_Backend.service;

import com.revature.Revature_ERS_Backend.entity.Role;
import com.revature.Revature_ERS_Backend.entity.User;
import com.revature.Revature_ERS_Backend.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity updateUser(Long id) {
        User user = userRepository.findById(id).orElseThrow();
        user.setRole(Role.ADMIN);
        userRepository.save(user);
        return ResponseEntity.ok("User updated");
    }

    public List<User> getUsers() {
        return userRepository.findAll();

    }

    public Long getUserId(String username) {
        User user = userRepository.findByEmail(username).orElseThrow();
        return user.getId();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public ResponseEntity deleteUser(Long id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok("User deleted");
    }
}
