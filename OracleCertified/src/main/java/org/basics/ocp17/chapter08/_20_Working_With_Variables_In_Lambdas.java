package org.basics.ocp17.chapter08;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class _20_Working_With_Variables_In_Lambdas {

    public static void main(String[] args) {

        // Listing Parameters
        Predicate<String> p1 = x -> true;
        Predicate<String> p2 = (var x) -> true;
        Predicate<String> p3 = (String x) -> true;

        System.out.println(p1.test("test"));
        System.out.println(p2.test("test"));
        System.out.println(p3.test("test"));

        System.out.println("---------------");

        // BinaryOperator<String> binaryOperator = (var x, y) -> "Hello"; // DOES NOT COMPILE (var belirteci iki parametrede de olmalıdır.)
        BinaryOperator<String> binaryOperator2 = (var x, var y) -> "Hello";

        // BiFunction<Integer, Integer, Boolean> biFunction1 = (var x, Integer y) -> true; // DOES NOT COMPILE (vbir parametrede var diğerinde Integer olamaz.)
        BiFunction<Integer, Integer, Boolean> biFunction2 = (Integer x, Integer y) -> true;
        BiFunction<Integer, Integer, Boolean> biFunction3 = (var x, var y) -> true;
        BiFunction<Integer, Integer, Boolean> biFunction4 = (x, y) -> true;

        // MyInterface1 lambda1 = (String x, var y, Integer z) -> true; // DOES NOT COMPILE
        MyInterface1 lambda2 = (String x, String y, Integer z) -> true;
        MyInterface1 lambda3 = (x, y, z) -> true;
    }

    public void whatAmI(){
        consume((var x) -> System.out.println(x), 123); // x'in değeri integer
    }

    public void consume(Consumer<Integer> c, int num){
        c.accept(num);
    }

    public void counts(List<Integer> list){
        list.sort((var x, var y) -> x.compareTo(y));
        list.sort((Integer x, Integer y) -> x.compareTo(y));
    }

    private static void localVariables(){
        BinaryOperator<Integer> bo = (a,b) -> {
          int c = 0;
          return 5;
        };
        bo.apply(1,2);

        BinaryOperator<Integer> bo2 = (a, b) -> {
          // int a = 0; // DOES NOT COMPILE (We tried to redeclare a, which is not allowed.)
          return 5;
        };
    }

    public void sample() {
        Predicate<Integer> p1 = a -> returnSame(a);
        Predicate<Integer> p2 = this::returnSame;       // -> Keep Your Lambdas Short
        Predicate<Integer> p3 = new _20_Working_With_Variables_In_Lambdas()::returnSame;
    }

    private boolean returnSame(int number){
        return number > 100;
    }


}

interface MyInterface1{
    boolean method(String str1, String str2, Integer num);
}

// Referencing Variables From The Lambda Body
class Crow {

    public static void main(String[] args) {
        Crow crow = new Crow();
        crow.color = "black";
        crow.caw("not-used");
    }

    private String color;
    public void caw(String name){
        String volume = "loudly";
        Consumer<String> consumer = s ->
            System.out.println(name + " says "
                + volume + " that she is " + color);
    }
}

/**
 *
 * ----- Working With Variables In Lambdas -----
 * Local değişkenlerimiz, lambda parametresinde, lambda body içerisinde tanımlanabilir veya body içerisinde diğer local değişkenlere erişilebilir.
 * Listing Parameters: Lambda ifadesinde parametrelerin tiplerini belirtmek opsiyoneldir.
 * Lambda parametreleri nin parametre belirteçleri ya hepsi için var olabilir veya hiçbirinin belirtilmez veya hepsinin belirteçleri belirtilir.
 * ----- Using Local Variables Inside a Lambda Body -----
 * (a, b) -> { int c = 0; return 5; }
 * (a, b) -> { int a = 0; return 5; } // DOES NOT COMPILE
 * Lambda parametrelerinin aynı isimleri ile lambda içerisinde tekrar tanımlama yapılamaz.
 * ----- Keep Your Lambdas Short -----
 * Predicate<Integer> p1 = a -> returnSame(a);
 * Predicate<Integer> p1 = this::returnSame;
 * ----- Referencing Variables From The Lambda Body -----
 * Lambda, instance değişkenlere, method parametrelerine, local değişkenlere erişim sağlayabilir.
 * Anonymous class larda olduğu gibi local variable lara erişebilmesi için bu değişkenlerin final veya effectively final olması gerekmektedir.
 * Lambda body içerisinde static değişkenlere ve instance değişkenlere erişim sağlayabiliriz. Local değişkenlere erişebilmemiz için değişkenleri final veya effectively final olması gerekmektedir.
 * ----- Rules For Accessing A Variable From A Lambda Body Inside A Method -----
 * -----------------------------------------------------------------------------
 * Variable type                    Rule
 * -----------------------------------------------------------------------------
 * Instance variable                Allowed
 * Static variable                  Allowed
 * Local variable                   Allowed if final or effectively final
 * Method parameter                 Allowed if final or effectively final
 * Lambda parameter                 Allowed
 *
 */
