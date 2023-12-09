package com.learningcode.todolist.repository;

import com.learningcode.todolist.model.Category;
import com.learningcode.todolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
