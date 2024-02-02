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
    public ResponseEntity<?> publish(@RequestBody String mqttMessage) {

        try {
            JsonObject convertObject = new Gson().fromJson(mqttMessage, JsonObject.class);
            StringBuilder topic = new StringBuilder((convertObject.get("token").toString()));

            mqtGateway.senToMqtt(convertObject.get("values").toString(), topic.substring(1, topic.length() - 1));

            return ResponseEntity.ok("Success");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.ok("NOK");
        }
    }


}