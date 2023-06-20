package com.revature.Revature_ERS_Backend.repository;

import com.revature.Revature_ERS_Backend.entity.Reimbursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReimbursementRepository extends JpaRepository<Reimbursement, Long> {
}
