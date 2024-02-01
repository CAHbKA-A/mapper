package mqtt.controllers;


import jakarta.annotation.PostConstruct;
import mqtt.configuration.MqttGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class beant {

    @Autowired
 //   private RestTemplate restTemplate;

    @PostConstruct
    public void sayHello() {


            System.out.println("Привет");



                String url = "http://localhost:6000/sender2";
                String requestBody = "your request body";
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                HttpEntity<String> request = new HttpEntity<>(requestBody, headers);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForEntity(url, request, String.class);

        }
    }





