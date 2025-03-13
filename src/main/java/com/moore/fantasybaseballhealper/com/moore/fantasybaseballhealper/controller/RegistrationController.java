package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.controller;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.User;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @GetMapping("/registration")
    public String showRegistrationForm() {
        return "registration";
    }
    @PostMapping("/registration")
    public String registerUser(User user, String confirmPassword, Model model) {
        if (!user.getPassword().equals(confirmPassword)) {
            model.addAttribute("error", "Passwords do not match.");
            return "registration";
        }

        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            model.addAttribute("error", "Email is required.");
            return "registration";
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));


        if (userRepository.findByEmail(user.getEmail()) != null) {
            model.addAttribute("error", "Email already exists");
            return "registration";
        }

        // Save the new user
        userRepository.save(user);
        return "redirect:/login";
    }
}