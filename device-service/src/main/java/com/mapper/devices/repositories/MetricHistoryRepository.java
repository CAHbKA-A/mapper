package com.mapper.devices.repositories;
import com.mapper.devices.entites.MetricBin;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  MetricHistoryRepository extends JpaRepository<MetricBin, Long> {
    public List<MetricBin> findAllByDeviceId (Long id);


}
