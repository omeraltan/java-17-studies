package org.basics.ocp6._16_Constructor;

class Person{

    // default constructor
    Person(){

    }
}

class Employee{
    private String firstName;

    // Bu constructor tanımlandığı için java tarafından default constructor tanımlanmamıştır
    public Employee(String firstName) {
        this.firstName = firstName;
    }
}

class Car{

}

class Computer{
    String brand;
    String model;

    public Computer() {
    }

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}

public class ConstructorNotes {
    public static void main(String[] args) {
        Car car = new Car();

        Computer computer = new Computer("Apple", "Macbook Pro");
        Computer computer2 = new Computer(); // Don't compile
    }
}

/**
 *
 * Java da bütün sınıflarda constructor olmak zorundadır
 * Bu kurala abstraact sınıflar da dahildir. Yani abstract sınıflar için de constructor olmak zorundadır.
 * Ancak abstract sınıflar için nesne oluşturamazsınız. Bu yüzden constructorlar abstract sınıflar için kısıtlanmıştır. Özel bir yapı kurulmuştur.
 * Interfacelerin constructorları yoktur. Çünkü özel bir yapıdır ve sınıf hiyerarşisinde bulunmaz.
 * Her sınıfın oluşturulmaz ise eğer java bizim için default constructor tanımlar. Parametre almayan ve gizli constructor dır.
 * Eğer bir constructor tanımlarsak default constructor java tarafından tanımlanmaz.
 * Javada yeni bir obje oluşturmak istediğimizde constructor ı çağırırız.
 * Bir constructor tannımladığımızda java bizim için bir no-arg constructor tanımlamaz Bizim bu constructor'ı tanımlamamız gerekir.
 * Constructor ismi sınıf ismi ile aynı olmak zorundadır.
 * Constructor lar objeyi initialize etmek amaçlı kullanılırlar.
 * Constructor ların ilk ifadesi super(); yada this(); olabilir. Bu iki ifade beraber kullanılamaz.
 * this(...); ifadesi ilgili sınıftaki constructor'ı çağırmak için kullanılır.
 * super(...); ifadesi üst sınıftaki constructor'ı çağırmak için kullanılır.
 * super(); ifadesinde olduğu gibi this(); ifadesi de ilk çalışan ifade/statement olmalıdır.
 */
