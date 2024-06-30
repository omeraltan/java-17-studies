package org.basics.oca8._38_HashCode;

public class HashCodeNotes {



}


/**
 *
 * java.lang.Object
 * Bu method "native" bir method dur.
 * Bu method arka planda JVM tarafından implement edilmektedir.
 * public native int hashCode();
 * int, 32 bit signed.
 * Bu hashCode bilgisini nesnenin bir nevi id bilgisi gibi düşünebiliriz.
 * HashMap, Hashtable, HashSet gibi Collection yapıları, objelerin saklanması / store noktasında hashCode değerinden faydalanır.
 * hasCode kullanan veri yapılarını kullandığımızda , hashCode metoduyla birlikte equals i beraber override edebiliriz.
 *
 * For Example:
 *
 *  Key         Hashcode Algorithm              Hashcode
 *
 *  Alex        A(1) + L(12) + E(5) + X(24)     = 42
 *  Bob         B(2) + O(15) + B(2)             = 19
 *  Dirk        D(4) + I(9)  + R(18) + K(11)    = 42
 *  Fred        F(6) + R(18) + E(5)  + D(4)     = 33
 *
 *  Hashcode Buckets:   19          33          42
 *                      |           |           |
 *                    "Bob"      "Fred"      "Alex"
 *                                           "Dirk"
 *
 * Condition                        Required                        NotRequired(But Allowed)
 * ---------                        --------                        ------------------------
 * x.equals(y) == true              x.hashCode() == y.hashCode()
 * x.hashCode() == y.hashCode()                                     x.equals(y) == true
 * x.equals(y) == false                                             No hashCode() requirements
 * x.hashCode() != y.hashCode()     x.equals(y) == false
 *
 *
 * Eğer equals() değerleri aynı ise hashCode() değerleride aynı olmak zorundadır.
 * hashCode() değerlerinin aynı olması equals() değerlerinin de aynı olacağı manasına gelmez.
 * "Alex" ve "Dirk" aynı hashCode()'u  içermelerine rağmen equals() ları aynnı değildir.
 *
 *
 */
