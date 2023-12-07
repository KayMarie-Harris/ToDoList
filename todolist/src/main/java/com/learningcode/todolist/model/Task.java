package com.learningcode.todolist.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="task")
public class Task {

    @Id // like defining the primary key in sql
    @Column(name="task_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Like auto increment in sql
    private int taskId;

    private String taskName;
    private LocalDate dueDate;
    private boolean isCompleted;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name="task_id")
    private Set<Category> categories = new HashSet<>();

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
