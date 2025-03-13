package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.controller;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.User;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String showRegistrationForm() {
        return "registration"; // Thymeleaf template for registration form
    }

    @PostMapping
    public String registerUser(
            @ModelAttribute User user,
            @RequestParam("confirmPassword") String confirmPassword,
            Model model) {

        // Check if the passwords match
        if (!user.getPassword().equals(confirmPassword)) {
            model.addAttribute("error", "Passwords do not match");
            return "registration";  // Show the registration form with an error
        }

        // Check if the email already exists in the database
        if (userRepository.findByEmail(user.getEmail()) != null) {
            model.addAttribute("error", "Email already exists");
            return "registration";  // Show the registration form with an error
        }

        // Simple hashing for demonstration (not secure)
        String hashedPassword = hashPassword(user.getPassword());

        // Set the hashed password back to the user object
        user.setPassword(hashedPassword);

        // Save the new user to the database
        userRepository.save(user);

        // Redirect to the login page after successful registration
        return "redirect:/login";
    }

    // Simple password hashing function (not recommended for production use)
    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString(); // Return the hashed password
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return password;  // Return plain password in case of error (not recommended)
        }
    }
}