package org.basics.ocp6._16_Constructor;

class ParentEmployees{
    public static void main(String[] args) {
        Employees emp = new Employees();
    }
}

public class Employees {

    private String name;
    private int age;
    private int salary;

    public Employees() {
        this("guest", 20);
        System.out.println("no-arg constructor");
    }

    public Employees(String name, int age) {
        this(name, age, 5000);
        System.out.println("two parameters constructor");
    }

    public Employees(String name, int age, int salary) {
        super();
        //this(); // compile error, recursive olarak çağırmak istersek derleme hatası alırız. Java buna izin vermez.
        this.name = name;
        this.age = age;
        this.salary = salary;
        System.out.println("three parameters constructor");
    }
}
