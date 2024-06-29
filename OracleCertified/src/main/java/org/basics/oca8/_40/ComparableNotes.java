package org.basics.oca8._40;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car> {
    private String brand;
    private String model;
    private Integer year;
    private Long price;

    public Car(String brand, String model, Integer year, Long price) {
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
    public int compareTo(Car o) {
        // wrapper sınıflarda compareTo methodu yer alır. Bu şekilde  sıralama yapılabilir.
        // return year.compareTo(o.year); -> Küçükten büyüğe göre sıralama yapar.
        return o.getYear().compareTo(this.getYear()); // -> Büyükten küçüğe göre sıralama yapar.
        // primitive bir tip için de compare() methodu kullanılabilir.
        // return Integer.compare(year, car.getYear()); -> Küçükten büyüğe doğru sıralama yapar.
        // return Integer.compare(car.getYear(), year); -> Büyükten küçüğe doğru sıralama yapar.
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

public class ComparableNotes {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(10,5,2,100,-10,-20);
        Collections.sort(numbers);
        System.out.println(numbers);

        Car car1 = new Car("BMW", "3Series", 2018, 5000L);
        Car car2 = new Car("Mercedes", "CSeries", 2015, 15000L);
        Car car3 = new Car("Audi", "A3", 2019, 10000L);
        Car car4 = new Car("Ford", "Focus", 2013, 3000L);
        Car car5 = new Car("Toyota", "Corolla", 2012, 1000L);

        List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5);
        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }



    }

}

/**
 *
 * java.lang.Comparable
 * java.lang.Comparator
 *
 * String ve Wrapper sınıflar Comparable interface ini implement etmişlerdir.
 *
 *
 */
