package com.kardan.api.repository;

import com.kardan.api.model.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartRepository extends JpaRepository<Part,Integer> {
    Part findPartByCategory_IdAndEngine_Id( int categoryId,int engineId);
}