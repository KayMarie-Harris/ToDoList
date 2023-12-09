package com.learningcode.todolist.service;

import com.learningcode.todolist.model.Category;
import com.learningcode.todolist.model.Task;

import java.util.List;

// Contains business logic and acts as a bridge between controllers and repositories.
public interface TaskService {
    // create a task
    public Task createTask(Task task);

    // Get All Tasks
    public List<Task> getAllTasks();

    // Mark task complete
    public Task updateTaskIsComplete(int taskId);

    // Change Task name
    public Task changeTaskName(int taskId, String taskName);

    // Add category to Task
    public Task addCategoryToTask(int taskId, int categoryId);

    // Delete Category from Task
    public Task deleteCategoryFromTask(int taskId, int categoryId);

    // Delete Task
    public String deleteTask(int taskId);


}
