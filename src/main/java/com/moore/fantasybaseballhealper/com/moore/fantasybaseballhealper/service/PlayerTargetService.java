package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.PlayerTarget;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository.PlayerTargetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The PlayerTargetService class handles business logic related to player targets.
 * It interacts with the PlayerTargetRepository to fetch, save, update, and delete player target data.
 * This service is used by controllers to manage player target records.
 */

@Service
public class PlayerTargetService {

    @Autowired
    private PlayerTargetRepository playerTargetRepository;

    //get all
    public List<PlayerTarget> getAllPlayerTargets() {
        return playerTargetRepository.findAll();
    }

    //save player
    public PlayerTarget savePlayerTarget(PlayerTarget playerTarget) {
        return playerTargetRepository.save(playerTarget);
    }
    //deletes a player
    public void deletePlayerTarget(Long id) {
        playerTargetRepository.deleteById(id);
    }
    //get player by id
    public PlayerTarget getPlayerTargetById(Long id) {
        return playerTargetRepository.findById(id).orElse(null);
    }
}
