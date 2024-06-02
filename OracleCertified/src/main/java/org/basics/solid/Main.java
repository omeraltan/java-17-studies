package org.basics.solid;

/**
 *  (Liskov Substitution Principle) - Liskov Yerine Geçme Prensibi
 *  Bir nesne, temel sınıfın nesnesiyle yer değiştirdiğinde, programın davranışında bir değişiklik olmamalıdır.
 *  Bu prensip, türetilmiş sınıfların, temel sınıflarının yerine kullanılabilmesi gerektiğini ifade eder.
 *  Bu örnekte, Ostrich sınıfı Bird sınıfının yerine kullanıldığında fly metodunun çalışmaması LSP'yi ihlal eder.
 *  LSP'yi sağlamak için Bird sınıfının fly metodunu içermemesi veya Ostrich sınıfının Bird sınıfından türetilmemesi gerekir.
 */
class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    // Inherits fly method
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        bird.fly(); // Works fine

        Bird ostrich = new Ostrich();
        ostrich.fly(); // Throws exception, violating LSP
    }
}

