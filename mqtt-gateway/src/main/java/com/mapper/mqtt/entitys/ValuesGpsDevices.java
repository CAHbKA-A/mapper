package com.mapper.mqtt.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValuesGpsDevices {
    private String token;
    private String ownerId;
    private String alt;
    private String speed;
    private String lat;
    private String lon;

}
