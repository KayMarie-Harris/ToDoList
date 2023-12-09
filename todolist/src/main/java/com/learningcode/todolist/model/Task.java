package com.learningcode.todolist.model;

// Contains classes representing data entities (e.g., JPA entities or DTOs).
    // JPA (Java Persistence API)  entities are Java classes that represent objects in your application and are mapped to database tables
    // DTOs (Data Transfer Objects) are objects used to transfer data between different layers of an application, such as between the frontend and the backend

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

// Spring Boot makes extensive use of annotations to simplify the configuration and development of Spring-based applications. Annotations are markers added to Java classes or methods that provide additional information to the Spring framework.

@Entity // Indicates that this class is a JPA entity and should be mapped to a database table.
@Table(name="task")
public class Task {

    @Id // like defining the primary key in sql
    @Column(name = "task_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Like auto increment in sql
    private  int taskId;

    private String taskName;
    private LocalDate dueDate;
    private boolean isCompleted;

    @ManyToMany(mappedBy = "tasks")
    private Set<Category> categories = new HashSet<>();

 // GETTERS

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    // SETTERS


    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setIsCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", dueDate=" + dueDate +
                ", isCompleted=" + isCompleted +
                ", categories=" + categories +
                '}';
    }
}
