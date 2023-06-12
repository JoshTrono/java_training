package com.revature.TaskManager.dto;

import com.revature.TaskManager.entity.Users;

public class TaskDTO {
    private String description;
    private String status;
    private Users assignTo;
    private Long id;

    public TaskDTO(String description, String status, Users assignTo, Long id) {
        this.description = description;
        this.status = status;
        this.assignTo = assignTo;
        this.id = id;
    }

    public TaskDTO() {
    }

    @Override
    public String toString() {
        return "TaskDTO{" +
                "description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", assignTo='" + assignTo + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Users getAssignTo() {
        return assignTo;
    }

    public void setAssignTo(Users assignTo) {
        this.assignTo = assignTo;
    }
}
