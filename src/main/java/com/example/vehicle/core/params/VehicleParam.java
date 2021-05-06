package com.example.vehicle.core.params;

import com.example.vehicle.core.enums.Status;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class VehicleParam {
    private long id;

    private String make;
    private String model;
    private String year;
    private String color;
    private String price;
    private String mileage;

    private String createdBy;
    private String updatedBy;
    private Status status;
}
