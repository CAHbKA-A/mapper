package com.mapper.mqtt.integrations;

import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class MetricIntegration {
    //private final WebClient DeviceServiceWebClient; //рест убрали, заинжектили вебклиента

    //узнать по ткену что за устройство
//    public String getDeviceIdByToken(String token) {
//
//        return deviceWebClient.get()//тип запроса
//                .uri("http://localhost:8080/api/v1/devices/token/" + token) //куда
//                //можно добавить хедеры, куки пр
//                // .header("name", "ewfwew")
//                .retrieve() //отоправляем запрос. возрващает responseSpec(упаковка над ответом)
//                .onStatus(//перехват статусов
//                        httpStatus -> httpStatus.value() == HttpStatus.NOT_FOUND.value(), //если 404
//                        clientResponse -> Mono.error(new ResourceNotFoundException("ошибка в Device service . или устройство не найдено"))
//                )//если статус 200 или 201
//               .bodyToMono(String.class) //перобразуем тело запроса к дто
//                //тут можно добавить фильтры
//                .block();
//    }
}
//http://localhost:8080/api/v1/devices/token/asw3