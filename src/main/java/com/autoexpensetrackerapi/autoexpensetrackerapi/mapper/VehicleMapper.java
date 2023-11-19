package com.autoexpensetrackerapi.autoexpensetrackerapi.mapper;

import com.autoexpensetrackerapi.autoexpensetrackerapi.dto.VehicleDTO;
import com.autoexpensetrackerapi.autoexpensetrackerapi.model.Vehicle;
import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    Vehicle toVehicle(VehicleDTO vehicleDTO);

    VehicleDTO toVehicleDTO(Vehicle vehicle);

    Collection<VehicleDTO> toVehiclesDTO(Iterable<Vehicle> vehicles);
}
