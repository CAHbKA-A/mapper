package com.mapper.mqtt.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GpsDevice {

    private String name;
    private String token;
    private ValuesGpsDevices values;

}

