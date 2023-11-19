package com.autoexpensetrackerapi.autoexpensetrackerapi.service;

import com.autoexpensetrackerapi.autoexpensetrackerapi.model.Vehicle;
import org.springframework.dao.DataAccessException;

import java.util.Optional;

public interface VehicleService {
    Optional<Vehicle> findById(Long id) throws DataAccessException;

    Iterable<Vehicle> findAll() throws DataAccessException;

    void save(Vehicle vehicle) throws DataAccessException;

    void delete(Vehicle vehicle) throws DataAccessException;
}

