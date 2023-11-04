package com.bootcamp.quis.day6.Entity;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

import com.bootcamp.quis.day6.Util;

public class IncomeCar extends Income {

    private Double rent;
    private Double driver;
    private Integer order;
    private Double orderPerKM;

    @Override
    public String toString() {
        NumberFormat id = Util.getCurrencyInstance();
        Car car = (Car) super.getVehicle();
        String result = "";

        if (car.getVehicleType().equals("SUV")) {
            result = String.format("%nTransaction date : %s%n" +
                    "Rent : %s%n" +
                    "Driver : %s%n" +
                    "Total : %s", super.getTransactionDate().toString(), id.format(rent), id.format(driver),
                    id.format(super.getTotalIncome()));
        }

        if (car.getVehicleType().equals("Taxi")) {
            result = String.format("%nTransaction date : %s%n" +
                    "Order : %s%n" +
                    "Order per KM : %s%n" +
                    "Total : %s", super.getTransactionDate(), order, id.format(orderPerKM),
                    id.format(super.getTotalIncome()));
        }
        return result;
    }

    public IncomeCar(Vehicle vehicle, LocalDate transactionDate, Double rent,
            Double driver, Integer order, Double orderPerKM) {
        super(vehicle, transactionDate);
        this.rent = rent;
        this.driver = driver;
        this.order = order;
        this.orderPerKM = orderPerKM;
        this.setTotalIncome();
    }

    public void setTotalIncome() {
        Car car = (Car) this.getVehicle();
        Double totalIncome = 0d;
        if (car.getVehicleType().equals("SUV")) {
            totalIncome = rent + driver;
        }

        if (car.getVehicleType().equals("Taxi")) {
            totalIncome = order * orderPerKM;
        }
        super.setTotalIncome(totalIncome);
    }

    public Double getRent() {
        return rent;
    }

    public void setRent(Double rent) {
        this.rent = rent;
    }

    public Double getDriver() {
        return driver;
    }

    public void setDriver(Double driver) {
        this.driver = driver;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Double getOrderPerKM() {
        return orderPerKM;
    }

    public void setOrderPerKM(Double orderPerKM) {
        this.orderPerKM = orderPerKM;
    }

}
