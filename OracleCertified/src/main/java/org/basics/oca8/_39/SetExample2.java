package org.basics.oca8._39;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee {

    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

class Workers{

    private String name;
    private String surname;

    public Workers(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Workers workers = (Workers) o;
        return Objects.equals(name, workers.name) && Objects.equals(surname, workers.surname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(surname);
        return result;
    }
}

public class SetExample2 {

    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        Employee employee1 = new Employee("John", "Smith");
        Employee employee2 = new Employee("John", "Smith");
        Employee employee3 = new Employee("John", "Smith");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println(employees.size());
        // Set duplicate elemana izin vermez.
        // Duplicate kontrolü equals kontrolü anlamına gelir.
        // Equals() methodu override edilmiş durumda değildir.

        System.out.println();

        Set<Workers> workers = new HashSet<>();
        Workers worker1 = new Workers("John", "Smith");
        Workers worker2 = new Workers("John", "Smith");
        Workers worker3 = new Workers("John", "Smith");

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        System.out.println(workers.size());

        // equals() ve hashCode() methodunu override ettiğimizde bu durumda equals true olcağı için duplicate eleman olurlar.
        // Eğer override edilmezse java bunların duplicate olduğunu anlamaz. java açısından duplicate değildir çünkü equals true değildir.

    }

}

