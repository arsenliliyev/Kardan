package com.kardan.api.repository;

import com.kardan.api.model.Brand;
import com.kardan.api.model.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {
    Brand findBrandById(int id);
}