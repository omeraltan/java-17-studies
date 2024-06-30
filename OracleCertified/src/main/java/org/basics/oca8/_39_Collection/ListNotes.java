package org.basics.oca8._39_Collection;

public class ListNotes {



}

/**
 *
 * java.util.List
 * public interface List<E> extends Collection<E>{
 *
 * }
 *
 * List duplicate elemana izin verir. Elemanlar index based olarak tutulur.
 *
 * java.util.ArrayList
 * java.util.LinkedList
 * java.util.Vector
 *
 * ArrayList  : random access ve iteration söz konusu olduğunda daha hızlı çalışır.
 * LinkedList : ekleme veya çıkartma işlemi bol miktarda kullanılıyorsa daha verimli olacaktır. Ayrıca Queue interface ini implemente etmektedir.
 * Vector     : javanın 1.2 versiyonundan beri vardır. Methodları synchronized özelliğe sahiptir. Thread-Safe dir. Daha yavaş çalışır.
 *
 * Set Duplicate elemana izin vermez.
 *
 * java.util.HashSet
 * java.util.LinkedHashset
 * java.util.TreeSet
 *
 * HashSet       : unrodered bir yapıya sahiptir. Elemenlar eklenildiği sırada tutulmazlar.
 * LinkedHashSet : Elemanlar eklenildiği sırada tutulur.
 * TreeSet       : Elemanlar sorted (sıralı) şekilde tutulur.
 *
 * Map key value şeklinde tutulur. Key değeri unique olmak zorundadır. value değeri unique olmak zorunda değildir.
 *
 * java.util.HashMap
 * java.util.Hashtable
 * java.util.TreeMap
 *
 * HashMap      : Elemanlar eklendildiği sırada tutulmazlar. HashMap null "key"'e izin verir. value olarak "null" eklenebilir.
 * Hashtable    : Vektör sınıfı gibi javanın eski sürümlerinden beri vardır. null key yada value eklenmesine izin vermez.
 * TreeMap      : Sorted özelliğe sahiptir. Elemanları sıralı bir şekilde tutulur. Key'e göre sıralı bir şekilde tutulur.
 *
 *
 *
 */
