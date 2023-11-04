package com.bootcamp.quis.day6.Repository;

import java.util.ArrayList;
import java.util.List;

import com.bootcamp.quis.day6.Entity.Vehicle;

public class VehicleRepository {

    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getAll() {
        return vehicles;
    }
}
