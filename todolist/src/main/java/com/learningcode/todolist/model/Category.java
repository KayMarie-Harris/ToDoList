package com.learningcode.todolist.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.learningcode.todolist.enums.Color;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="category")
public class Category {

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "task_categories",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "task_id")
    )
    private Set<Task> tasks = new HashSet<>();


    private String categoryName;
    private Color color;

// GETTERS

    public int getCategoryId() {
        return categoryId;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Color  getColor() {
        return color;
    }

    // SETTERS

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setTask(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", taskId=" + tasks +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
