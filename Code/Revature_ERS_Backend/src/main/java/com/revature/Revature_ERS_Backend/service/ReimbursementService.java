package com.revature.Revature_ERS_Backend.service;

import com.revature.Revature_ERS_Backend.entity.Reimbursement;
import com.revature.Revature_ERS_Backend.entity.User;
import com.revature.Revature_ERS_Backend.repository.ReimbursementRepository;
import com.revature.Revature_ERS_Backend.security.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReimbursementService {

    private final ReimbursementRepository reimbursementRepository;
    private final UserService userService;
    private final JwtService jwtService;

    public ReimbursementService(ReimbursementRepository reimbursementRepository, JwtService jwtService, UserService userService) {
        this.reimbursementRepository = reimbursementRepository;
        this.jwtService = jwtService;
        this.userService = userService;
    }


    public List<Reimbursement> getReimbursements() {
        return reimbursementRepository.findAll();
    }

    public Reimbursement createReimbursement(int amount, String description, String token) {

        String username = jwtService.extractUsername(token.split(" ")[1].trim());
        Long id = userService.getUserId(username);
        User user = userService.getUserById(id);
        Reimbursement reimbursement = Reimbursement.builder()
                .amount(amount)
                .description(description)
                .user(user)
                .build();
        return reimbursementRepository.save(reimbursement);
    }
}
