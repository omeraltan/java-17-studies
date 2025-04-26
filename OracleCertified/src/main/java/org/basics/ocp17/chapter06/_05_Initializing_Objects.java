package org.basics.ocp17.chapter06;

public class _05_Initializing_Objects {

    public static void main(String[] args) {



    }

}

class Animal3{
    static {
        System.out.println("A");
    }
}

class Hippo3 extends Animal3{
    public static void main(String[] args) {
        System.out.println("C");
        new Hippo3();
        new Hippo3();
        new Hippo3();
    }
    static {
        System.out.println("B");
    }
}

class MouseHouse{
    private final int volume;
    private final String name = "Teh Mouse House";
    {
        volume = 10;
    }
}

class MouseHouse2{
    private final int volume;
    private final String type;

    {
        this.volume = 10;
    }

    public MouseHouse2(String type){
        this.type = type;
    }

    public MouseHouse2(){
        type = "default";
        // this.volume = 2;     // -> DOES NOT COMPILE
    }
}

class MouseHouse4{
    private final int volume;
    private final String type;

    {
        this.volume = 10;
    }

    public MouseHouse4(String type){
        this.type = type;
    }

    public MouseHouse4(){
        this(null);
    }

}

/**
 *
 * "final" tanımlanmış instance variable'lara ilk değer ataması üç şekilde yapılabilir. Bunlar:
 * 1- Tanımlandığı an yapılabilir.
 * 2- Constructor içinde yapılabilir.
 * 3- initializer block içinde ataması yapılabilir.
 * Her bir constructor tek başına (individual) değerlendirilir. Yani her bir constructor içinde yapılan işlem kendi içinde değerlendirilir.
 * Burada this anahtar kelimesini kullanmak önemlidir ve sorunları çözecektir (MouseHouse4).
 *
 */
