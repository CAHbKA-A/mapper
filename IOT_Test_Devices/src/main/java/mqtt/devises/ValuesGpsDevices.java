package mqtt.devises;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ValuesGpsDevices {
    private String ownerId;
    private String alt;
    private String speed;
    private String lat;
    private String lon;

}
