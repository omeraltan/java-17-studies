package org.basics.ocp17.chapter05;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class _09_Overloading_Methods {

    public static void main(String[] args) {

    }

    public void fly(int numMiles){}
    public void fly(short numFeet){}
    public boolean fly(){return false;}
    void fly(int numMiles, short numFeet){}
    public void fly(short numFeet, int numMiles) throws Exception{}

}

class Eagle{

    public void fly(int numMiles){}
    // public int fly(int numMiles){return 1;} // -> DOES NOT COMPILE

}

class Hawk{
    public void fly(int numMiles){}
    // public static void fly(int numMiles){}   // -> DOES NOT COMPILE
    // public void fly(int numKilometers){}     // -> DOES NOT COMPILE
}

class Dove{
    public void fly(int numMiles){
        System.out.println("int");
    }
    public void fly(short numFeet){
        System.out.println("short");
    }
}

class Pelican{
    public void fly(String s){
        System.out.println("string");
    }
    public void fly(Object o){
        System.out.println("object");
    }

    public static void main(String[] args) {
        var p = new Pelican();
        p.fly("test");
        System.out.println("-");
        p.fly(56);
    }
}

class Parrot{

    public static void print(List<Integer> i){
        System.out.println("I");
    }
    public static void print(CharSequence c){
        System.out.println("C");
    }
    public static void print(Object o){
        System.out.println("O");
    }

    public static void main(String[] args) {
        print("abc");
        print(Arrays.asList(3));
        print(LocalDate.of(2019, Month.JULY,4));
    }
}

class Ostrich{
    public void fly(int i){
        System.out.println("int");
    }
    public void fly(long l){
        System.out.println("long");
    }

    public static void main(String[] args) {
        var p = new Ostrich();
        p.fly(123);
        System.out.println("-");
        p.fly(123L);
    }
}

class Horse{
    public static void walk(int[] ints){
        System.out.println("int[]");
    }
    public static void walk(Integer[] integers){
        System.out.println("Integer[]");
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1,5,4};
        Horse.walk(numbers);

        Integer[] sizes = {10,20,30};
        Horse.walk(sizes);
    }
}

class Glider{
    public static String glide(int i, int j){
        return "1";
    }
    public static String glide(long i, long j){
        return "2";
    }
    public static String glide(Integer i, Integer j){
        return "3";
    }
    public static String glide(int... nuns){
        return "4";
    }

    public static void main(String[] args) {
        System.out.println(glide(1,2));
    }
}

/**
 *
 * Overloaded methodlar için ismi dışında herşey farklı olabilir.
 * Dönüş tipinin sadece farklı olması overloaded method olduğu anlamına gelmez.
 * Methodun static yapılması overloaded olduğu manasına gelmez.
 * Java eşleşen en spesifik overloaded methodu kullanır.
 * "The order that Java uses to choose the right overloaded method."
 *
 *      Rule                    Example of what will be chosen for glide(1,2)
 *      ----                    ---------------------------------------------
 *      Exact match by type     String glide(int i, int j)
 *      Larger primitive type   String glide(long i, long j)
 *      Autoboxed type          String glide(Integer i, Integer j)
 *      Varargs                 String glide(int... nums)
 *
 */
