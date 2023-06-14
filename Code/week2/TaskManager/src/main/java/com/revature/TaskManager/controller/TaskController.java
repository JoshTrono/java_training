package com.revature.TaskManager.controller;

import com.revature.TaskManager.dto.TaskDTO;
import com.revature.TaskManager.entity.Task;
import com.revature.TaskManager.service.TaskService;
import com.revature.TaskManager.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private final TaskService taskService;

    @Autowired
    private final UserService userService;
    @Autowired
    private CacheManager cacheManager;
    @GetMapping
    @Cacheable(value = "tasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
    @PostMapping("/save")
    @CacheEvict(value = "tasks", allEntries = true)
    @CachePut(value = "tasks", key="#result.id")
    public Task saveTask(@RequestBody TaskDTO task, @RequestParam String assign) {
        System.out.println(task.toString());
        Task taskToSave = new Task();
        taskToSave.setDescription(task.getDescription());
        taskToSave.setStatus(task.getStatus());
        //taskToSave.setAssignedto(task.getAssignto());
        taskToSave.setAssigned(userService.getUserById(Long.parseLong(String.valueOf(assign))));
        return taskService.saveTask(taskToSave);
    }

    @GetMapping("/mytask")
    @ResponseBody
    @Cacheable(value = "tasks")
    public List<Task> getMyTasks(@RequestHeader("Authorization") String token) {
            return taskService.getMyTasks(token);

    }
    @PostMapping("/assign")
    @ResponseBody
    @CacheEvict(value = "tasks", allEntries = true)
    public Task assignTask(@RequestParam Long task_Id, @RequestParam String assignTo) {
        // todo add validation to see if they are a manager
        return taskService.assignTask(task_Id, assignTo);
    }
}

