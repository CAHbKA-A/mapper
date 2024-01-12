package com.mapper.devices.repositories;

import com.mapper.devices.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}