package com.bootcamp.quis.day6;

import com.bootcamp.quis.day6.Repository.VehicleRepository;
import com.bootcamp.quis.day6.Service.VehicleService;

public class MainDay6 {
    public static void main(String[] args) {
        VehicleRepository vehicleRepository = new VehicleRepository();
        VehicleService vehicleService = new VehicleService(vehicleRepository);
        View view = new View(vehicleService);

        view.init();
        view.showListVehicle();
        view.summary();
    }
}
