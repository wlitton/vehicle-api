package com.example.vehicle.core.util;

import com.example.vehicle.core.entity.*;
import com.example.vehicle.core.params.*;
import org.springframework.stereotype.Component;

import java.util.stream.Collector;
import java.util.stream.Collectors;

@Component
public class ParamAndEntityBuilder {

    public VehicleEntity vehicleParamToEntity(VehicleParam param) {
        VehicleEntity entity = new VehicleEntity();

        entity.setId(param.getId());
        entity.setMake(param.getMake());
        entity.setModel(param.getModel());
        entity.setYear(param.getYear());
        entity.setColor(param.getColor());
        entity.setPrice(param.getPrice());
        entity.setMileage(param.getMileage());

        entity.setCreatedBy(param.getCreatedBy());
        entity.setUpdatedBy(param.getUpdatedBy());
        entity.setStatus(param.getStatus());

        return entity;
    }

    public VehicleParam vehicleEntityToParam(VehicleEntity entity) {

        VehicleParam param = new VehicleParam();
        param.setId(entity.getId());
        param.setMake(entity.getMake());
        param.setModel(entity.getModel());
        param.setYear(entity.getYear());
        param.setColor(entity.getColor());
        param.setPrice(entity.getPrice());
        param.setMileage(entity.getMileage());

        param.setCreatedBy(entity.getCreatedBy());
        param.setUpdatedBy(entity.getUpdatedBy());
        param.setStatus(entity.getStatus());

        return param;
    }
}
