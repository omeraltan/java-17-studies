package org.basics.ocp6._12_Polymorphism;


class Overloaded{

    void method(){
        System.out.println("Overloaded method");
    }
    void method(int number){
        System.out.println("int");
    }
    void method(long number){
        System.out.println("long");
    }
    void method(float number){
        System.out.println("float");
    }
    void method(double number){
        System.out.println("double");
    }
    void method(String string){
        System.out.println("String");
    }
}

public class PolymorphismNotes {
    public static void main(String[] args) {
        new Overloaded().method();
        new Overloaded().method(10);
        new Overloaded().method(10.1f);
        new Overloaded().method(10.2);
        new Overloaded().method(10L);
        new Overloaded().method("String");
    }
}

/**
 *
 * polymorphism -> çok biçimlilik
 * static  -> overload : early binding
 * dynamic -> override : late binding
 * override kavramı extends / implements durumlarında geçerlidir.
 * overload -> aşırı yüklenmiş method demektir.
 * method isimleri aynı
 * parametre listesi değişmeli, sayı yada tip
 * overload ile reusable methodlar yazabiliriz.
 * overload methodlarda ismi aynı ise, parametre listesi farklı olmalıdır.
 * parametre listesi farklı olmaz ise compile time hatası verir.
 * dönüş tipi farklı olsada fark etmez. Mutlaka parametreler farklı olmalıdır.
 *
 */
