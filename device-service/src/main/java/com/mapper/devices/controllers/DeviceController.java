package com.mapper.devices.controllers;

import com.mapper.devices.entites.Device;
import com.mapper.devices.repositories.DeviceRepository;
import com.mapper.devices.servises.DeviceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/devices")
public class DeviceController {

    private final DeviceService deviceService;



//    @ModelAttribute(name = "devices")
//    public String getDevices(Model model) {
//        model.addAttribute("devices", deviceService.findAll());
//        return "devices";
//
//   }
    @GetMapping
    public List<Device> findAllDevices() {

        return (deviceService.findAll());

    }

        @GetMapping("/{deviceId}")
    public Optional<Device> findDeviceById(@PathVariable Long  deviceId) {
        return (deviceService.findById(deviceId));
    }

}
