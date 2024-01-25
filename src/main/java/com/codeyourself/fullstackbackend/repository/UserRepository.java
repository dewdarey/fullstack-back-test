package com.codeyourself.fullstackbackend.repository;

import com.codeyourself.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
