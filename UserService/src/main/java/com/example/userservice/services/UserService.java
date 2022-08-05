package com.example.userservice.services;

import com.example.restaurantservice.services.RestaurantService;
import com.example.userservice.model.UserPlatform;
import com.example.userservice.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestaurantService restaurantService;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public List<UserPlatform> findAll() {
        return userRepository.findAll();
    }

    public Optional<UserPlatform> findById(Long id) {
        return userRepository.findById(id);
    }

    public UserPlatform save(UserPlatform user) {
        return userRepository.save(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

}