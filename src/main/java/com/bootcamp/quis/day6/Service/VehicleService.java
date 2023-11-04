package com.bootcamp.quis.day6.Service;

import java.util.List;

import com.bootcamp.quis.day6.Entity.Vehicle;
import com.bootcamp.quis.day6.Repository.VehicleRepository;

public class VehicleService {

    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.addVehicle(vehicle);
    }

    public List<Vehicle> getAll() {
        return vehicleRepository.getAll();
    }

}
