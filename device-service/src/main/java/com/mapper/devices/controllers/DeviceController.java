package com.mapper.devices.controllers;

import com.mapper.devices.entites.Device;
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
import java.util.UUID;

@Slf4j
@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/devices")
//@RequestMapping("/devices")
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

    //deviceID by token
    @GetMapping("/token/{token}")
    public Long findDeviceIdByToken (@PathVariable String  token) {
              return (deviceService.findFirstByToken(token));
    }
//  http://localhost:8080/api/v1/devices/token/asw3
}
