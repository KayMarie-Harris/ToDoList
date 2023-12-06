package com.learningcode.todolist.controller;

//  Contains classes annotated with @RestController that handle incoming HTTP requests.

import com.learningcode.todolist.model.Task;
import com.learningcode.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Used to annotate a class to indicate that it is a controller where every method returns a domain object instead of a view
@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/add")
    public String add(@RequestBody Task task){
        taskService.createTask(task);
        return "Task added";
    }
}
