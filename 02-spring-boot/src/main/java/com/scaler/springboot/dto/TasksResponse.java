package com.scaler.springboot.dto;

import com.scaler.springboot.models.Task;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TasksResponse {
    private int taskCount;
    private List<Task> tasks;
}
