//package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class UserController {
//
//    // Display registration page
//    @GetMapping("/registration")
//    public String showRegistrationForm() {
//        return "registration";  // Thymeleaf template for registration
//    }
//
//    // Handle registration form submission
//    @PostMapping("/registration")
//    public String handleRegistration(@RequestParam("fname") String firstName,
//                                     @RequestParam("vname") String lastName,
//                                     @RequestParam("username") String username,
//                                     @RequestParam("password") String password,
//                                     @RequestParam("confirmPassword") String confirmPassword) {
//        // Here you can add logic to save the user to your database
//        if (password.equals(confirmPassword)) {
//            return "redirect:/login";  // Redirect to login page after successful registration
//        } else {
//            return "registration";  // Return to registration page with error
//        }
//    }
//
//    // Display login page
//    @GetMapping("/login")
//    public String showLoginForm() {
//        return "login";  // Thymeleaf template for login
//    }
//
//    // Handle login form submission
//    @PostMapping("/login")
//    public String handleLogin(@RequestParam("username") String username,
//                              @RequestParam("password") String password) {
//        // Authenticate the user
//        boolean isAuthenticated = authenticateUser(username, password);
//
//        if (isAuthenticated) {
//            return "redirect:/home";  // Redirect to home page after successful login
//        } else {
//            return "login";  // Return to login page with error
//        }
//    }
//
//    // A mock authentication method
//    private boolean authenticateUser(String username, String password) {
//        // In real life, you should check credentials against the database
//        return "testuser@example.com".equals(username) && "TestPassword123!".equals(password);
//    }
//}