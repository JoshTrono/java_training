package com.revature.TaskManager.dto;

import com.revature.TaskManager.entity.Users;

public class TaskDTO {
    private String description;
    private String status;
    private String assign;
    private Long id;

    public TaskDTO(String description, String status, String assign) {
        this.description = description;
        this.status = status;
        this.assign = assign;
    }

    public TaskDTO() {
    }

    @Override
    public String toString() {
        return "TaskDTO{" +
                "description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", assignTo='" + assign + '\'' +
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

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }
}
