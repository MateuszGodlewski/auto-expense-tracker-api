package com.autoexpensetrackerapi.autoexpensetrackerapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VehicleTest {
    @Test
    public void testCreateVehicle() {
        Vehicle vehicle = new Vehicle();
        assertNotNull(vehicle);
    }
    @Test
    public void testGettersAndSetters() {
        Vehicle vehicle = new Vehicle();

        vehicle.setVIN("123ABC");
        assertEquals("123ABC", vehicle.getVIN());

        vehicle.setMake("Toyota");
        assertEquals("Toyota", vehicle.getMake());

        vehicle.setModel("Camry");
        assertEquals("Camry", vehicle.getModel());

        vehicle.setYear(2022);
        assertEquals(2022, vehicle.getYear());

        vehicle.setMileage(50000L);
        assertEquals(50000L, vehicle.getMileage());

        vehicle.setFuel(FuelType.DIESEL);
        assertEquals(FuelType.DIESEL, vehicle.getFuel());

        vehicle.setLicencePlate("XYZ123");
        assertEquals("XYZ123", vehicle.getLicencePlate());

        vehicle.setRefuelCounter(3);
        assertEquals(3, vehicle.getRefuelCounter());

        vehicle.setModelDescription("Sedan");
        assertEquals("Sedan", vehicle.getModelDescription());

        vehicle.setTransmission(TransmissionType.AUTOMATIC);
        assertEquals(TransmissionType.AUTOMATIC, vehicle.getTransmission());
    }

    @Test
    public void testEqualsAndHashCode() {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVIN("123ABC");
        vehicle1.setMake("Toyota");
        vehicle1.setModel("Camry");

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVIN("123ABC");
        vehicle2.setMake("Toyota");
        vehicle2.setModel("Camry");

        assertEquals(vehicle1, vehicle2);
        assertEquals(vehicle1.hashCode(), vehicle2.hashCode());
    }
}
