package mqtt.devises;

import lombok.Data;


@Data
public class GpsDevice {

    private String name ;
    private String deviceTypeId ;
    private String token ;
    private long ownerId ;

}
