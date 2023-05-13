package com.kardan.api.repository;

import com.kardan.api.model.Gen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenRepository extends JpaRepository<Gen,Integer> {
    // List<Gen> findByModel(Model model);

    List<Gen> findGenByModelId(int id);
}