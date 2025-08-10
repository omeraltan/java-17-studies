package org.basics.ocp17.chapter09;

import java.util.*;

public class _04_Using_The_Set_Interface {

    public static void main(String[] args) {

        integerHashSetExample();

        System.out.println("---------------");

        stringHashSetExample();

        System.out.println("---------------");

        stringBuilderSetExample();

        System.out.println("---------------");

        personEqualsAndHashCodeExample();

        System.out.println("---------------");

        employeeEqualsAndHashCodeExample();

        System.out.println("---------------");

        recordEqualsAndHashCodeExample();

        System.out.println("---------------");

        linkedHashSetExample();

        System.out.println("---------------");

        hashSetExample();

        System.out.println("---------------");

        treeSetExample();


    }

    private static void treeSetExample() {
        Set<Integer> set = new TreeSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
        boolean b3 = set.add(66);
        boolean b4 = set.add(8);
        set.forEach(System.out::println);
    }

    private static void hashSetExample() {
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
        boolean b3 = set.add(66);
        boolean b4 = set.add(8);
        set.forEach(System.out::println);
    }

    private static void linkedHashSetExample() {
        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println(numbers);
    }

    private static void recordEqualsAndHashCodeExample() {

        Set<Address> addressSet = new HashSet<>();

        Address address1 = new Address(1,"Istanbul","Istiklal");
        Address address2 = new Address(1,"Istanbul","Istiklal");

        System.out.println("address1 == address2 : " + (address1 == address2));
        System.out.println("address1.equals(address2) : " + address1.equals(address2));

        addressSet.add(address1);
        addressSet.add(address2);

        System.out.println("addressSet.size() : " + addressSet.size());
        System.out.println(addressSet);

    }

    private static void employeeEqualsAndHashCodeExample() {
        Employee employee1 = new Employee(1,"ömer","altan",40);
        Employee employee2 = new Employee(1,"ömer","altan",40);
        Employee employee3 = new Employee(1,"ömer","altan",40);

        System.out.println("Employee1 == Employee1 : " + (employee1 == employee1));
        System.out.println("Employee1 == Employee2 : " + (employee1 == employee2));
        System.out.println("Employee1 == Employee3 : " + (employee1 == employee3));
        System.out.println("Employee1.equals(Employee2) : " + employee1.equals(employee2));

        HashSet<Employee> employeesSet = new HashSet<>();

        System.out.println(employeesSet.add(employee1));
        System.out.println(employeesSet.add(employee2));
        System.out.println(employeesSet.add(employee3));
        System.out.println(employeesSet.add(employee1));
        System.out.println(employeesSet.add(employee1));
        System.out.println(employeesSet.add(new Employee(1,"ömer","altan",40)));

        System.out.println("Employee.size() : " + employeesSet.size());
        System.out.println(employeesSet);
    }

    private static void personEqualsAndHashCodeExample() {
        Person person1 = new Person(1,"ömer","altan",40);
        Person person2 = new Person(1,"ömer","altan",40);
        Person person3 = new Person(1,"ömer","altan",40);

        System.out.println("person1 == person1 : " + (person1 == person1));
        System.out.println("person1 == person2 : " + (person1 == person2));
        System.out.println("person1 == person3 : " + (person1 == person3));
        System.out.println("person1.equals(person2) : " + person1.equals(person2));

        HashSet<Person> personsSet = new HashSet<>();

        System.out.println(personsSet.add(person1));
        System.out.println(personsSet.add(person2));
        System.out.println(personsSet.add(person3));
        System.out.println(personsSet.add(person1));
        System.out.println(personsSet.add(person1));
        System.out.println(personsSet.add(new Person(1,"ömer","altan",25)));

        System.out.println("personsSet.size() : " + personsSet.size());
        System.out.println(personsSet);

        System.out.println(personsSet.remove(new Person(1,"ömer","altan",25)));
        System.out.println(personsSet.remove(person1));
        System.out.println(personsSet.remove(person2));

        System.out.println(personsSet.size());
        System.out.println(personsSet);



    }

    private static void stringBuilderSetExample() {
        Set<StringBuilder> cities = new HashSet<>();
        System.out.println(cities.add(new StringBuilder("Istanbul")));
        System.out.println(cities.add(new StringBuilder("Berlin")));
        System.out.println(cities.add(new StringBuilder("London")));
        System.out.println(cities.add(new StringBuilder("Istanbul")));
        System.out.println(cities.add(new StringBuilder("Istanbul")));

        System.out.println(cities.size());
        System.out.println(cities);

        StringBuilder city1 = new StringBuilder("Istanbul");
        StringBuilder city2 = new StringBuilder("ıstanbul");

        System.out.println("city1.equals(city2) : " + city1.equals(city2));
    }

    private static void stringHashSetExample() {
        Set<String> cities = new HashSet<>();

        System.out.println(cities.add("Istanbul"));
        System.out.println(cities.add("Berlin"));
        System.out.println(cities.add("London"));
        System.out.println(cities.add("Istanbul"));

        System.out.println(cities.size());
        System.out.println(cities);

        String city1 = new String("Istanbul");
        String city2 = new String("Istanbul");

        System.out.println("city1.equals(city2) : " + city1.equals(city2));
    }

    private static void integerHashSetExample() {
        Set<Integer> numbers = new HashSet<>();
        System.out.println(numbers.add(10));
        System.out.println(numbers.add(20));
        System.out.println(numbers.add(30));
        System.out.println(numbers.add(null));
        System.out.println(numbers.add(10));
        System.out.println(numbers.add(20));
        System.out.println(numbers.add(30));
        System.out.println(numbers.add(null));

        System.out.println(numbers.size());
        System.out.println(numbers);

        Integer number1 = Integer.valueOf(10);
        Integer number2 = Integer.valueOf(10);

        System.out.println("number1.equals(number2) : " + number1.equals(number2));
    }

}

class Person{
    private int id;
    private String name;
    private String surname;
    private int age;

    public Person(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            '}';
    }
}

class Employee{
    private int id;
    private String name;
    private String surname;
    private int age;

    public Employee(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            '}';
    }
}

record Address(int id, String city, String road){ }

/**
 *
 * ----- Using The Set Interface -----
 * Set veriyapısında duplicate verilere izin verilmez. Herbir eleman tekil olmak zorundadır.
 * HashSet veya LinkedHashSet gibi sınıfları bulunmaktadır.
 * add methodu ile eleman eklendiğinde true değer döner eğer eleman eklenemezse false değeri döner.
 * StringBuilder sınıfında equals() methodu override edilmemiştir. Bundan dolayı "==" operatörü ile aynı şekilde çalışacaktır.
 * Set için duplicate kavarı equals() methodu ile kontrol edilir.
 * HashSet için elemanlar eklediğimiz sırada tutulmazlar. Index base bir yapısı yoktur (unordered).
 * LinkedHastSet için eğer elemanlar eklediğimiz sırada tutulsun istiyorsak kullanılır.
 * TreeSet için elemanları sıralanmış bir şekilde tutulmaktadır. Bundan dolayı elemanların eklenmesi ve elemanın set li olup olmadığının kontrol edilmesi hashSet e göre daha fazla süre alacaktır.
 *
 * ----- Working With Set Methods -----
 * Set.of()     : Bir set elemanlarını oluşturmak için kullanılır.                          Örneğin: Set<Integer> letters = Set.of('z', 'o', 'o');
 * Set.copyOf() : Bir set elemanlarını bir referanstan alarak oluşturmak için kullanılır.   Örneğin: Set<Character> copy = Set.copyOf(letters);
 *
 *
 */
