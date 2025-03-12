package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.controller;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.PitcherProjection;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service.PitcherProjectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pitcher-projections")
public class PitcherProjectionController {

    private final PitcherProjectionService pitcherProjectionService;

    @Autowired
    public PitcherProjectionController(PitcherProjectionService pitcherProjectionService) {
        this.pitcherProjectionService = pitcherProjectionService;
    }

    @GetMapping
    public String getPitcherProjections(Model model) {
        List<PitcherProjection> pitcherProjections = pitcherProjectionService.getAllPitcherProjections();
        if (pitcherProjections == null || pitcherProjections.isEmpty()) {
            System.out.println("No pitcher projections found.");
        } else {
            System.out.println("Retrieved Pitcher Projections: " + pitcherProjections);
        }
        model.addAttribute("pitcherProjections", pitcherProjections);
        return "pitcher-projections";  // Ensure this matches the name of the template
    }
}
