package org.basics.ocp17.chapter04;

import java.util.Locale;

public class _02_Important_String_Methods {

    public static void main(String[] args) {

        var name = "animals";
        System.out.println(name.length());          // -> 7

        String empty = "";
        System.out.println(empty.length());         // -> 0

        String whiteSpace = " ";
        System.out.println(whiteSpace.length());    // -> 1

        String escape = "\\-\"-\n-\t";
        System.out.println(escape.length());        // -> 7

        for (char c : escape.toCharArray()) {
            System.out.print("[" + c + "]");
        }

        var animal = "animals";
        System.out.println(animal.charAt(0));   // a
        System.out.println(animal.charAt(6));   // s
        //System.out.println(animal.charAt(7));   // exception (StringIndexOutOfBoundsException)

        System.out.println("----------");

        var animals = "animals";
        System.out.println(name.indexOf('a'));                        // -> 0
        System.out.println(animals.indexOf("al"));                    // -> 4
        System.out.println(animals.indexOf('a', 4));    // -> 4
        System.out.println(animals.indexOf("al", 5));   // -> -1

        System.out.println("----------");

        String content = "abc dda fag";
        System.out.println(content.lastIndexOf("a"));
        System.out.println(content.lastIndexOf("a", 6));
        System.out.println(content.lastIndexOf("a", 3));

        System.out.println("----------");

        String sub = "animals";
        System.out.println(sub.substring(3));           // -> mals
        System.out.println(sub.substring(name.indexOf('m')));     // -> mals
        System.out.println(sub.substring(3,7));                   // -> mals
        System.out.println(sub.substring(3,4));                   // -> m
        System.out.println(sub.substring(3,3));                   // ->
        //System.out.println(sub.substring(3,2));                   // -> exception
        //System.out.println(sub.substring(3,8));                   // -> exception

        System.out.println("----------");

        var caseStuation = "animals";
        System.out.println(caseStuation.toUpperCase());
        System.out.println(caseStuation.toLowerCase());

        System.out.println("ıişüğçö".toUpperCase(Locale.UK));
        System.out.println("ıişüğçö".toUpperCase(new Locale("tr", "TR")));

        System.out.println("----------");

        System.out.println("abc".equals("ABC"));                        // -> false
        System.out.println("ABC".equals("ABC"));                        // -> true
        System.out.println("abc".equalsIgnoreCase("ABC"));  // -> true

        System.out.println("----------");

        System.out.println("abc".startsWith("a"));                      // -> true
        System.out.println("abc".startsWith("A"));                      // -> false

        System.out.println("abc".endsWith("c"));                        // -> true
        System.out.println("abc".endsWith("a"));                        // -> false

        System.out.println("abc".contains("a"));                        // -> true
        System.out.println("abc".contains("A"));                        // -> false

        System.out.println("----------");

        System.out.println("abcabc".replace('a', 'A'));      // -> AbcAbc
        System.out.println("abcabc".replace("a", "A"));     // -> AbcAbc
        System.out.println("abcabc".replace("a", "AX"));    // -> AXbcAXbc

        System.out.println("----------");

        String mailaddress = "omeraltan@gmail.com";
        char[] chars = mailaddress.toCharArray();
        for (char c : chars) {
            System.out.print(c + "-");
        }
        System.out.println("");
        System.out.println("----------");

        String contentChars = "ömeraltan";
        char[] charArray = new char[4];

        contentChars.getChars(2,6,charArray,0);
        for (char c : charArray){
            System.out.print("[" + c + "]");
        }
    }

}

/**
 *
 * 1. charAt(int index) : Belirtilen index teki karakteri geriye döner.
 * 2. indexOf()         : Tek bir karakter veya bir String ifadesi alabilir. Tek bir karakter ile bu karakterin index değerini bize döner.
 * 3. lastIndexOf()     : Bu method String değerinde sondan bakmaya başlar yani sağdan sola doğru bakmaya başlar.
 * 4. substring()       : Bu String methodu String ifadenin bir bölümünü dönecektir.
 *                        Belirtilen index değerinden başlayıp sona kadar döner yada verilen başlangıç ve bitiş değerleri arasındaki ifadeyi dönecektir.
 *                        "Başlangıç karakteri dahil bitiş karakteri hariçtir."
 * 5. toLowerCase()     : Büyük harfleri küçük harfe çevirir.
 * 6. toUpperCase()     : Küçük harfleri büyük harfe çevirir.
 * 7. equals()          : Bu method iki String ifadenin aynı sırada aynı karakterleri içerip içermediğine bakacaktır.
 * 8. equalsIgnoreCase(): Bu method da equals() methodu gibi çalışır ancak karakterlerin büyük küçük durumlarını dikkate almaz.
 *                        "equals() "methodu Object alırken "equalsIgnoreCase()" methodu String alır.
 *                        equals() methodu java.lang.object sınıfında yer alır ve String sınıfı equals() methodunu override etmektedir.
 *                        equalsIgnoreCase() methodu String e özgü tanımlanmış bir methoddur.
 * 9. toString(); equals(Object); hashCode(); : Bu methodlar java.lang.Object sınıfında yer alır. Eğer alt sınıflar tarafından override edilmezler ise Object sınıfındaki bu methodlar varsayıla olarak kullanılır.
 * 10.equals(Object)    : Bu method override edilmez ise nesneleri karşılaştırmak için kullanılır. Eğer override edilmez ise == operatörü ile aynı şekilde çalışır. İki referans değişkenin aynı objeyi gösterip göstermediği olacak.
 * 11.hashCode()        : equals() methodu override edildiğinde hashCode() methodu da override edilmelidir. Eğer iki nesne için a.equals(b) true ise a.hashCode() == b.hashCode() true olmalıdır.
 * 12.startsWith()      : Verdiğimiz String değerin diğer String in başında yer alıp almadığını kontrol eder.
 * 13.endWiths()        : Verdiğimiz String değerin diğer String in sonunda yer alıp almadığını kontrol eder.
 * 14.contains()        : Verdiğimiz String değerin diğer String in herhangi bir yerinde olup olmadığına bakar.
 * 15.replace()         : Bu method "char" ve "CharSequence" alır. İki parametre alırlar ve ilk parametre değiştirilen değer ikinci parametre değiştirilecek değer
 * 16.toCharArray()     : Bu method String ifadeyi char array e dönüştürecektir.
 *
 */
