package com.example.vehicle.core.service;

import com.example.vehicle.core.entity.VehicleEntity;
import com.example.vehicle.core.enums.Status;
import com.example.vehicle.core.params.VehicleParam;
import com.example.vehicle.core.repository.VehicleRepository;
import com.example.vehicle.core.util.ParamAndEntityBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private ParamAndEntityBuilder paramAndEntityBuilder;

    @Override
    public List<VehicleParam> getAll(int offset, int count) {
        Pageable limit = PageRequest.of(offset,count);
        Page<VehicleEntity> pagedResult = vehicleRepository.findAll(limit);
        List<VehicleEntity> entities = pagedResult.getContent();
        return entities.stream()
                .filter(x-> x.getStatus().equals(Status.ACTIVE))
                .map(x->paramAndEntityBuilder.vehicleEntityToParam(x))
                .collect(Collectors.toList());
    }

    @Override
    public List<VehicleParam> getMake(String make, int offset, int count) {
        Pageable limit = PageRequest.of(offset,count);
        List<VehicleEntity> entities = vehicleRepository.findByMake(make, limit);
        return entities.stream()
                .filter(x-> x.getStatus().equals(Status.ACTIVE))
                .map(x->paramAndEntityBuilder.vehicleEntityToParam(x))
                .collect(Collectors.toList());
    }

    @Override
    public List<VehicleParam> getModel(String model, int offset, int count) {
        Pageable limit = PageRequest.of(offset,count);
        List<VehicleEntity> entities = vehicleRepository.findByModel(model, limit);
        return entities.stream()
                .filter(x-> x.getStatus().equals(Status.ACTIVE))
                .map(x->paramAndEntityBuilder.vehicleEntityToParam(x))
                .collect(Collectors.toList());
    }

    @Override
    public List<VehicleParam> getYear(String year, int offset, int count) {
        Pageable limit = PageRequest.of(offset,count);
        List<VehicleEntity> entities = vehicleRepository.findByYear(year, limit);
        return entities.stream()
                .filter(x-> x.getStatus().equals(Status.ACTIVE))
                .map(x->paramAndEntityBuilder.vehicleEntityToParam(x))
                .collect(Collectors.toList());
    }

    @Override
    public List<VehicleParam> getColor(String color, int offset, int count) {
        Pageable limit = PageRequest.of(offset,count);
        List<VehicleEntity> entities = vehicleRepository.findByColor(color, limit);
        return entities.stream()
                .filter(x-> x.getStatus().equals(Status.ACTIVE))
                .map(x->paramAndEntityBuilder.vehicleEntityToParam(x))
                .collect(Collectors.toList());
    }

}
