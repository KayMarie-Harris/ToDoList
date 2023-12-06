package com.learningcode.todolist.service;

import com.learningcode.todolist.model.Task;

// Contains business logic and acts as a bridge between controllers and repositories.
public interface TaskService {
    // create a task
    public Task createTask(Task task);

}
