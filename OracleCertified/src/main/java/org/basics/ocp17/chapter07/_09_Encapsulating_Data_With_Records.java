package org.basics.ocp17.chapter07;

public class _09_Encapsulating_Data_With_Records {

    public static void main(String[] args) {

        Chicken chick = new Chicken(10, "good-crane");
        System.out.println(chick);

        // Chicken invalidChick = new Chicken(-1,"bad-crane");

        Person person = new Person("Philip", 12);
        System.out.println(person);
    }

}

// Compact constructor
record Chicken(int numberEggs, String name){

    public Chicken{
        if (numberEggs < 0)throw new IllegalArgumentException();
        name = name.toLowerCase();
    }

}

record Person(String name, int age) {

    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }else {
            age = 42;
        }
        // this.age = age;      -> DOES NOT COMPILE (Bu atamayı yapmaya gerek kalmıyor.)
        // this.name = name;    -> DOES NOT COMPILE (Bu atamayı yapmaya gerek kalmıyor.)
    }
}

record Building(int age, String name){
    public Building(String firstName, String lastName){
        this(0,firstName + " " + lastName);
    }

    public Building(String firstname){
        this(0,firstname);
    }
}

record Fever(int number, String value){

    public Fever(int number){
        this(number, "dummy");
    }

}

record Crane4(int numberEggs, String name){

    public Crane4(int numberEggs, String firstName, String lastName){
        this(numberEggs + 1, firstName + " " + lastName);
        numberEggs = 10; // NO EFFECT (applies to parameter, not instance field)
        // this.numberEggs = 20; // DOES NOT COMPILE
    }

}

record Crane5(int numberEggs, String name){

    // public Crane5(String name){
        // this(1);    -> DOES NOT COMPILE
    // }

    // public Crane5(int numberEggs){
        // this("");   -> DOES NOT COMPILE
    // }
}

record Crane6(int numberEggs, String name){
    @Override
    public int numberEggs(){
        return 10;
    }

    @Override
    public String toString() {
        return name;
    }
}

record Crane7(int numberEggs, String name){
    private static int type = 10;
    // public int size;                         // DOES NOT COMPILE
    // private boolean friendly;                // DOES NOT COMPILE

    // private final boolean friendly = true;   // DOES NOT COMPILE

    public void sampleMethod(){
        System.out.println("instance method...");
    }

    public static void sampleStaticMethod(){
        System.out.println("static method...");
    }

    class Nested {

    }

    enum NestedEnum{
        ON, OFF
    }

    private sealed class SuperClass{

    }

    private final class SubClass extends SuperClass{

    }

    static{
        System.out.println("This is a static initializer...");
    }


}



/**
 *
 * Record'larda kullanılan bir başka constructor'da "compact constructor" 'dır.
 * Bu constructro özel bir constructor'dır ve dönüşüm için kullanılacak bir yapıdır, herhangi bir parametre almaz.
 * "compact constructor" 'lar parantez olmadan tanımlanmaktadır.
 * compact constructor'lar bize parametreleri dönüştürmek için fırsat sağlamaktadır.
 * Record'larda kullanılan compact constructor, tüm alanları parametre olarak alan ve bu alanlara atama yapan bir canonical constructor'ın daha kısa (compact) bir yazımıdır.
 * compact constructor, parametreleri değiştirebilir ancak field'ları değiştiremez (instance variable).
 * record'larda overloaded constructor tanımlanabilir.
 * canonical constructor: bir record sınıfının tüm bileşenlerini (fields) parametre olarak alan ve bu alanlara ilk değer atamasını yapan özel bir yapıcı (constructor) türüdür.
 * record'lardaki constructorlar içinde canonical constructor kullanılır.
 * Normal constructor'larda compact constructor'un aksine canonical constructor ilk satırda kullanılmalıdır.
 * Bir constructor tanımlandığında canonical constructor çağırılmak zorundadır.
 * Record'lr data oriented bir özellik gösterirler. Bununla birlikte class'ların sahip olduğu özelliklerede sahiptirler.
 * record parametreleri dışında yeni bir instance variable tanımlamanıza izin verilmez.
 * record larda static değişken tanımlanmasına izin verilir.
 * record'larda instance initializer tanımlamanıza izin verilmez. Record'un instance variable'ları constructor içinde initializ edilmesi gerekmektedir.
 * static initializer tanımlamanıza izin verilir.
 *
 *
 */
