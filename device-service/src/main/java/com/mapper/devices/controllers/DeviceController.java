package com.mapper.devices.controllers;

import com.mapper.devices.entites.Devices;
import com.mapper.devices.repositories.DeviceRepository;
import com.mapper.devices.servises.DeviceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/devices")
public class DeviceController {
    private final DeviceRepository deviceRepository;
    private final DeviceService deviceService;


    @GetMapping
    public List<Devices> findAllOrders() {

        return (deviceService.findAll());

    }
}
