package org.basics.ocp17.chapter02;

class Duck{
    private int age;

    public int getAge() {
        return age;
    }
}

public class _10_Conditional_Operators {

    public static void main(String[] args) {

        int hour = 10;
        boolean zooOpen = true || (hour < 4);   // sol tarafta true olduğu için sağ taraf değerlendirilmez.
        System.out.println(zooOpen);

        System.out.println("----------");

        Duck duck = null;
        methodNoException(duck);
        methodNullPointerException(duck);

        System.out.println("----------");

        int rabbit = 6;
        boolean bunny = (rabbit >= 6) || (++rabbit <=7);
        System.out.println(rabbit);



    }

    static void methodNoException(Duck duck){
        if (duck != null && duck.getAge() < 5){

        }
    }

    static void methodNullPointerException(Duck duck){
        if (duck != null & duck.getAge() < 5){     // -> Could throw NullPointerException

        }
    }

}

/**
 *
 * 1. Conditional AND (&&) (a && b) : İki değerinde true olması gerekmektedir.
 * 2. Conditional OR  (||) (a || b) : Bir değerin true olması yeterlidir.
 * 3. Conditional AND operatörü için eğer "a" false ise sağdaki "b" değerlendirmez, bakılmaz.
 * 4. Conditional OR operatörü için "a" veya "b" nin true olması durumunda sonuç true olacaktır.
 * 5. Conditional OR operatörü için "a" değeri true ise sağdaki "b" değerine bakılmaz.
 *
 *
 */
