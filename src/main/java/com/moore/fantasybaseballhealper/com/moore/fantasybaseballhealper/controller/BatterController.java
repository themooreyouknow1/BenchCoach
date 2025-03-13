package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.controller;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.Batter;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service.BatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * The BatterController class handles HTTP requests related to batter statistics.
 * It retrieves a list of batters from the service layer and displays them using the "batting-stats" template.
 * The controller is responsible for mapping the "/batting-stats" endpoint to the relevant view.
 * It uses the BatterService to fetch data from the underlying data source and injects it into the model.
 */

@Controller
@RequestMapping("/batting-stats")
public class BatterController {

    private final BatterService batterService;

    @Autowired
    public BatterController(BatterService batterService) {
        this.batterService = batterService;
    }

    // display the list of batters
    @GetMapping
    public String getBatters(Model model) {
        List<Batter> batters = batterService.getAllBatters();
        System.out.println("Retrieved Batters: " + batters);
        model.addAttribute("batters", batters);
        return "batting-stats";
    }
}
