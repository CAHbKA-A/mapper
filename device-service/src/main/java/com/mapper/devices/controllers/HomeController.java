// TODO: 18.01.2024 удалить контроллер.
package com.mapper.devices.controllers;

import com.mapper.devices.entites.Device;
import com.mapper.devices.servises.DeviceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class HomeController {
    private final DeviceService deviceService;
//    @GetMapping("/")
//    public String home() {
//        return "home";
//    }
//

@GetMapping
    public String getDevices(Model model) {
    List<Device> devises = deviceService.findAll();
    model.addAttribute("devises", devises);
    return "homeDevices";
}



}