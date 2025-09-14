package org.basics.ocp17.chapter09.examples;

import java.util.Objects;

class UserTest{

    public static void main(String[] args) {

        User user1 = new User("Ali", "ali@email.com", 25, "IT");
        User user2 = new User("Ali", "ali@email.com", 25, "IT");
        User user3 = new User("Veli", "veli@email.com", 30, "HR");

        System.out.println("user1 hash: " + user1.hashCode());
        System.out.println("user2 hash: " + user2.hashCode());
        System.out.println("user3 hash: " + user3.hashCode());

        System.out.println("user1.equals(user2): " + user1.equals(user2));
        System.out.println("user1.equals(user3): " + user1.equals(user3));

    }

}

public class User {
    private String name;
    private String email;
    private int age;
    private String department;

    public User(String name, String email, int age, String department) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.department = department;
    }

    // Getter metodları
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        User user = (User) obj;
        return age == user.age &&
            Objects.equals(name, user.name) &&
            Objects.equals(email, user.email) &&
            Objects.equals(department, user.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age, department);
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", age=" + age +
            ", department='" + department + '\'' +
            '}';
    }
}
