package com.revature.Revature_ERS_Backend.controller;

import com.revature.Revature_ERS_Backend.auth.AuthenticationResponse;
import com.revature.Revature_ERS_Backend.entity.Reimbursement;
import com.revature.Revature_ERS_Backend.entity.User;
import com.revature.Revature_ERS_Backend.service.ReimbursementService;
import com.revature.Revature_ERS_Backend.service.UserService;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    private final ReimbursementService reimbursementService;
    private final UserService userService;

    public AdminController(ReimbursementService reimbursementService, UserService userService) {
        this.reimbursementService = reimbursementService;
        this.userService = userService;
    }

    @GetMapping("/reimbursement")
    public List<Reimbursement> getReimbursement() {
        return reimbursementService.getReimbursements();
    }

    @GetMapping("/users")
    public List<User> getUser() {
        return userService.getUsers();
    }

    @PutMapping("/user/{id}")
    public ResponseEntity updateUser (@PathVariable Long id) {
        return userService.updateUser(id);
    }

}
