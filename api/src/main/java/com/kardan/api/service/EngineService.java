package com.kardan.api.service;

import com.kardan.api.model.Engine;
import com.kardan.api.repository.EngineRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EngineService {
    private final EngineRepository engineRepository;

    public int selectedEngineId;

    public EngineService(EngineRepository engineRepository) {
        this.engineRepository = engineRepository;
    }

    public List<Engine> findByGen(int id) {
        return engineRepository.findEngineByGenId(id);
    }

    public Engine getEngineById(int id) {
        return engineRepository.findEngineById(id);
    }
}