package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.BatterProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatterProjectionRepository extends JpaRepository<BatterProjection, Integer> {
    List<BatterProjection> findAll();
}
