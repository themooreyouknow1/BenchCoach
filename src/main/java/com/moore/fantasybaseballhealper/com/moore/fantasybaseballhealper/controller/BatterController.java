package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.controller;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.Batter;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service.BatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/batting-stats")
public class BatterController {

    private final BatterService batterService;

    @Autowired
    public BatterController(BatterService batterService) {
        this.batterService = batterService;
    }

    // Endpoint to display the list of batters
    @GetMapping
    public String getBatters(Model model) {
        List<Batter> batters = batterService.getAllBatters();
        System.out.println("Retrieved Batters: " + batters);
        model.addAttribute("batters", batters);
        return "batting-stats";  // Name of the template
    }
}
