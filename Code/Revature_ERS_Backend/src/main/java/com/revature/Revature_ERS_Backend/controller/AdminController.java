package com.revature.Revature_ERS_Backend.controller;

import com.revature.Revature_ERS_Backend.entity.Reimbursement;
import com.revature.Revature_ERS_Backend.entity.User;
import com.revature.Revature_ERS_Backend.service.ReimbursementService;
import com.revature.Revature_ERS_Backend.service.UserService;
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

    /**
     * This is to get reimbursements from all users only for admins
     *
     * @return list of reimbursements
     */
    @GetMapping("/reimbursement")
    public List<Reimbursement> getReimbursement() {
        return reimbursementService.getReimbursements();
    }

    /**
     * This is to get all users only for admins
     * @return list of users
     */
    @GetMapping("/users")
    public List<User> getUser() {
        return userService.getUsers();
    }


    /**
     * This is to get a user by id only for admins
     * @param id id of the user
     * @return user with change of role to admin
     */
    @PutMapping("/user/{id}")
    public ResponseEntity updateUser (@PathVariable Long id) {
        return userService.updateUser(id);
    }

    public ResponseEntity deleteUser (@PathVariable Long id) {
        return userService.deleteUser(id);
    }

}
