package com.revature.Revature_ERS_Backend.service;

import com.revature.Revature_ERS_Backend.entity.Role;
import com.revature.Revature_ERS_Backend.entity.User;
import com.revature.Revature_ERS_Backend.repository.UserRepository;
import com.revature.Revature_ERS_Backend.security.JwtService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
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

    public ResponseEntity<HttpStatus> deleteUser(Long id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    public ResponseEntity<HttpStatus> updateUserPassword(Long id, String password) {
        User user = userRepository.findById(id).orElseThrow();
        user.setPassword(password);
        userRepository.save(user);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    public String encryptPassword(String newPassword) {
        return passwordEncoder.encode(newPassword);
    }
}
