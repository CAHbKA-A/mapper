package com.mapper.mqtt;
/*шлюз для mqtt сообщений от устройств*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


public class MqttApplication   {
    public static void main(String[] args) {
         SpringApplication.run(MqttApplication.class, args);
    }



}
