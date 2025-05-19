package org.basics.ocp17.chapter07;

public class _12_Creating_Nested_Classes {

    public static void main(String[] args) {



    }

}

class Park{

    private static class Ride{
        // instance değişken ekleyebiliriz.
        private int price = 6;

        // static değişken ekleyebiliriz (constant).
        private static final int MAX_SPEED = 100;

        // instance method ekleyebiliriz.
        private void innerMethod(){
            System.out.println("innerMethod");
        }

        // static method ekleyebiliriz.
        private static void innerStaticMethod(){
            System.out.println("innerStaticMethod!");
        }
    }

    private void outerMethod(){
        var ride = new Ride();
        ride.innerMethod();

        Ride.innerStaticMethod();
        ride.innerStaticMethod();
        Park.Ride.innerStaticMethod();
    }

    public static void main(String[] args) {
        var ride = new Ride();
        System.out.println(ride.price);
        System.out.println(Ride.MAX_SPEED);
        ride.innerMethod();
        Ride.innerStaticMethod();
        System.out.println("----------");
        var park = new Park();
        park.outerMethod();
    }
}



/**
 *
 * Creating a "static" Nested Class:
 * "static" tipte ve class'ın üyesi seviyesinde tanımladığımız class'lardır.
 * inner class'ların aksine, çevreleyen outher class objesi olmadan bu class  tipinde bir nesne oluşturulabilir.
 * "static" nested class'lar outher class'ların instance değişkenlerine ve methodlarına direkt erişim sağlayamaz.
 * "static" nested class'lar private, protected veya public olarak tanımlanabilir.
 * Outher class, static nested class'ların değişken ve methodlarına erişim sağlayabilir.
 * "static" nested class, outher class'ın static method ve değişkenlerine erişim sağlayabilir.
 * "static" class'larda instance method ve instance değişken tanımlayabiliriz.
 * Outher class, static class'ın private üyelerine erişim sağlayabilir.
 * Nested olarak tanımlanmış "enum" ve "record" 'lar aslında implictly olarak static'tir.
 *
 *
 */
