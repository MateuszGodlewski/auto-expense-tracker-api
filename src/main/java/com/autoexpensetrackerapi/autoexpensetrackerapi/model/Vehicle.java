package com.autoexpensetrackerapi.autoexpensetrackerapi.model;

import com.autoexpensetrackerapi.autoexpensetrackerapi.dto.VehicleDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Vehicle extends BaseEntity {
    private String VIN;
    private String make;
    private String model;
    private Integer year;
    private Long mileage;
    @Enumerated(EnumType.STRING)
    private FuelType fuel;
    private String licencePlate;
    private Integer refuelCounter;
    private String modelDescription;
    @Enumerated(EnumType.STRING)
    private TransmissionType transmission;

    public void update(VehicleDTO vehicle) {
        if (vehicle.getId() != null) setId(vehicle.getId());
        if (vehicle.getMake() != null) setMake(vehicle.getMake());
        if (vehicle.getModel() != null) setModel(vehicle.getModel());
        if (vehicle.getYear() != null) setYear(vehicle.getYear());
        if (vehicle.getMileage() != null) setMileage(vehicle.getMileage());
        if (vehicle.getFuel() != null) setFuel(vehicle.getFuel());
        if (vehicle.getLicencePlate() != null) setLicencePlate(vehicle.getLicencePlate());
        if (vehicle.getRefuelCounter() != null) setRefuelCounter(vehicle.getRefuelCounter());
        if (vehicle.getModelDescription() != null) setModelDescription(vehicle.getModelDescription());
        if (vehicle.getTransmission() != null) setTransmission(vehicle.getTransmission());
    }
}
