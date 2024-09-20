package org.basics.ocp17.chapter01;

public class _03_Writing_A_Main_Method {

    public final static void main(final String[] args) {
        System.out.println("Hello World");
        System.out.println(args[0] + " " + args[1]);
        System.out.println(test());
    }

    public static String test(){
        return "Hello static method";
    }

}

class Test{
    public static void main(String[] args) {
        System.out.println(_03_Writing_A_Main_Method.test());
    }
}

class Test2{
    public static void main(String args[]) {
        System.out.println("Hello Args-2");
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}

class Test3{
    public static void main(String... args) {
        System.out.println("Hello Args-3");
    }
}

class Test4{
    public final static void main(final String... args) {
        System.out.println("Hello Args-4");
    }
}

class Zoo{
    public static void main(String... args) {
        System.out.println(args[0] + " " + args[1]);
    }
}

/**
 *
 * Bu class içerisinde bir main methodu oluşturulmuştur.
 * En basit hali ile bu java kodumuzu javac _03_Writing_A_Main_Method.java ile derleyip java _03_Writing_A_Main_Method ile çalıştırdığımızda ekkrana "Hello World" yazacaktır.
 * Her bir source file sadece bir java class ı içerebilir.
 * Eğer bir sınıf programın giriş noktası ise bir main method olması gerekir.
 * Public anahtar kelimesi bir access modifier dır. public anahtar kelimesi ile heryerden erişim sağlanabilir.
 * static anahtar kelimesi ile bir method ile bir sınıfı bağlar.
 * static bir method veya değişken, Sınıf ismi ve nokta ile çağrılabilir. Örneğin "_03_Writing_A_Main_Method.test"
 * Java, main methodunu çağırmak için nesne oluşturmaya ihtiyaç duymaz.
 * void anahtar kelimesi dönüş tipini temsil etmektedir.
 * Eğer geriye bir şey dönmeyeceksek main kullanırız.
 * main methodunun içinde kullanılan parametre listesi üç farklı formatta olabilir.
 * main methoduna parametre gönderdiğinizde şu şekillerde gönderebilirsiniz:
 *
 *      javac Zoo.java
 *      java Zoo Bronx Zoo          -> Birinci parametre Bronx ikinci parametre Zoo
 *      java Zoo "San Diego" Zoo    -> Birinci parametre "San Diego" ikinci parametre Zoo
 *
 * Eğer main methoduna yeterli parametre göndermezsek kodumuz patlar (Zoo sınıfı için).
 * Çünkü bizden iki parametre bekliyor.
 * Tek bir komut ile hem derleme hem çalıştırma yapabiliriz : java Zoo.java Bronx Zoo
 * Buna "single-file-sourcecode" özelliği denir
 * Parametre alması gereken main methodumuza parametrelerini göndermediğimizde : "java.lang.ArrayIndexOutOfBoundsException" hatası alırız.
 *
 *
 */
