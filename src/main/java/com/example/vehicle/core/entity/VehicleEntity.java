package com.example.vehicle.core.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity(name = "vehicle")
public class VehicleEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "make")
    private String make;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private String year;

    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private String price;

    @Column(name = "mileage")
    private String mileage;

}
