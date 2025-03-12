package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.PitcherProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PitcherProjectionRepository extends JpaRepository<PitcherProjection, Integer> {
    List<PitcherProjection> findAll();
}