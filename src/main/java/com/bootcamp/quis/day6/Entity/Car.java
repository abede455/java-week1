package com.bootcamp.quis.day6.Entity;

public class Car extends VehicleImpl {

    public Car(String noPolice, String vehicleType, Integer year, Double price, Double tax, Integer seat) {
        super(noPolice, vehicleType, seat, price, tax, seat);
    }
}
