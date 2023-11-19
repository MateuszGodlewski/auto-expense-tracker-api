package com.autoexpensetrackerapi.autoexpensetrackerapi.controller;

import com.autoexpensetrackerapi.autoexpensetrackerapi.dto.VehicleDTO;
import com.autoexpensetrackerapi.autoexpensetrackerapi.mapper.VehicleMapper;
import com.autoexpensetrackerapi.autoexpensetrackerapi.model.Vehicle;
import com.autoexpensetrackerapi.autoexpensetrackerapi.service.impl.VehicleServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {

    private final VehicleServiceImpl vehicleServiceImpl;
    private final VehicleMapper vehicleMapper;

    public VehicleController(VehicleServiceImpl vehicleServiceImpl, VehicleMapper vehicleMapper) {
        this.vehicleServiceImpl = vehicleServiceImpl;
        this.vehicleMapper = vehicleMapper;
    }

    @GetMapping
    public ResponseEntity<Collection<VehicleDTO>> getAll() {
        Collection<VehicleDTO> vehicles = vehicleMapper.toVehiclesDTO(vehicleServiceImpl.findAll());
        if (vehicles == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(vehicles, HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<VehicleDTO> getById(@PathVariable Long id) {
        Optional<Vehicle> vehicle = vehicleServiceImpl.findById(id);
        if (vehicle.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            VehicleDTO vehicleDTO = vehicleMapper.toVehicleDTO(vehicle.get());
            return new ResponseEntity<>(vehicleDTO, HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<VehicleDTO> add(@RequestBody VehicleDTO vehicleDTO) {
        vehicleServiceImpl.save(vehicleMapper.toVehicle(vehicleDTO));
        return new ResponseEntity<>(vehicleDTO, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VehicleDTO> edit(@PathVariable Long id, @RequestBody VehicleDTO vehicleDTO) {
        Optional<Vehicle> currentVehicle = vehicleServiceImpl.findById(id);
        if (currentVehicle.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        currentVehicle.get().update(vehicleDTO);
        vehicleServiceImpl.save(currentVehicle.get());
        return new ResponseEntity<>(vehicleMapper.toVehicleDTO(currentVehicle.get()), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<VehicleDTO> delete(@PathVariable Long id) {
        Optional<Vehicle> vehicle = vehicleServiceImpl.findById(id);
        if (vehicle.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        vehicleServiceImpl.delete(vehicle.get());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
