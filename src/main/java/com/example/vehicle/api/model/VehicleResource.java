package com.example.vehicle.api.model;

import com.example.vehicle.core.enums.Status;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class VehicleResource {
    private long id;

    private String make;
    private String model;
    private String year;
    private String color;
    private String price;
    private String mileage;

    private String createdBy;
    private String updatedBy;
}
