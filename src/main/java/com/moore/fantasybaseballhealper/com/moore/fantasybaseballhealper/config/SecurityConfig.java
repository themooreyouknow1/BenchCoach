//package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.config;
//
//import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service.CustomUserDetailsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Autowired
//    private CustomUserDetailsService userDetailsService;
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authorizeRequests -> authorizeRequests
//                        .requestMatchers("/css/**", "/js/**", "/images/**", "/login", "/registration").permitAll()
//                        .anyRequest().authenticated())  // Any other requests require authentication
//                .formLogin(formLogin -> formLogin
//                        .loginPage("/login")
//                        .permitAll())
//                .logout(logout -> logout.logoutSuccessUrl("/login").permitAll())
//                .userDetailsService(userDetailsService);
//
//        return http.build();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}