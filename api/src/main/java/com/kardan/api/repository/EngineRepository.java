package com.kardan.api.repository;

import com.kardan.api.model.Engine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EngineRepository extends JpaRepository<Engine,Integer> {
    List<Engine> findEngineByGenId(int id);

    Engine findEngineById(int id);
}