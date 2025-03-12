package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.Batter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatterRepository extends JpaRepository<Batter, Integer> {
    List<Batter> findAll();
}