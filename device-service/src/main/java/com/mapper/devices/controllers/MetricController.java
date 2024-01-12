package com.mapper.devices.controllers;

import com.mapper.devices.entites.MetricBin;
import com.mapper.devices.repositories.MetricHistoryRepository;
import com.mapper.devices.servises.MetricService;
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
@RequestMapping("/metric")
public class MetricController {
    private final MetricHistoryRepository metricHistoryRepository;
    private final MetricService metricService;


    @GetMapping
    public List<MetricBin> findAllMetricBin() {

        return (metricService.findAll());

    }
}
