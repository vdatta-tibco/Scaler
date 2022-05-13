package com.scaler.springboot.controllers;

import com.scaler.springboot.dto.TasksResponse;
import com.scaler.springboot.service.TasksService;
import com.scaler.springboot.service.TasksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")

public class TasksController {
    private TasksService tasksService;

    public TasksController() {
        this.tasksService = new TasksServiceImpl();
    }

    @GetMapping("")
    public TasksResponse getAllTasks() {
        var tasks = tasksService.getAllTasks();
        return new TasksResponse(tasks.size(), tasks);
    }

    @GetMapping("/{id}")
    public String getTaskByID(@PathVariable("id") String id) {
        return  "TODO:Task no = " + id;
    }
}
