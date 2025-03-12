package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.Batter;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository.BatterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The BatterService class is responsible for managing batter-related operations.
 * It serves as a service layer between the controller and the data layer (BatterRepository).
 * The service is responsible for fetching batter data and performing business logic related to batters.
 */

@Service
public class BatterService {

    private final BatterRepository batterRepository;

    @Autowired
    public BatterService(BatterRepository batterRepository) {
        this.batterRepository = batterRepository;
    }

    // Fetch all batters from the database
    public List<Batter> getAllBatters() {
        List<Batter> batters = batterRepository.findAll();
        System.out.println("Batters retrieved: " + batters);  // Add a log here
        return batters;
    }

}