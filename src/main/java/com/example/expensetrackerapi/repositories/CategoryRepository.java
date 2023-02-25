package com.example.expensetrackerapi.repositories;

import com.example.expensetrackerapi.domain.Category;
import com.example.expensetrackerapi.exceptions.EtBadRequestException;
import com.example.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category);

    void removeById(Integer userId, Integer categoryId);

}
