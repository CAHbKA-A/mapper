package com.mapper.devices.entites;

import jakarta.persistence.*;
import lombok.Data;


import java.util.List;

@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "description")
    private String description;

//    @OneToMany(mappedBy = "id", cascade = CascadeType.PERSIST)
//    private List<Devices> devicesList;

}
