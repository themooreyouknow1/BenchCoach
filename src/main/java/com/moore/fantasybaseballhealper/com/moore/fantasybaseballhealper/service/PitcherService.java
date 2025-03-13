package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.Pitcher;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository.PitcherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * The PitcherService class is responsible for managing pitcher-related operations.
 * It serves as a service layer between the controller and the data layer (PitcherRepository).
 * The service is responsible for fetching pitcher data and performing business logic related to pitchers.
 */

@Service
public class PitcherService {

    private final PitcherRepository pitcherRepository;

    @Autowired
    public PitcherService(PitcherRepository pitcherRepository) {
        this.pitcherRepository = pitcherRepository;
    }

    public List<Pitcher> getAllPitchers() {
        List<Pitcher> pitchers = pitcherRepository.findAll();
        System.out.println("Pitchers retrieved: " + pitchers);
        return pitchers;
    }
    public Optional<Pitcher> getPitcherById(Long id) {
        return pitcherRepository.findById(id);
    }

    public Pitcher savePitcher(Pitcher pitcher) {
        return pitcherRepository.save(pitcher);
    }

}