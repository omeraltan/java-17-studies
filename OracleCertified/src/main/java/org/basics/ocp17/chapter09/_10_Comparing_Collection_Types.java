package org.basics.ocp17.chapter09;

import java.util.TreeSet;

public class _10_Comparing_Collection_Types {

    public static void main(String[] args) {



    }

}

/**
 *
 * -------------------- Comparing Collection Types --------------------
 * -------------------------------------------------------------------------------------------------------------------------------------------------
 * Type      Can contain duplicate elements  Elements always ordered?            Has keys and values?            Must add/remove in specific order?
 * -------------------------------------------------------------------------------------------------------------------------------------------------
 * List      Yes                             Yes (by index)                      No                              No
 * Map       Yes (for values)                No                                  Yes                             No
 * Queue     Yes                             Yes (retrieved in defined order)    No                              Yes
 * Set       No                              No                                  No                              No
 * -------------------------------------------------------------------------------------------------------------------------------------------------
 *
 * -------------------- Collection Attributes --------------------
 * -------------------------------------------------------------------------------------------------------------------------------------------------
 * Type         Java Collections Framework interface    Sorted  Calls hashCode? Calls compareTo?
 * -------------------------------------------------------------------------------------------------------------------------------------------------
 * ArrayDeque   Deque                                   No      No              No
 * ArrayList    List                                    No      No              No
 * HashMap      Map                                     No      Yes             No
 * HashSet      Set                                     No      Yes             No
 * LinkedList   List,Deque                              No      No              No
 * TreeMap      Map                                     Yes     No              Yes
 * TreeSet      Set                                     Yes     No              Yes
 * -------------------------------------------------------------------------------------------------------------------------------------------------
 *
 * Sorted özelliğe sahip olan, "TreeMap" ve "TreeSet" 'e "null" değer ekleyemeyiz.
 * Hashtable : Hashtable'ın methodları synchronized'dır. Hashtable null değerlere sahip olamaz (key-value pair).
 * Stack     : (LIFO) Last in First Out mantığına göre çalışır.
 * Vector    : AbstractList sınıfını kalıtır. List interface'ini implement eder. Methodları synchronized özelliğe sahiptir. null eleman eklenmesine izinvermektedir.
 *
 *
 *
 */
