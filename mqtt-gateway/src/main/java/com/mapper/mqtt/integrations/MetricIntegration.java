package com.mapper.mqtt.integrations;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import ru.mapper.api.MetricDto;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class MetricIntegration {
    private final WebClient productServiceWebClient;

}
