package com.mapper.devices.entites;

import jakarta.persistence.*;
import lombok.Data;


import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "ownerId", cascade = CascadeType.PERSIST)
    private List<Device> devicesList;

}
