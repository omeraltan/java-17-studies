package org.basics.oca8._37;

import java.util.Objects;

class Person{

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        return result;
    }
}

public class EqualsExample {

    public static void main(String[] args) {

        Person person1 = new Person("John", "Smith", 25);
        Person person2 = new Person("John", "Smith", 25);

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        // equals methodu override edilmediği durumda, == ile aynı şekilde çalışır.

    }

}

