package com.learningcode.todolist.controller;

import com.learningcode.todolist.enums.Color;
import com.learningcode.todolist.model.Category;
import com.learningcode.todolist.model.Task;
import com.learningcode.todolist.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/add")
    public String add(@RequestBody Category category){
        categoryService.createCategory(category);
        return "Category added";
    }

    @GetMapping("/getAllByCategory")
    public Set<Task> getAllTasksByCategory(@RequestParam int categoryId){
        return categoryService.getAllTasksByCategory(categoryId);
    }

    @GetMapping("/getAll")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @DeleteMapping("/delete")
    public String deleteCategory(@RequestParam int categoryId){
        return categoryService.deleteCategory(categoryId);
    }

    @PostMapping("/updateColor")
    public Category changeCategoryColor(@RequestParam int categoryId, Color color){
        return categoryService.updateCategoryColor(categoryId, color);
    }
}
