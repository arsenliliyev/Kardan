package com.kardan.api.service;

import com.kardan.api.model.Gen;
import com.kardan.api.repository.GenRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GenServise {
    private final GenRepository genRepository;

    public GenServise(GenRepository genRepository) {
        this.genRepository = genRepository;
    }

    public List<Gen> findByModelId(int id){
        return genRepository.findGenByModelId(id);
    }
}