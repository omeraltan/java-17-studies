package org.basics.ocp6._37_Equals_ToString;

class Student{
    private String name;
    private String surname;
    private int number;

    public Student(String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", number=" + number +
            '}';
    }
}

public class ToStringNotes {

    public static void main(String[] args) {
        Student s1 = new Student("John", "Smith", 1);
        System.out.println(s1);

        Student s2 = new Student("John", "Depth", 2);
        System.out.println(s2);


    }

}

/**
 *
 *
 *
 */
