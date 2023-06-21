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

    // Create a reimbursement
    public Reimbursement createReimbursement(int amount, String description, String token) {

        String username = jwtService.extractUsername(token.split(" ")[1].trim());
        Long id = userService.getUserId(username);
        User user = userService.getUserById(id);
        Reimbursement reimbursement = Reimbursement.builder()
                .amount(amount)
                .description(description)
                .user(user)
                .status("PENDING")
                .build();
        return reimbursementRepository.save(reimbursement);
    }

    /**
     * Get all reimbursements from a user
     * @param token JWT token
     * @return List of reimbursements
     */
    public List<Reimbursement> getReimbursementsFromUser(String token) {
        String username = jwtService.extractUsername(token);
        Long id = userService.getUserId(username);
        User user = userService.getUserById(id);
        return reimbursementRepository.findAllByUser(user);
    }
    // Update a reimbursement
    public Reimbursement updateReimbursement(Long id, Reimbursement reimbursement, String s) {
        String username = jwtService.extractUsername(s);
        Long userId = userService.getUserId(username);
        User user = userService.getUserById(userId);
        Reimbursement reimbursement1 = reimbursementRepository.findById(id).orElseThrow();
        if (reimbursement1.getUser().getId().equals(user.getId())) {
            if (reimbursement.getAmount() != 0) {
                reimbursement1.setAmount(reimbursement.getAmount());
            }
            if (reimbursement.getDescription() != null) {
                reimbursement1.setDescription(reimbursement.getDescription());
            }
            if (reimbursement.getStatus() != null && reimbursement.getStatus().equals("Pending")) {
                reimbursement1.setStatus(reimbursement.getStatus());
            }
            return reimbursementRepository.save(reimbursement1);
        }
        return null;
    }
}
