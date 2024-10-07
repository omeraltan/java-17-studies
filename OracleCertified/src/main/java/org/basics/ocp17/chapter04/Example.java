package org.basics.ocp17.chapter04;

class Person{
    String firstName;
    String lastName;
    int age;
    Character gender;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, Character gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            ", gender=" + gender +
            '}';
    }
}

class Department{
    int id;
    String name;
    public Department() {

    }
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



public class Example {

    public static void main(String[] args) {

        Person person1 = new Person("john", "doe", 20, 'M');
        Person person2 = new Person("jane", "doe", 25, 'F');

        System.out.println(person1);
        System.out.println(person2);

        Department department1 = new Department(100, "IT");
        Department department2 = new Department(200, "HR");

        System.out.println(department1);
        System.out.println(department2);

    }

}

