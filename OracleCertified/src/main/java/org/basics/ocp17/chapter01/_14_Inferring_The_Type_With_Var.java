package org.basics.ocp17.chapter01;

import java.sql.Struct;

public class _14_Inferring_The_Type_With_Var {

    public static void main(String[] args) {
        var name = "Hello";
        var size = 7;
        // size = "MEDIUM"; -> DOES NOT COMPILE
    }

    public void breakingDeclaration(){
        var silly
            = 1;
    }

    public void doesThisCompile(boolean check){
//        var question;         -> DOES NOT COMPILE
//        question = 1;
//        var answer;           -> DOES NOT COMPILE
//        if (check){
//            answer = 1;
//        }else {
//            answer = 3;
//        }
//        System.out.println(answer);   -> DOES NOT COMPILE

        // question local variable için ilk değer ataması tanımlandığı sayfada yapılmadığı için compile time hatası alır.
    }

    public void twoTypes(){
        // int a, var b = 3;        -> DOES NOT COMPILE
        // var n = null;            -> DOES NOT COMPILE
    }

//    public int addition(var a, var b){      -> DOES NOT COMPILE
//        return a + b;
//    }

}

class Var{
    public void var(){
        var var = "var";
    }
    public void Var(){
        Var var = new Var();
    }
}

class Example{
    public Example(){
        var number = 10;
    }
    private void method(){
        var name = "username";
    }
    {
        var initialized = true;
    }

    void method2(){
        // var object = null;           -> DOES NOT COMPILE
        // var invalid= (null)String;   -> DOES NOT COMPILE
        var content = (String) null;
        var size = 10;
        // size = null;                 -> DOES NOT COMPILE
        var age = (Integer) null;

        // var number = 10, number2 = 200; -> DOES NOT COMPILE

    }
}

/**
 *
 * "var" anahtar kelimesi
 * 1. Local variable için "var" anahtar kelimesini kullandığımızda bizim için değişkenin tipini bulmasını kararlaştırmasını istiyoruz.
 * 2. "var" anahtar kelimesini sadece local variable lar için kullanabiliriz.
 * 3. "var" anahtar kelimesi ile ilk defa değeri atanan değişkenin tipi yeni atama ile değiştirilemez.
 * 4. "var" anahtar kelimesi ile tanımlanmış bir değişkene "null" değeri atayamayız. Çünkü null tip bilgisini vermez.
 * 5. "var" anahtar kelimesini method parametrelerinde kullanamayız.
 * 6. "var" anahtar kelimesi reserve bir kelime değildir. Identifier olarak kullanabiliriz.
 * 7. "var" anahtar kelimesi bir constructor, method veya initializer block içerisinde kullanılabilir.
 * 8. "var" anahtar kelimesi ile tanımlanan değişkenler primitive tiplerdir. Ancak biz bunları cast işlemi ile Instance variable lara çevirebiliriz.
 * 9. "var" anahtar kelimesi birden fazla değişken tanımına izin vermez.
 *
 */
