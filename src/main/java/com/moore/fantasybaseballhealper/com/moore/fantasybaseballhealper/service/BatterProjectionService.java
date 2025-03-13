package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.BatterProjection;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository.BatterProjectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatterProjectionService {

    private final BatterProjectionRepository batterProjectionRepository;

    @Autowired
    public BatterProjectionService(BatterProjectionRepository batterProjectionRepository) {
        this.batterProjectionRepository = batterProjectionRepository;
    }

    // get projections
    public List<BatterProjection> getAllBatterProjections() {
        List<BatterProjection> batterProjections = batterProjectionRepository.findAll();
        System.out.println("Batter Projections retrieved: " + batterProjections);  // Add a log here
        return batterProjections;
    }
}
