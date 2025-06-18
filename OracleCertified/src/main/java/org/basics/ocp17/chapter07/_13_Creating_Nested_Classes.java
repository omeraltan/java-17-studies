package org.basics.ocp17.chapter07;

public class _13_Creating_Nested_Classes {

    public static void main(String[] args) {



    }

}

class PrintNumbers{

    private int length = 5;

    public void calculate(){

        final int width = 20;

        class Calculator{

            public void multiply(){
                System.out.println(length * width);
            }
        }
        var calculator = new Calculator();
        calculator.multiply();
    }

    public static void main(String[] args) {
        var printer = new PrintNumbers();
        printer.calculate();
    }

    public void processData(){
        final int length = 5;
        int width = 10;
        int height = 2;
        class VolumeCalculator{
            // public int multiply(){
                // return length * width * height; // DOES NOT COMPILE (width local variable'ı effectively final değildir.)
            // }
        }
        width = 2;
    }

}

/**
 *
 * Writing a Local Class:
 * Local class'lar method, constructor veya bir kod bloğu içerisinde tanımlanmış nested class'lardır.
 * Local variable'larda olduğu gibi bir local class, method çağrılmadan var olmayacaktır ve method sonlanınca "scope" dışına çıkacaktır.
 * Bir Local class nesnesini sadece tanımlandığı method içinde oluşturabiliriz.
 * Local class'ın özellikleri:
 * 1- Local değişkenlerde olduğu gibi, access modifier'ları yer almaz.
 * 2- "final" yada "abstract" olarak tanımlanabilirler.
 * 3- Outer class'ın tüm field'larına erişebilirler (Eğer instance bir methodun içerisinde tanımlanmışlarsa).
 * 4- "final" ve "effectively final" değişkenlere erişim sağlayabilir.
 * Local class'lar neden final veya effectively final değişkenlere erişebilirler?
 * Compiler her bir inner class için ayrı bir class dosyası oluşturmaktadır.
 * Ayrı bir dosyada yer alan class'ın local variable'a refer etmesi mümkün değildir.
 * Bu nedenle eğer local variable final veya effectively final ise bu durumda Java pass by value yaklaşımı ile bu işi halledeceketir.
 *  *
 */
