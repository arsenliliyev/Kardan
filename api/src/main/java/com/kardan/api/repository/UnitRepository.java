package com.kardan.api.repository;

import com.kardan.api.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UnitRepository extends JpaRepository<Unit,Integer> {
    List<Unit> findUnitByPartId(int id);
}