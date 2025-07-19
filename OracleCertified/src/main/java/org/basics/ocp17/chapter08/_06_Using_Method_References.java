package org.basics.ocp17.chapter08;

public class _06_Using_Method_References {

    public static void main(String[] args) {

        EmptyStringCreator methodRef = String::new;
        EmptyStringCreator lambda = () -> new String("Ömer");

        System.out.println(methodRef.create());
        System.out.println(lambda.create());

        System.out.println("---------------");

        StringCopier methodRef2 = String::new;
        StringCopier lambda2 = x -> new String(x);

        var myString = methodRef2.copy("Zebra");
        System.out.println(myString.equals("Zebra"));

    }

}

interface EmptyStringCreator{
    String create();
}

interface StringCopier{
    String copy(String value);
}

/**
 *
 * ----- Calling Constructors -----
 * Bir Constructor referans, method referansın özel bir tipidir.
 * Nesne oluşturup instance değişken üzerinden method çağırmak yerine "new" anahtar kelimesini kullanırız.
 * 4 farklı şekilde method referansı vardır.
 *
 *      ----------- Method References ----------
 *      Type                                        Before colon                    After colon         Example
 *      ------------------------------------------------------------------------------------------------------------
 *      static methods                              Class name                      Method name         Math::random
 *      Instance methods on a particular object     Instance variable name          Method name         str::startsWith
 *      Instance methods on a parameter             Class name                      Method name         String::isEmpty
 *      Constructor                                 Class name                      new                 String::new
 *
 *
 *
 */
