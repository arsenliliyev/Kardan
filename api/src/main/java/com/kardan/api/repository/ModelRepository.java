package com.kardan.api.repository;

import com.kardan.api.model.Brand;
import com.kardan.api.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<Model,Integer> {
    List<Model>  findByBrand(Brand brand);

    List<Model>  findModelByBrandId(int id);
}