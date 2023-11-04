package com.bootcamp.quis.day6.Entity;

import java.text.NumberFormat;
import java.time.LocalDate;

import com.bootcamp.quis.day6.Util;

public class IncomeForBoatAndPlane extends Income {

    public IncomeForBoatAndPlane(Vehicle vehicle, LocalDate transactionDate, Double orderPerHours) {
        super(vehicle, transactionDate);
        this.orderPerHours = orderPerHours;
        this.setTotalIncome();
    }

    @Override
    public String toString() {
        NumberFormat id = Util.getCurrencyInstance();
        return String.format("%nTransaction date : %s%n" +
                "Order per hours : %s%n" +
                "Total : %s", super.getTransactionDate().toString(), id.format(orderPerHours),
                id.format(super.getTotalIncome()));
    }

    private Double orderPerHours;

    public void setTotalIncome() {

        super.setTotalIncome(orderPerHours);

    }
}
