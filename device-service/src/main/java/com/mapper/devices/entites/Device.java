package com.mapper.devices.entites;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "devices")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "device_name")
    private String name;

    @Column(name = "deviceTypeId")
    private String device_type_id;

    @Column(name = "token_id")
    private String token;


    @Column(name = "owner_id")
    private long ownerId;

    @CreationTimestamp
    @Column(name = "created_at")
    private  LocalDateTime created;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private  LocalDateTime updatedAt;

    @OneToMany(mappedBy = "deviceId", cascade = CascadeType.PERSIST)
    private List<MetricBin> metricBinsList;





}
