package com.revature.Revature_ERS_Backend.controller;

import com.revature.Revature_ERS_Backend.entity.Reimbursement;
import com.revature.Revature_ERS_Backend.models.CreateRepositoryRequest;
import com.revature.Revature_ERS_Backend.service.ReimbursementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reimbursements")
public class ReimbursementController {



    private final ReimbursementService reimbursementService;

    public ReimbursementController(ReimbursementService reimbursementService) {
        this.reimbursementService = reimbursementService;
    }

    /**
     *
     * @param request request body with amount and description
     * @param token token of the user
     * @return created reimbursement
     */
    @PostMapping("/create")
    public Reimbursement createReimbursement(@RequestBody CreateRepositoryRequest request, @RequestHeader("Authorization") String token) {

        int amount = request.getAmount();
        String description = request.getDescription();
        return reimbursementService.createReimbursement(amount, description, token);
    }

    /**
     *
     * @param token token of the user
     * @return list of reimbursements
     */
    @GetMapping
    public List<Reimbursement> getReimbursements(@RequestHeader("Authorization") String token) {
        return reimbursementService.getReimbursementsFromUser(extractToken(token));
    }

    /**
     *
     * @param id id of the reimbursement to be updated
     * @param reimbursement reimbursement object with updated fields
     * @param token token of the user
     * @return updated reimbursement
     */
    @PutMapping("/{id}")
    public Reimbursement updateReimbursement(@PathVariable Long id, @RequestBody Reimbursement reimbursement, @RequestHeader("Authorization") String token) {
        return reimbursementService.updateReimbursement(id, reimbursement, extractToken(token));
    }

    /**
     *
     * @param token token of the user
     * @return list of reimbursements
     */

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteReimbursement(@PathVariable Long id, @RequestHeader("Authorization") String token) {
        return reimbursementService.deleteReimbursement(id, extractToken(token));
    }


    private String extractToken(String token) {
        return token.split(" ")[1].trim();
    }
}
