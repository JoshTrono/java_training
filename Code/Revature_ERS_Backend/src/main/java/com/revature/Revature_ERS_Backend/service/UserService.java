package com.revature.Revature_ERS_Backend.service;

import com.revature.Revature_ERS_Backend.auth.AuthenticationResponse;
import com.revature.Revature_ERS_Backend.entity.Role;
import com.revature.Revature_ERS_Backend.entity.User;
import com.revature.Revature_ERS_Backend.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<AuthenticationResponse> updateUser(Long id) {
        User user = userRepository.findById(id).orElseThrow();
        user.setRole(Role.ADMIN);
        userRepository.save(user);
        return ResponseEntity.ok(AuthenticationResponse.builder().build());
    }
}
