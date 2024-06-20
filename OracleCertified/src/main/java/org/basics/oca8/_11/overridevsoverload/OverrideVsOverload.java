package org.basics.oca8._11.overridevsoverload;

class SuperClass{
    protected static void staticMethodCantBeOverridden(){
        System.out.println("Static method cant be overridden");
    }
}

class SubClass extends SuperClass{
    protected static void staticMethodCantBeOverridden(){
        System.out.println("Static method cant be overridden");
    }
}


public class OverrideVsOverload {

}

/**
 *
 * overload methodlar için parametreleri değişmelidir (sayi, tip olabilir).
 * override methodlar için ise parametre aynı olmalıdır.
 * overload metodlar için dönüş tipi değişebilir.
 * override metodlar için dönüş tipi değişmez.
 * overload metodlar için access level değişebilir.
 * override metodlar için access level artabilir ama azalamaz.
 * overload metodlar için değişkenin tipi önemlidir. Compile time da belli olur.
 * override metodlar için objenin tipi önemlidir. Run time da objenin tipine göre karar verilir.
 * static metodlar override edilemese de tekrar alt sınıflarda tanımlandığında access level i azalamaz ama genişleyebilir.
 */
