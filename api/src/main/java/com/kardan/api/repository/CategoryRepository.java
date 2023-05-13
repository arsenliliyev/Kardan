package com.kardan.api.repository;

import com.kardan.api.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer>{

 //   List<Category> findAll();
    List<Category> findByParentIsNull();
}