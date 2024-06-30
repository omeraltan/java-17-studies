package org.basics.oca8._40_Comparable_Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Vehicle {
    private String brand;
    private String model;
    private Integer year;
    private Long price;

    public Vehicle(String brand, String model, Integer year, Long price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", year=" + year +
            ", price=" + price +
            '}';
    }
}

public class ComparatorNotes {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("BMW", "3Series", 2018, 5000L);
        Vehicle vehicle2 = new Vehicle("Mercedes", "CSeries", 2015, 15000L);
        Vehicle vehicle3 = new Vehicle("Audi", "A3", 2019, 10000L);
        Vehicle vehicle4 = new Vehicle("Ford", "Focus", 2013, 3000L);
        Vehicle vehicle5 = new Vehicle("Toyota", "Corolla", 2012, 1000L);

        List<Vehicle> vehicles = Arrays.asList(vehicle1, vehicle2, vehicle3, vehicle4, vehicle5);
        Collections.sort(vehicles, new VehicleSortByYear());
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

    }

}

class VehicleSortByYear implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}

class VehicleSortByPrice implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return Long.compare(o1.getPrice(), o2.getPrice());
    }
}



/**
 *
 *
 *
 */
