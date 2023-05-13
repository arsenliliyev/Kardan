package com.kardan.api.service;

import com.kardan.api.model.Unit;
import com.kardan.api.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class UnitService {
    private final UnitRepository unitRepository;


    public UnitService(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

    public List<Unit> findUnitByPartId(int part_id){
        return unitRepository.findUnitsByPartId(part_id);
    }

    @Transactional
    public void save(Unit unit){
        unitRepository.save(unit);
    }

    @Transactional
    public void update(int id, Unit updatedUnit){
        updatedUnit.setId(id);
        unitRepository.save(updatedUnit);
    }

    @Transactional
    public void delete(int id){
        unitRepository.deleteById(id);
    }
}