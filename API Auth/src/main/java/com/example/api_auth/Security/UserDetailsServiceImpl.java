package com.example.api_auth.Security;

import com.example.api_auth.Models.UserCredentials;
import com.example.api_auth.Repos.UserCredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserCredentialsRepository userCredentialsRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserCredentials user = userCredentialsRepository.findByLogin(username);

        if (user == null){
            throw new UsernameNotFoundException("User not found");
        }

        return new MyUserDetails(user);
    }
}
