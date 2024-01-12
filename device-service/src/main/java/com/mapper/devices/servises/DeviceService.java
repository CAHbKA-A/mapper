package com.mapper.devices.servises;

import com.mapper.devices.entites.Devices;
import com.mapper.devices.repositories.DeviceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DeviceService {
    private final DeviceRepository deviceRepository;

    public List<Devices> findAll() {
        return deviceRepository.findAll();
    }


}
