package com.kardan.api.service;

import com.kardan.api.model.Category;
import com.kardan.api.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

//    public List<Category> findAllCategories() {
//        return categoryRepository.findAll();
//    }

    public List<Category> findSubCategories() {
        return categoryRepository.findByParentIsNull();
    }
}