package org.basics.ocp17.chapter06;

public class _03_Declaring_Constructors {

    public static void main(String[] args) {



    }

}

class Bunny {
    public Bunny(){
        System.out.println("hop");
    }

    public static void main(String[] args) {
        new Bunny();
    }

    // public bunny(){} // -> DOES NOT COMPILE
    public void Bunny(){} // -> This is a method not constructor
}

class Bonobo{
    // public Bonobo(var food){} // -> DOES NOT COMPILE
}

class Turtle{
    private String name;

    public Turtle(){
        name = "John Doe";
    }

    public Turtle(int age){

    }

    public Turtle(long age){

    }

    public Turtle(String newName, String... favoriteFoods){
        name = newName;
    }

}

class Hamster{
    private String color;
    private int weight;

    public Hamster(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public Hamster(int weight){
        this(weight, "brown");
    }
}

class Gopher{
    public Gopher(int dugHoles){
        // this(5);    // -> DOES NOT COMPILE (This constructor is calling itself infinitely.)
    }
}

/**
 *
 * Bir "constructor" class ismi ile aynı isme sahip olması gerekiyor ve dönüş tipi yoktur.
 * "var" keyword'ünü local variable'larda kullanabiliyorduk ancak "constructor" 'larda kullanamayız.
 * Constructor Overloading: Bir class'ta birden fazla constructor tanımlayabiliriz ancak constructor'un parametreleri birbirinden farklı olmak zorundadır.
 * Java'da bütün sınıflar en az bir constructor'a sahiptir. Tanımlasanızda tanımlamasanızda
 * Tanımlamazsanız eğer Java sizin yerinize bir tane tanımlayacaktır (default parametresiz constructor).
 * Constructor'lar için "access member" tanımlayabiliriz.
 * Constructor'lar bir biri içinden çağırılabilir. Bunun için "this()" anahtar kelimesi kullanılır.
 * this and this() arasındaki fark, "this" keyword ilgili nesneyi(current), instance'ı refere eder. this() ise constructor'ı refere eder.
 * this() ifadesi kodumuzda (constructor'da) yeralıyorsa ilk ifade olmalıdır. Arka arkaya iki kez kullanılamaz.
 *
 */
