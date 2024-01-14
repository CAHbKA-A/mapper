package com.mapper.devices.servises;

import com.mapper.devices.entites.MetricBin;
import com.mapper.devices.repositories.DeviceRepository;
import com.mapper.devices.repositories.MetricHistoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class MetricService {
    private final MetricHistoryRepository metricHistoryRepository;
//    private final DeviceRepository deviceRepository;


    public List<MetricBin> findAll() {return metricHistoryRepository.findAll();
    }

    public List<MetricBin> findMetricBinByDeviceId(Long deviсeId) {


        return metricHistoryRepository.findAllByDeviceId(deviсeId);
    }

//    public List<MetricBin> findMetricBinById(long deviceId) {
//
//        return metricHistoryRepository.findAllById();
//    }
}
