package com.example.vehicle.api.controller;

import com.example.vehicle.api.model.VehicleResource;
import com.example.vehicle.core.enums.Status;
import com.example.vehicle.core.service.VehicleService;
import com.example.vehicle.util.RequestAndParamBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("vehicle")
public class VehicleEndpoint {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private RequestAndParamBuilder requestAndParamBuilder;

    @GetMapping
    public List<VehicleResource> get(@RequestParam(required = false, defaultValue = "0") String offset, @RequestParam(required = false, defaultValue = "5") String count) {

        return vehicleService.getAll(Integer.parseInt(offset), Integer.parseInt(count)).stream()
                .filter(x -> x.getStatus().equals(Status.ACTIVE))
                .map(x -> requestAndParamBuilder.vehicleParamToResource(x))
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/make/{id}")
    public List<VehicleResource> getMake(@PathVariable String id, @RequestParam(required = false, defaultValue = "0") String offset, @RequestParam(required = false, defaultValue = "5") String count) {

        return vehicleService.getMake(id, Integer.parseInt(offset), Integer.parseInt(count)).stream()
                .filter(x -> x.getStatus().equals(Status.ACTIVE))
                .map(x -> requestAndParamBuilder.vehicleParamToResource(x))
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/model/{id}")
    public List<VehicleResource> getModel(@PathVariable String id, @RequestParam(required = false, defaultValue = "0") String offset, @RequestParam(required = false, defaultValue = "5") String count) {

        return vehicleService.getModel(id, Integer.parseInt(offset), Integer.parseInt(count)).stream()
                .filter(x -> x.getStatus().equals(Status.ACTIVE))
                .map(x -> requestAndParamBuilder.vehicleParamToResource(x))
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/year/{id}")
    public List<VehicleResource> getYear(@PathVariable String id, @RequestParam(required = false, defaultValue = "0") String offset, @RequestParam(required = false, defaultValue = "5") String count) {

        return vehicleService.getYear(id, Integer.parseInt(offset), Integer.parseInt(count)).stream()
                .filter(x -> x.getStatus().equals(Status.ACTIVE))
                .map(x -> requestAndParamBuilder.vehicleParamToResource(x))
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/color/{id}")
    public List<VehicleResource> getColor(@PathVariable String id, @RequestParam(required = false, defaultValue = "0") String offset, @RequestParam(required = false, defaultValue = "5") String count) {

        return vehicleService.getColor(id, Integer.parseInt(offset), Integer.parseInt(count)).stream()
                .filter(x -> x.getStatus().equals(Status.ACTIVE))
                .map(x -> requestAndParamBuilder.vehicleParamToResource(x))
                .collect(Collectors.toList());
    }
}
