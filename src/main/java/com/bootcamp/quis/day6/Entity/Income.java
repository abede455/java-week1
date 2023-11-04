package com.bootcamp.quis.day6.Entity;

import java.time.LocalDate;

public class Income {
    public static Integer counter = 1;
    private Integer id;
    private Vehicle vehicle;
    private LocalDate transactionDate;
    private Double totalIncome;

    public Income(Vehicle vehicle, LocalDate transactionDate) {
        this.vehicle = vehicle;
        this.transactionDate = transactionDate;
        this.id = counter;
        counter++;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Double totalIncome) {
        this.totalIncome = totalIncome;
    }
}
