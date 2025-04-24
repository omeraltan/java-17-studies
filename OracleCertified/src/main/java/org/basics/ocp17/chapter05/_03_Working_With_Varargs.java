package org.basics.ocp17.chapter05;

public class _03_Working_With_Varargs {

    public static void main(String[] args) {

        int[] data = new int[]{1,2,3};
        walk1(data);
        walk1(1,2,3);
        walk1();

        run(11,77);

        System.out.println("---------------");

        walkDog(1);                 // soldaki ilk parametreye gider.
        walkDog(1,2);       // ilk parametre 1 ve ikincisi 2
        walkDog(1,2,3);     // ilk parametre 1 ve ikincisi : 2 ve 3
        walkDog(1,new int[]{4,5});  // ilk parametre 1 ve ikincisi : 4 ve 5
        walkDog(1,null);    // Burada ikinci parametre patlar. Eğer ikinci parametreyi vermez isek java bizim için boş bir array gönderecektir.

    }

    public static void walk1(int... steps){}
    public void walk2(int start, int... steps){}
    // public void walk3(int... steps, int start){}             // -> DOES NOT COMPILE
    // public void walk4(int... start, int... steps){}          // -> DOES NOT COMPILE

    public static void run(int... steps){
        System.out.println(steps[1]);
    }

    public static void walkDog(int start, int... steps){
        System.out.println(steps.length);
    }

}

/**
 *
 * 1- Bir method en fazla bir tane var-arg parametresi alabilir.
 * 2- Bir method da bir var-arg parametresi varsa bu parametre en sonda olmak zorundadır.
 * 3- Üç nokta değişken tipinden hemen sonra olmak zorundadır.
 * 4-
 *
 */
