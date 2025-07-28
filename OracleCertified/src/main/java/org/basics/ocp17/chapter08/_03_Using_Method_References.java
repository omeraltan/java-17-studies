package org.basics.ocp17.chapter08;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class _03_Using_Method_References {

}

interface LearnToSpeak{
    void speak(String sound);
}

class DuckHelper{
    public static void teacher(String name, LearnToSpeak trainer){
        trainer.speak(name);
    }
}

class Duckling{
    static void makeSound(String sound){
        //LearnToSpeak learner = s -> System.out.println(s);
        LearnToSpeak learner = System.out::println;
        DuckHelper.teacher(sound, learner);
    }
}

// 1-Method Reference (static methods)
class Demo {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Consumer<String> printer = Demo::printMessage;
        printer.accept("Merhaba dünya!");
    }
}

// 2-Method Reference (Instance Methods on a Particular Object (Belirli bir nesneye ait method))
class Demo2 {
    public String getGreeting() {
        return "Merhaba!";
    }

    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        Supplier<String> greeter = demo::getGreeting;
        System.out.println(greeter.get());
    }
}

// 3-Instance Methods on a Parameter to Be Determined at Runtime (Parametre olarak gelen nesneye ait method)
class Demo3 {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = String::length;
        System.out.println(stringLength.apply("Java"));
    }
}

// 4-Constructors (Constructor referansı)
class Person {
    public Person() {
        System.out.println("Yeni bir kişi oluşturuldu.");
    }
}

class Demo4 {
    public static void main(String[] args) {
        Supplier<Person> personCreator = Person::new;
        Person p = personCreator.get();
    }
}

interface GreetingInterface{
    void message();
}

class StaticMethodRef{
    public static void main(String[] args) {
        GreetingInterface greetingInterfaceMethodRef = StaticMethodRef::printMessage;
        greetingInterfaceMethodRef.message();
    }

    public static void printMessage(){
        System.out.println("Print Message");
    }
}



/**
 *
 * Method Reference : Lambda ifadelerinin bir alternatifi olarak basitçe methodun ismi ile kullandığımız ifadelerdir.
 * Method Reference, kodun okunmasını kolaylaştırır. Lambda ifadeleri gibi farklı bir syntax'a sahiptir.
 * Method Reference, functional interfaceler ile birlikte kullanılabilir.
 * Method Reference'ın 4 farklı şekilde tanımı yapılabilir.
 * 1- static methods (Sınıf a ait static bir method referans alınır. Örnek: ClassName::staticMethod)
 * 2- instance methods on a particular object (Belirli bir nesneye ait instance metodu referans alınır. Örnek: object::instanceMethod)
 * 3- instance methods on a parameter to be determined at runtime (Çalışma zamanında belirlenen bir nesneye ait instance methodu referans alınır. Örnek: variable::instanceMethod) (Burada method, parametre olarak gelen nesne üzerinden çağrılır)
 * 4- constructors (Yeni bir nesne oluşturmak için constructor referans alınır. Örnek: String::new)
 *
 */
