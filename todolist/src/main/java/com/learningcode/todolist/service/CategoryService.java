package com.learningcode.todolist.service;

import com.learningcode.todolist.enums.Color;
import com.learningcode.todolist.model.Category;
import com.learningcode.todolist.model.Task;

import java.util.List;
import java.util.Set;

public interface CategoryService {
    // create category
    public Category createCategory(Category category);

    public Set<Task> getAllTasksByCategory(int categoryId);

    // Get All Categories
    public List<Category> getAllCategories();

    // Delete Category
    public String deleteCategory(int categoryId);

    // Update color
    public Category updateCategoryColor(int categoryId, Color color);
}
