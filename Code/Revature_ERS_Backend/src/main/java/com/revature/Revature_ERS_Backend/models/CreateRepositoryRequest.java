package com.revature.Revature_ERS_Backend.models;

import lombok.Data;

@Data
public class CreateRepositoryRequest {
    private int amount;
    private String description;
}
