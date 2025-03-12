package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.PitcherProjection;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository.PitcherProjectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PitcherProjectionService {

    private final PitcherProjectionRepository pitcherProjectionRepository;

    @Autowired
    public PitcherProjectionService(PitcherProjectionRepository pitcherProjectionRepository) {
        this.pitcherProjectionRepository = pitcherProjectionRepository;
    }

    public List<PitcherProjection> getAllPitcherProjections() {
        // Retrieve data from the repository
        List<PitcherProjection> pitcherProjections = pitcherProjectionRepository.findAll();
        System.out.println("Retrieved Pitcher Projections: " + pitcherProjections);  // Logging for debugging
        return pitcherProjections;
    }
}
