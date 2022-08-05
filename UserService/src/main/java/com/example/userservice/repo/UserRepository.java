package com.example.userservice.repo;

import com.example.userservice.model.UserPlatform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserPlatform, Long> {
}
