package org.basics.ocp17.chapter07;

public class _17_Understanding_Polymorphism {

    public static void main(String[] args) {



    }

}

class Penguin{
    public int getHeight(){
        return 3;
    }

    public void printInfo(){
        System.out.print(this.getHeight());
    }
}

class EmperorPenguin extends Penguin {
    public int getHeight(){
        return 8;
    }

    public static void main(String[] args) {
        new EmperorPenguin().printInfo();       // Dynamic Dispatch
    }
}



/**
 *
 *      ---Polymorphism and method Overriding---
 * Bir methodu Override ettiğimizde bu methoda yapılan çağrıları değiştirebilmemizi sağlar.
 * Çağırılan methoda çalışma zamanında (run time) objenin tipine göre karar verir. Javada buna "dynamic dispatch" adı verilir.
 * Polymorphism, kendine özel overriden methodlara sahip sub classların daha karmaşık kalıtım modelleri oluşturabilmesine imkan sağlar.
 * Bir methodu eğer final olarak tanımlarsak override edemeyiz.
 *
 *
 */
