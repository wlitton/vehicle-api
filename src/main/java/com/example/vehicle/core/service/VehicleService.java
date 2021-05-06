package com.example.vehicle.core.service;

import com.example.vehicle.core.params.VehicleParam;

import java.util.List;

public interface VehicleService {

    List<VehicleParam> getAll(int offset, int count);
    List<VehicleParam> getMake(String make, int offset, int count);
    List<VehicleParam> getModel(String model, int offset, int count);
    List<VehicleParam> getYear(String year, int offset, int count);
    List<VehicleParam> getColor(String color, int offset, int count);
}
