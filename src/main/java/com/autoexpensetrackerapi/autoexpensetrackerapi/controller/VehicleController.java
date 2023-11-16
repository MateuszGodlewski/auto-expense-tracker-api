package com.autoexpensetrackerapi.autoexpensetrackerapi.controller;

import com.autoexpensetrackerapi.autoexpensetrackerapi.model.Vehicle;
import com.autoexpensetrackerapi.autoexpensetrackerapi.service.VehicleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public Iterable<Vehicle> getAll() {
        return vehicleService.getAll();
    }
}
