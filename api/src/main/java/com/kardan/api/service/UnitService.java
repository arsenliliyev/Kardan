package com.kardan.api.service;

import com.kardan.api.model.CommonEntity;
import com.kardan.api.model.Unit;
import com.kardan.api.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
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
        fullNew(unit);
        unitRepository.save(unit);
    }

    @Transactional
    public void update(int id, Unit updatedUnit){
        updatedUnit.setCreatedAt((unitRepository.findUnitById(id)).getCreatedAt());
        updatedUnit.setId(id);
        updatedUnit.setUpdateDate(LocalDateTime.now());
        updatedUnit.setState(true);
        unitRepository.save(updatedUnit);
    }

    @Transactional
    public void delete(int id){
        unitRepository.deleteById(id);
    }


    private void fullNew(Unit unit){
        unit.setCreatedAt(LocalDateTime.now());
        unit.setUpdateDate(LocalDateTime.now());
        unit.setState(true);
    }

}