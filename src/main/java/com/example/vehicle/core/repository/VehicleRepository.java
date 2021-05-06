package com.example.vehicle.core.repository;

import com.example.vehicle.core.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface VehicleRepository extends JpaRepository<VehicleEntity,Long> {
    // Page<VehicleEntity> findAll(Pageable limit);
    List<VehicleEntity> findByMake(String make, Pageable limit);
    List<VehicleEntity> findByModel(String model, Pageable limit);
    List<VehicleEntity> findByYear(String year, Pageable limit);
    List<VehicleEntity> findByColor(String color, Pageable limit);

    // @Query("SELECT u FROM vehicle u WHERE u.make = ?1 and u.model = ?2")
    // List<VehicleEntity> findVehicleByMakeAndModel(String make, String model, Pageable limit);
}
