package mqtt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
Приложение для тестирования. Имитирует отправку JSON в теле POST запорса на MQTT-шлюз
несколько разных устройств.

http://localhost:6000/sender -MQTT-шлюз
 */
@SpringBootApplication


public class IOTTestDeviceApplication {
    public static void main(String[] args) {
         SpringApplication.run(IOTTestDeviceApplication.class, args);
    }



}
