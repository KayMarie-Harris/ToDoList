package com.learningcode.todolist.service;


// Contains business logic and acts as a bridge between controllers and repositories.

import com.learningcode.todolist.model.Task;
import org.springframework.stereotype.Service;


public interface TaskService {
    // create a task (send data to the db)
    public Task createTask(Task task);
}
