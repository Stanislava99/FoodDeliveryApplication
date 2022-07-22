package com.example.api_auth.Repos;

import com.example.api_auth.Models.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCredentialsRepository extends JpaRepository<UserCredentials,Long> {
    UserCredentials findByLogin(String login);
}
