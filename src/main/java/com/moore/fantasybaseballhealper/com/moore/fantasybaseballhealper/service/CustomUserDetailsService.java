//package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service;
//
//import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.User;
//import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.stereotype.Service;
//
//import java.util.Collections;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        // Fetch the user from the repository
//        User user = userRepository.findByEmail(email);
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found with email: " + email);
//        }
//
//        // Return the user details with their authorities
//        return new User(user.getEmail(), user.getPassword(),
//                Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER")));
//    }
//}
