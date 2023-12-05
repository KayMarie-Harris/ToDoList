package com.learningcode.todolist.model;

import jakarta.persistence.*;

@Entity
@Table(name="category")
public class Category {

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @Column(name = "task_id")
    private int taskId;

    private String categoryName;

// GETTERS

    public int getCategoryId() {
        return categoryId;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getCategoryName() {
        return categoryName;
    }

// SETTERS

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", taskId=" + taskId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
