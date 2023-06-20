package com.revature.Revature_ERS_Backend.controller;

import com.revature.Revature_ERS_Backend.entity.Reimbursement;
import com.revature.Revature_ERS_Backend.models.CreateRepositoryRequest;
import com.revature.Revature_ERS_Backend.service.ReimbursementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reimbursements")
public class ReimbursementController {



    private final ReimbursementService reimbursementService;

    public ReimbursementController(ReimbursementService reimbursementService) {
        this.reimbursementService = reimbursementService;
    }

    @PostMapping("/create")
    public Reimbursement createReimbursement(@RequestBody CreateRepositoryRequest request, @RequestHeader("Authorization") String token) {

        int amount = request.getAmount();
        String description = request.getDescription();
        return reimbursementService.createReimbursement(amount, description, token);
    }
}
