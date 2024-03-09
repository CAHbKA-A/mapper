package mqtt.devices;

import lombok.Data;


@Data
public class GpsDevice {

    private String name;
    private String token;
    private ValuesGpsDevices values;

}

