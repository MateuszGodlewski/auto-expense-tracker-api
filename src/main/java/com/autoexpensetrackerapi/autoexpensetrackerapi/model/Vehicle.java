package com.autoexpensetrackerapi.autoexpensetrackerapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehicles")
public class Vehicle extends BaseEntity {
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
}
