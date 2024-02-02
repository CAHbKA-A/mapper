package mqtt.controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import mqtt.devises.GpsDevice;
import mqtt.devises.ValuesGpsDevices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Component
public class beant {

    @Autowired

    @PostConstruct
    public void sendPostToMqtGateway() throws JsonProcessingException {

        GpsDevice gpsDevice = new GpsDevice();
        gpsDevice.setToken("IOT/token1");
        Random random = new Random();
        while (true) {
            try {
                Thread.sleep(1000 * random.nextInt(50));
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
            gpsDevice.setValues(new ValuesGpsDevices("1",(450- random.nextInt(20))+"",random.nextInt(120)+"",(104 - 0.111*random.nextInt(20))+"",(55 - 0.111*random.nextInt(20))+""));
            sendPost(convertToJSON(gpsDevice));
            System.out.println("sending");
        }




}

    private String convertToJSON(GpsDevice gpsDevice) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(gpsDevice);
        return json;
    }

    private void sendPost(String json) {
        String url = "http://localhost:6000/sender";
        String requestBody = json;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForEntity(url, request, String.class);
    }


}





