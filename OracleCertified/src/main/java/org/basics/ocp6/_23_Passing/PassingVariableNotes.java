package org.basics.ocp6._23_Passing;

class Person{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}

public class PassingVariableNotes {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        System.out.println(person);
        // person referans değişkeni adres bilgisini tutmakta
        // adres bilgisi -> nesnenin heapteki adresidir.
        // bir referans değişkeni methoda geçtiğimizde (passing variable)
        // ilgili adres bilgisi methoda geçer
        // adres bilgisinin kendisi değil, kopyası alınır ve metoda bu kopya bilgi geçer.
        updatePerson(person);
        System.out.println(person);
    }

    public static void updatePerson(Person person) {
        person.setName("Mike Mizzle");
        person.setAge(50);
        System.out.println(person);
    }
}

/**
 *
 * Pass by value : her zaman değişkenin değerinin kopyası alınıp gönderilir.
 * Pass by value : referans değişkenler için de durum böyledir. Her zaman referans değişkenin kopyası alınıp gönderilir.
 *
 */
