package com.bootcamp.quis.day6.Entity;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class VehicleImpl implements Vehicle {

    private String noPolice;
    private String vehicleType;
    private Integer year;
    private Double price;
    private Double tax;
    private Integer seat;
    private List<Income> incomes;
    private Double totalIncome;

    public VehicleImpl(String noPolice, String vehicleType, Integer year, Double price, Double tax, Integer seat) {
        this.noPolice = noPolice;
        this.vehicleType = vehicleType;
        this.year = year;
        this.price = price;
        this.tax = tax;
        this.seat = seat;
        this.incomes = new ArrayList<Income>();
    }

    public String incomeString() {
        String result = "";
        for (Income income : incomes) {
            result += "\n" + income.toString();
        }
        return result;
    }

    @Override
    public String toString() {
        NumberFormat id = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return String.format("%s%nNo Police : %s%n" +
                "Vehicle Type : %s%n" +
                "Year : %s%n" +
                "Price : %s%n" +
                "Tax(in Year) : %s%n" +
                "Seat : %s%n" +
                "Income : %s%n", this.getClass().getSimpleName(), noPolice, vehicleType, year, id.format(price),
                id.format(tax), seat, incomeString());
    }

    public String getNoPolice() {
        return noPolice;
    }

    public void setNoPolice(String noPolice) {
        this.noPolice = noPolice;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public List<Income> getIncomes() {
        return incomes;
    }

    public void addIncome(Income income) {
        this.incomes.add(income);
    }

    public Double getTotalIncome() {
        setTotalIncome();
        return this.totalIncome;
    }

    public void setTotalIncome() {

        Double totalIncome = 0d;
        for (Income income : incomes) {
            totalIncome += income.getTotalIncome();
        }
        this.totalIncome = totalIncome;

    }

}
