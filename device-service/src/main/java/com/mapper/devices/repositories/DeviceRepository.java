package com.mapper.devices.repositories;

import com.mapper.devices.entites.Devices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  DeviceRepository extends JpaRepository<Devices, Long> {
}