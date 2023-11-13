package com.autoexpensetrackerapi.autoexpensetrackerapi.dto;

import com.autoexpensetrackerapi.autoexpensetrackerapi.model.FuelType;
import com.autoexpensetrackerapi.autoexpensetrackerapi.model.TransmissionType;
import com.autoexpensetrackerapi.autoexpensetrackerapi.model.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDTO {
    private String make;
    private String model;
    private String modelDescription;
    private String licencePlate;
    private String VIN;
    private int year;
    private int capacity;
    private double mileage;
    private FuelType fuelType;
    private TransmissionType transmissionType;

    VehicleDTO(Vehicle vehicle) {
        make = vehicle.getMake();
        model = vehicle.getModel();
        modelDescription = vehicle.getModelDescription();
        licencePlate = vehicle.getLicencePlate();
        VIN = vehicle.getVIN();
        year = vehicle.getYear();
        capacity = vehicle.getCapacity();
        mileage = vehicle.getMileage();
        fuelType = vehicle.getFuelType();
        transmissionType = vehicle.getTransmissionType();
    }
}
