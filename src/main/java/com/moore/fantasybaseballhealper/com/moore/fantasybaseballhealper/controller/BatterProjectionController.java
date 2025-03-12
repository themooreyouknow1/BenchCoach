package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.controller;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.BatterProjection;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service.BatterProjectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/batter-projections")
public class BatterProjectionController {

    private final BatterProjectionService batterProjectionService;

    @Autowired
    public BatterProjectionController(BatterProjectionService batterProjectionService) {
        this.batterProjectionService = batterProjectionService;
    }

    @GetMapping
    public String getBatterProjections(Model model) {
        List<BatterProjection> batterProjections = batterProjectionService.getAllBatterProjections();
        System.out.println("Retrieved Batter Projections: " + batterProjections);
        model.addAttribute("batterProjections", batterProjections);
        return "batter-projections";  // The name of the template file
    }
}
