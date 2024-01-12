package com.mapper.devices.entites;



import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "device_type")
public class DeviceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "versionId")
    private String version_id;

    @Column(name = "description")
    private String description;

    @Column(name = "metrics")
    private String metrics;
}
