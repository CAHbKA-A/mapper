package mqtt.devises;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;
@Configuration
public class GpsDevice {


    @Bean
    public void mqttClientFactory() {
        for (int i = 0; i < 10; i++) {
            System.out.println("2323");
        }
    }
}
