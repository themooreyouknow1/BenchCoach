package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * The HomeController class is responsible for handling requests to the home page of the application.
 */

@Controller
public class HomeController {

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }
}