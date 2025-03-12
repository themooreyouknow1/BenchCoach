package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.controller;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.Pitcher;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service.PitcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * The PitcherController class is responsible for handling requests related to pitcher statistics.
 * It maps the "/pitching-stats" endpoint to the appropriate view and serves the pitching statistics data.
 * This controller interacts with the PitcherService to retrieve the list of pitcher statistics for display.
 */

@Controller
@RequestMapping("/pitching-stats")
public class PitcherController {

    private final PitcherService pitcherService;

    @Autowired
    public PitcherController(PitcherService pitcherService) {
        this.pitcherService = pitcherService;
    }

    @GetMapping
    public String getPitchingStats(Model model) {
        List<Pitcher> pitchers = pitcherService.getAllPitchers();
        model.addAttribute("pitchers", pitchers);
        return "pitching-stats";  // This matches the HTML file name
    }
}