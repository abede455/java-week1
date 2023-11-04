package com.bootcamp.quis.day6;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import com.bootcamp.quis.day6.Entity.Boat;
import com.bootcamp.quis.day6.Entity.Car;
import com.bootcamp.quis.day6.Entity.Income;
import com.bootcamp.quis.day6.Entity.IncomeCar;
import com.bootcamp.quis.day6.Entity.IncomeForBoatAndPlane;
import com.bootcamp.quis.day6.Entity.Plane;
import com.bootcamp.quis.day6.Entity.Vehicle;
import com.bootcamp.quis.day6.Entity.VehicleImpl;
import com.bootcamp.quis.day6.Service.VehicleService;

public class View {

    private VehicleService vehicleService;

    public View(VehicleService vehicleService) {

        this.vehicleService = vehicleService;
    }

    public void summary() {
        NumberFormat id = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("Summary");
        List<Vehicle> vehicles = vehicleService.getAll();
        Double totalIncomeCar = 0d;
        Double totalIncomePlane = 0d;
        Double totalIncomeBoat = 0d;
        Double totalTax = 0d;
        Integer totalCar = 0;
        Integer totalPlane = 0;
        Integer totalBoat = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                totalIncomeCar += vehicle.getTotalIncome();
                totalCar++;
            }
            if (vehicle instanceof Boat) {
                totalIncomeBoat += vehicle.getTotalIncome();
                totalBoat++;
            }
            if (vehicle instanceof Plane) {
                totalIncomePlane += vehicle.getTotalIncome();
                totalPlane++;
            }
            VehicleImpl vehicleImpl = (VehicleImpl) vehicle;
            totalTax += vehicleImpl.getTax();
        }
        System.out.println("Total Income Car = " + id.format(totalIncomeCar));
        System.out.println("Total Income Plane = " + id.format(totalIncomePlane));
        System.out.println("Total Income Boat = " + id.format(totalIncomeBoat));
        System.out.println("Total TAX = " + id.format(totalTax));
        System.out.println("Total Car = " + totalCar);
        System.out.println("Total Plane = " + totalPlane);
        System.out.println("Total Boat = " + totalBoat);

    }

    public void showListVehicle() {
        List<Vehicle> vehicles = vehicleService.getAll();
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("\n=========================");
        }
    }

    public void init() {

        // inisialisasi vehicle
        Vehicle suv1 = new Car("D 1001 UM", "SUV", 2010, 350_000_000D, 3_500_000D, 4);
        Income incomeSuv1 = new IncomeCar(suv1, stringLocalDate("10/01/2023"), 500_000D, 150_000D, null, null);
        suv1.addIncome(incomeSuv1);
        vehicleService.addVehicle(suv1);

        Vehicle suv2 = new Car("D 1002 UM", "SUV", 2010, 350_000_000D, 3_500_000D, 4);
        Income incomeSuv2 = new IncomeCar(suv2, stringLocalDate("10/01/2023"), 500_000D, 150_000D, null, null);
        suv2.addIncome(incomeSuv2);
        vehicleService.addVehicle(suv2);

        Vehicle suv3 = new Car("D 1003 UM", "SUV", 2015, 350_000_000D, 3_500_000D, 5);
        Income incomeSuv3 = new IncomeCar(suv3, stringLocalDate("12/01/2023"), 500_000D, 150_000D, null, null);
        suv3.addIncome(incomeSuv3);
        vehicleService.addVehicle(suv3);

        Vehicle suv4 = new Car("D 1004 UM", "SUV", 2015, 350_000_000D, 3_500_000D, 5);
        Income incomeSuv4 = new IncomeCar(suv4, stringLocalDate("13/01/2023"), 500_000D, 150_000D, null, null);
        suv4.addIncome(incomeSuv4);
        vehicleService.addVehicle(suv4);

        // inisialisai taxi
        Vehicle taxi1 = new Car("D 11 UK", "Taxi", 2002, 175_000_000D, 1_750_000D, 4);
        Income incomeTaxi1 = new IncomeCar(taxi1, stringLocalDate("12/01/2023"), null, null, 45, 4500D);
        taxi1.addIncome(incomeTaxi1);
        vehicleService.addVehicle(taxi1);

        Vehicle taxi2 = new Car("D 12 UK", "Taxi", 2015, 225_000_000D, 2_250_000D, 4);
        Income incomeTaxi2 = new IncomeCar(taxi2, stringLocalDate("13/01/2023"), null, null, 75, 4500D);
        taxi2.addIncome(incomeTaxi2);
        vehicleService.addVehicle(taxi2);

        Vehicle taxi3 = new Car("D 13 UK", "Taxi", 2020, 275_000_000D, 2_750_000D, 4);
        Income incomeTaxi3 = new IncomeCar(taxi3, stringLocalDate("13/01/2023"), null, null, 90, 4500D);
        taxi3.addIncome(incomeTaxi3);
        vehicleService.addVehicle(taxi3);

        Vehicle privateJet1 = new Plane("ID8089", "PrivateJet", 2015, 150_000_000_000D, 1_500_000_000D, 12);
        Income incomeJet1 = new IncomeForBoatAndPlane(privateJet1, stringLocalDate("23/12/2022"), 55_000_000D);
        privateJet1.addIncome(incomeJet1);
        vehicleService.addVehicle(privateJet1);

        Vehicle privateJet2 = new Plane("ID8099", "PrivateJet", 2018, 175_000_000_000D, 1_750_000_000D, 15);
        Income incomeJet2 = new IncomeForBoatAndPlane(privateJet2, stringLocalDate("25/12/2022"), 75_000_000D);
        privateJet2.addIncome(incomeJet2);
        vehicleService.addVehicle(privateJet2);

        Vehicle boat1 = new Boat("Boat18", "Boat", 2020, 2_000_000_000D, 20_000_000D, 12);
        Income incomeBoat1 = new IncomeForBoatAndPlane(boat1, stringLocalDate("25/12/2022"), 10_000_000D);
        boat1.addIncome(incomeBoat1);
        vehicleService.addVehicle(boat1);

    }

    public LocalDate stringLocalDate(String date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, format);
        return localDate;
    }
}
