package com.mapper.mqtt.parsers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mapper.mqtt.entitys.ValuesGpsDevices;
import org.springframework.messaging.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonParser {
    private static final Logger logger = LoggerFactory.getLogger(JsonParser.class);
//    private  MetricIntegration metricIntegration = new ;
    public void parse(Message<?> massage) {


        //конвертим принятый json  в объект
        ValuesGpsDevices valuesGpsDevices = jsonConvert(massage);

        System.out.println(valuesGpsDevices);
      //  logger.info(String.valueOf(valuesGpsDevices));

        System.out.println(valuesGpsDevices.getToken());

     //   System.out.println( metricIntegration.getDeviceIdByToken (valuesGpsDevices.getToken()));

        //по токен
    }






    private ValuesGpsDevices jsonConvert(Message<?> massage) {
        ObjectMapper mapper = new ObjectMapper();
        String json = massage.getPayload().toString();
       ValuesGpsDevices valuesGpsDevices = new ValuesGpsDevices();
         try {

            valuesGpsDevices = mapper.readValue(json, ValuesGpsDevices.class);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return valuesGpsDevices;
    }
}
