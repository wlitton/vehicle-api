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
@RequestMapping("thanks")
public class ThanksEndpoint {

    @GetMapping
    public String get() {

        return "Thanks for considering me for the developer position!";
    }

}
