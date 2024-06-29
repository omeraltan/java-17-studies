package org.basics.oca8._39;

public class CollectionNotes {



}

/**
 *
 * Collection yapıları java.util.collection paketinde yer alırlar
 * java.util.Collection
 * java.util.List
 * java.util.Set
 * java.util.Map
 * java.util.Queue
 *
 * Collection lar yapı olarak ayrılabilir -> Ordered & Unordered | Sorted & UnSorted
 * Ordered yapıda elemanlar belirli bir sırada tutulur.
 * ArrayList ordered bir yapıya sahiptir. Elemenalar eklediğimiz sırada tutulur (index based).
 * HashMap ve HashSet ise unordered bir yapıya sahiptir. Elemanlar eklediğimiz sırada tutulmaz.
 * Sorted & UnSorted
 * Elemanların sıralı olması öelliğidir.
 * Natural Order -> alfabetik sıralama yada numerik sıralama mantığındadır. For Example : Integer, String ...
 * Her şeyin sıralı olmasını düşünemeyiz.
 * Kendimiz bir Person sınıfı oluşturduğumuzda ve nesneler oluşturduğumuzda neyegöre kime göre sıralanması gerekiyor?
 * Bu durumda "Comparable", "Comparator" gibi interfaceleri kullanırız.
 * Sorted olan yapılar : TreeSet ve Treemap
 *
 *
 *
 *
 *
 *                         --------------------------------------- Collection (interface) -------------------------------------
 *                                  |                                        |                                       |
 *                         Set(interface)                            List(interface)                        Queue(interface)
 *                         |                 |                   |           |           |                  |               |
 *                     HashSet      SortedSet(interface)    ArrayList      Vector    LinkedList         LinkedList    PriorityQueue
 *                        |                 |
 *                 LinkedHashSet   NavigableSet(interface)
 *                                          |
 *                                       TreeSet
 *
 *
 *                                  Object                                                      Map(interface)
 *                         |                    |                               |                       |                       |
 *                      Arrays              Collections                     Hashtable               HashMap                 NavigableMap(interface)
 *                                                                                                      |                       |
 *                                                                                                LinkedHashMap             TreeMap
 *
 *
 */
