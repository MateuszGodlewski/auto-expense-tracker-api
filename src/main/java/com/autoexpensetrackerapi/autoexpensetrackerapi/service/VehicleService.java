package com.autoexpensetrackerapi.autoexpensetrackerapi.service;

import com.autoexpensetrackerapi.autoexpensetrackerapi.model.Vehicle;
import com.autoexpensetrackerapi.autoexpensetrackerapi.repository.VehicleRepository;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Iterable<Vehicle> getAll() {
        return vehicleRepository.findAll();
    }
}
