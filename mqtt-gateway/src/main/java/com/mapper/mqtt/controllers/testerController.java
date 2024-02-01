package com.mapper.mqtt.controllers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import com.mapper.mqtt.intarfaces.MqttGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testerController {
    @Autowired
    MqttGateway mqtGateway;
    @PostMapping("/sender")
    public ResponseEntity<?> publish(@RequestBody String mqttMessage){

        try {
            JsonObject convertObject = new Gson().fromJson(mqttMessage, JsonObject.class);
            StringBuilder topic = new StringBuilder((convertObject.get("topic").toString()));

            mqtGateway.senToMqtt(convertObject.get("message").toString(), topic.substring(1,topic.length()));
          //  mqtGateway.senToMqtt(convertObject.get("message").toString(), convertObject.get("topic").toString());

            return ResponseEntity.ok("Success");
        }catch(Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.ok("NOK");
        }
    }

    @PostMapping("/sender2")
    public ResponseEntity<?> publish2(@RequestBody String mqttMessage){

        try {
            mqtGateway.senToMqtt("message2", "IOT/CO2");

            return ResponseEntity.ok("Success");
        }catch(Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.ok("NOK");
        }
    }

}