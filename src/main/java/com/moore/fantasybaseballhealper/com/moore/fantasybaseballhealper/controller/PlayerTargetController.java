package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.controller;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.PlayerTarget;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service.PlayerTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * The PlayerTargetController class is responsible for handling requests related to player target management.
 * It provides endpoints for displaying, creating, updating, and deleting player target information.
 * This controller interacts with the PlayerTargetService to perform CRUD (Create, Read, Update, Delete) operations
 * on player target data, which is then displayed through the associated views.
 */

@Controller
@RequestMapping("/player-targets")
public class PlayerTargetController {

    @Autowired
    private PlayerTargetService playerTargetService;

    // Display all player targets
    @GetMapping
    public String listAllPlayerTargets(Model model) {
        model.addAttribute("playerTargets", playerTargetService.getAllPlayerTargets());
        return "player-targets";
    }

    // creating a new player
    @GetMapping("/new")
    public String showCreatePlayerTargetForm(Model model) {
        model.addAttribute("playerTarget", new PlayerTarget());
        return "player-target-form";
    }

    // Save
    @PostMapping("/save")
    public String savePlayerTarget(@ModelAttribute("playerTarget") PlayerTarget playerTarget) {
        playerTargetService.savePlayerTarget(playerTarget);
        return "redirect:/player-targets";
    }
    @GetMapping("/edit/{id}")
    public String showUpdatePlayerTargetForm(@PathVariable Long id, Model model) {
        PlayerTarget playerTarget = playerTargetService.getPlayerTargetById(id);
        if (playerTarget != null) {
            model.addAttribute("playerTarget", playerTarget);
            return "player-target-form";
        }
        return "redirect:/player-targets";
    }
    // Update the player
    @PostMapping("/update/{id}")
    public String updatePlayerTarget(@PathVariable Long id, @ModelAttribute("playerTarget") PlayerTarget playerTarget) {
        playerTarget.setId(id);
        playerTargetService.savePlayerTarget(playerTarget);
        return "redirect:/player-targets";
    }

    // Delete a player
    @GetMapping("/delete/{id}")
    public String deletePlayerTarget(@PathVariable Long id) {
        playerTargetService.deletePlayerTarget(id);
        return "redirect:/player-targets";
    }
}