package com.scaler.springboot.service;

import com.scaler.springboot.models.Task;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class TasksServiceImpl implements TasksService {

    private ArrayList<Task> taskList;
    public TasksServiceImpl() {
        taskList = new ArrayList<>();
        taskList.add(new Task(1, "sample task", false, new Date()));
        taskList.add(new Task(2, "sample second task", false, new Date()));
        taskList.add(new Task(3, "sample third task", false, new Date()));
    }
    @Override
    public List<Task> getAllTasks() {
        return taskList;
    }

    @Override
    public Task getTaskById(int id) {
        //TODO: implement
        return null;
    }

    @Override
    public Task createTask(Task task) {
        //TODO: implement
        return null;
    }

    @Override
    public Task updateTask(int id, Task task) {
        //TODO: implement
        return null;
    }

    @Override
    public void deleteTask(int id) {
        //TODO: implement
    }
}
