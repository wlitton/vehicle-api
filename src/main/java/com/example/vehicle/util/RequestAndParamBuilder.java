package com.example.vehicle.util;

import com.example.vehicle.api.model.*;
import com.example.vehicle.core.params.*;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class RequestAndParamBuilder {

    public VehicleResource vehicleParamToResource(VehicleParam param){
        VehicleResource resource = new VehicleResource();

        resource.setId(param.getId());
        resource.setMake(param.getMake());
        resource.setModel(param.getModel());
        resource.setYear(param.getYear());
        resource.setColor(param.getColor());
        resource.setPrice(param.getPrice());
        resource.setMileage(param.getMileage());
        resource.setCreatedBy(param.getCreatedBy());
        resource.setUpdatedBy(param.getUpdatedBy());
  
        return resource;
    }

    public VehicleParam vehicleResourceToParam(VehicleResource resource){
        VehicleParam param = new VehicleParam();

        param.setId(resource.getId());
        param.setMake(resource.getMake());
        param.setModel(resource.getModel());
        param.setYear(resource.getYear());
        param.setColor(resource.getColor());
        param.setPrice(resource.getPrice());
        param.setMileage(resource.getMileage());
   
        param.setCreatedBy(resource.getCreatedBy());
        param.setUpdatedBy(resource.getUpdatedBy());

        return param;
    }
}
