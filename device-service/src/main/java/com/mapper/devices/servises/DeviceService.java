package com.mapper.devices.servises;

import com.mapper.devices.entites.Device;
import com.mapper.devices.repositories.DeviceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class DeviceService {
    private final DeviceRepository deviceRepository;

    public List<Device> findAll() {
        return deviceRepository.findAll();
    }

    public Optional<Device> findById(Long id) {
        return deviceRepository.findById(id);
    }

  //  public List<Device> findMetricBinById(Long deviceId) {return deviceRepository.findAllById(deviceId);

   // }
}
