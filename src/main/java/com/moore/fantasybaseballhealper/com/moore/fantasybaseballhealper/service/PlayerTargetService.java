package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.PlayerTarget;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository.PlayerTargetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerTargetService {

    @Autowired
    private PlayerTargetRepository playerTargetRepository;

    public List<PlayerTarget> getAllPlayerTargets() {
        return playerTargetRepository.findAll();
    }

    public PlayerTarget savePlayerTarget(PlayerTarget playerTarget) {
        return playerTargetRepository.save(playerTarget);
    }

    public void deletePlayerTarget(Long id) {
        playerTargetRepository.deleteById(id);
    }

    public PlayerTarget getPlayerTargetById(Long id) {
        return playerTargetRepository.findById(id).orElse(null);  // Return null if not found
    }
}
