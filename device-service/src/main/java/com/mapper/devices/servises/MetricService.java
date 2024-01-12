package com.mapper.devices.servises;

import com.mapper.devices.entites.MetricBin;
import com.mapper.devices.entites.User;
import com.mapper.devices.repositories.MetricHistoryRepository;
import com.mapper.devices.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class MetricService {
    private final MetricHistoryRepository metricHistoryRepository;

    public List<MetricBin> findAll() {           return metricHistoryRepository.findAll();
    }
}
