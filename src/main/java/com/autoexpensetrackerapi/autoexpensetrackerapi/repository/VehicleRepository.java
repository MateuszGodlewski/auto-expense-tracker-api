package com.autoexpensetrackerapi.autoexpensetrackerapi.repository;

import com.autoexpensetrackerapi.autoexpensetrackerapi.model.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
}
