package com.kardan.api.service;

import com.kardan.api.model.Part;
import com.kardan.api.repository.PartRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PartService {
    private final PartRepository partRepository;

    @Autowired
    public PartService(PartRepository partRepository) {
        this.partRepository = partRepository;
    }


    public int findPartid(int category_id,int engine_id){
        return partRepository.findPartByCategory_IdAndEngine_Id(category_id,engine_id).getId();
    }



    public Part selectPart(int id) {
        Optional<Part> selectedPart = partRepository.findById(id);
        return selectedPart.orElse(null);
    }

    @Transactional
    public void save(Part part) {
        partRepository.save(part);
    }

    @Transactional
    public void update(int id, Part updatedPart) {
        updatedPart.setId(id);
        partRepository.save(updatedPart);
    }

    @Transactional
    public void delete(int id) {
        partRepository.deleteById(id);
    }
}