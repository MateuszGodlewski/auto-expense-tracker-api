package com.autoexpensetrackerapi.autoexpensetrackerapi.dto;

import com.autoexpensetrackerapi.autoexpensetrackerapi.model.FuelType;
import com.autoexpensetrackerapi.autoexpensetrackerapi.model.TransmissionType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDTO {
    private Long id;
    private String VIN;
    private String make;
    private String model;
    private Integer year;
    private Long mileage;
    private FuelType fuel;
    private String licencePlate;
    private Integer refuelCounter;
    private String modelDescription;
    private TransmissionType transmission;
}
