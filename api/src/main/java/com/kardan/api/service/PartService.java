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


    public Part findPart(int engineId,int categoryid){
        return partRepository.findPartByCategory_IdAndEngine_Id(engineId,categoryid);
    }


}