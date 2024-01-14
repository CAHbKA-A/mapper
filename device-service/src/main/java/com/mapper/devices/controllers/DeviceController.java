package com.mapper.devices.controllers;

import com.mapper.devices.entites.Device;
import com.mapper.devices.repositories.DeviceRepository;
import com.mapper.devices.servises.DeviceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/devices")
public class DeviceController {
    private final DeviceRepository deviceRepository;
    private final DeviceService deviceService;


    @GetMapping
    public List<Device> findAllDevices() {

        return (deviceService.findAll());

    }

        @GetMapping("/{deviseId}")
    public Optional<Device> findDeviceById(@PathVariable Long  deviseId) {
        return (deviceService.findById(deviseId));
    }
}
