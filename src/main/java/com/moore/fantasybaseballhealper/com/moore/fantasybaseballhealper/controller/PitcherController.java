package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.controller;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.Pitcher;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service.PitcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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