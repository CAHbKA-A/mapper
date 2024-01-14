package com.mapper.devices.repositories;

import com.mapper.devices.entites.MetricBin;
import com.mapper.devices.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}