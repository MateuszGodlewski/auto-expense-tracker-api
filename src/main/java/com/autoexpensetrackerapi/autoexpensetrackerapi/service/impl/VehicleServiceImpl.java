package com.autoexpensetrackerapi.autoexpensetrackerapi.service.impl;

import com.autoexpensetrackerapi.autoexpensetrackerapi.model.Vehicle;
import com.autoexpensetrackerapi.autoexpensetrackerapi.repository.VehicleRepository;
import com.autoexpensetrackerapi.autoexpensetrackerapi.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Optional<Vehicle> findById(Long id) throws DataAccessException {
        return vehicleRepository.findById(id);
    }

    @Override
    public Iterable<Vehicle> findAll() throws DataAccessException {
        return vehicleRepository.findAll();
    }

    @Override
    public void save(Vehicle vehicle) throws DataAccessException {

        vehicleRepository.save(vehicle);
    }

    @Override
    public void delete(Vehicle vehicle) throws DataAccessException {
        vehicleRepository.delete(vehicle);
    }
}
