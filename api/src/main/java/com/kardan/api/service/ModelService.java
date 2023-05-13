package com.kardan.api.service;

import com.kardan.api.model.Brand;
import com.kardan.api.model.Model;
import com.kardan.api.repository.ModelRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ModelService {
    private final ModelRepository modelRepository;

    public ModelService(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    public List<Model> findByBrand(Brand brand){
        return modelRepository.findByBrand(brand);
    }

    public List<Model> findByBrandId(int id) {return modelRepository.findModelByBrandId(id);}
}