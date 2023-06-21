package com.revature.Revature_ERS_Backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="reimbursements")
public class Reimbursement {

    @Id
    @SequenceGenerator(name="reimbursement_id_seq", sequenceName="reimbursement_id_seq", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="reimbursement_id_seq")
    private Long id;

    private int amount;

    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
