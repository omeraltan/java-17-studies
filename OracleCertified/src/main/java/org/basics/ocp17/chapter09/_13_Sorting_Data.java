package org.basics.ocp17.chapter09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _13_Sorting_Data {

    public static void main(String[] args) {

        PEmployee employee1 = new PEmployee(10, "Thomas", "Smith");
        PEmployee employee2 = new PEmployee(18, "Thomas", "Oliver");
        PEmployee employee3 = new PEmployee(7, "Johnson", "Williams");
        PEmployee employee4 = new PEmployee(27, "Johnson", "Duke");
        PEmployee employee5 = new PEmployee(37, "Johnson", "Mill");
        PEmployee employee6 = new PEmployee(6, "Jones", "Brown");
        PEmployee employee7 = new PEmployee(8, "Lopez", "Hernandez");
        PEmployee employee8 = new PEmployee(15, "Anderson", "Wilson");

        List<PEmployee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);

        employees.forEach(System.out::println);

        System.out.println("--------------------");

        Collections.sort(employees);
        employees.forEach(System.out::println);

        System.out.println("--------------------");

        ZEmployee zemployee1 = new ZEmployee(10, "Thomas", "Smith", 1000.0);
        ZEmployee zemployee2 = new ZEmployee(25, "Thomas", "Jane", 780.0);
        ZEmployee zemployee3 = new ZEmployee(7, "Johnson", "Williams", 1400.25);
        ZEmployee zemployee4 = new ZEmployee(5, "Jones", "Brown", 950.78);
        ZEmployee zemployee5 = new ZEmployee(6, "Jones", "Black", 1950.0);
        ZEmployee zemployee6 = new ZEmployee(8, "Lopez", "Hernandez", 1200.0);
        ZEmployee zemployee7 = new ZEmployee(15, "Anderson", "Wilson", 1300.0);
        ZEmployee zemployee8 = new ZEmployee(15, "Anderson", "Wilson", 1200.0);

        List<ZEmployee> zEmployees = new ArrayList<>();
        zEmployees.add(zemployee1);
        zEmployees.add(zemployee2);
        zEmployees.add(zemployee3);
        zEmployees.add(zemployee4);
        zEmployees.add(zemployee5);
        zEmployees.add(zemployee6);
        zEmployees.add(zemployee7);
        zEmployees.add(zemployee8);

        Comparator<ZEmployee> c = Comparator.comparing(ZEmployee::getFirstName)
            .thenComparingDouble(ZEmployee::getSalary);

        Comparator<ZEmployee> d = Comparator.comparing(ZEmployee::getLastName)
                .thenComparingDouble(ZEmployee::getSalary);

        Collections.sort(zEmployees, c);
        zEmployees.forEach(System.out::println);

        System.out.println("--------------------");

        Collections.sort(zEmployees, d);
        zEmployees.forEach(System.out::println);

        System.out.println("--------------------");

        Squirrel squirrel1 = new Squirrel(10,"trapezoid");
        Squirrel squirrel2 = new Squirrel(20,"square");
        Squirrel squirrel3 = new Squirrel(12,"triangle");
        Squirrel squirrel4 = new Squirrel(21,"square");
        Squirrel squirrel5 = new Squirrel(10,"triangle");
        Squirrel squirrel6 = new Squirrel(20,"rectangle");
        Squirrel squirrel7 = new Squirrel(30,"trapezoid");
        Squirrel squirrel8 = new Squirrel(5,"rectangle");

        List<Squirrel> squirrels = new ArrayList<>();
        squirrels.add(squirrel1);
        squirrels.add(squirrel2);
        squirrels.add(squirrel3);
        squirrels.add(squirrel4);
        squirrels.add(squirrel5);
        squirrels.add(squirrel6);
        squirrels.add(squirrel7);
        squirrels.add(squirrel8);

        Comparator<Squirrel> s = Comparator.comparing(Squirrel::getSpecies)
            .thenComparingInt(Squirrel::getWeight);

        Collections.sort(squirrels, s);
        squirrels.forEach(System.out::println);

        System.out.println("--------------------");

        var r = Comparator.comparing(Squirrel::getSpecies).reversed();
        Collections.sort(squirrels, r);
        squirrels.forEach(System.out::println);

        System.out.println("--------------------");

        Collections.sort(squirrels, new MultiFieldComparator());
        squirrels.forEach(System.out::println);

    }

}

class PEmployee implements Comparable<PEmployee> {

    private Integer id;

    private String firstName;

    private String lastName;

    @Override
    public int compareTo(PEmployee employee) {
        int result = firstName.compareTo(employee.firstName);
        if (result == 0){
            return lastName.compareTo(employee.lastName);
        }
        return result;
    }

    public PEmployee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "PEmployee{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
    }
}

class ZEmployee {

    private Integer id;

    private String firstName;

    private String lastName;

    private Double salary;

    public ZEmployee(Integer id, String firstName, String lastName, Double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ZEmployee{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", salary=" + salary +
            '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}

class Squirrel {

    private int weight;

    private String species;

    public Squirrel(int weight, String species) {
        this.weight = weight;
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Squirrel{" +
            "weight=" + weight +
            ", species='" + species + '\'' +
            '}';
    }
}

class MultiFieldComparator implements Comparator<Squirrel>{

    @Override
    public int compare(Squirrel s1, Squirrel s2) {

        int result = s1.getSpecies().compareTo(s2.getSpecies());
        if (result != 0){
            return result;
        }
        return s1.getWeight()-s2.getWeight();
    }
}

/**
 *
 * --------------- Comparing Multiple Fields ---------------
 * Birden fazla field üzerinde sıralama yapılabilir.
 * Bir liste üzerinde Collections.sort() methodunu direkt olarak kullanamazsınız.
 * Collections.sort() methodunu kullanabilmek için listenin kullandığı sınıfın Comparable interface'ini implements etmesi gerekmektedir.
 *
 */
