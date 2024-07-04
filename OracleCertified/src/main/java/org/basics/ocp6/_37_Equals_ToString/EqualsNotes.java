package org.basics.ocp6._37_Equals_ToString;

public class EqualsNotes {

    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Long l1 = new Long(10);
        System.out.println(i1.equals(l1));

        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");

        System.out.println(sb1.equals(sb2));
        // StringBuffer sınıfında equals methodu override edilmemiştir. Bu yüzden false döner.
        System.out.println(sb1.toString().equals(sb2.toString()));





    }

}

/**
 *
 * java.lang.Object sınıfında yer alan equals() methodu şu şekildedir.
 *
 * public boolean equals(Object obj){
 *     return (this == obj);
 * }
 * buradaki equals methodu == ile aynı anlama gelmektedir.
 * yani bu 2 referans değişken aynı objeyi mi gösteriyor?
 *
 * Integer sınıfında equals() methodu override edilmiştir.
 *
 */
