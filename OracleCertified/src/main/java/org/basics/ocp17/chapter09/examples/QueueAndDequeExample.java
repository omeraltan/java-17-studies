package org.basics.ocp17.chapter09.examples;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueAndDequeExample {

    public static void main(String[] args) {

        Queue<String> list = new LinkedList<>();

        list.add("ömer");                       // add methodu hata fırlatabilir.
        list.add("ebru");
        list.add("adil");
        list.offer("elif");                 // add ve offer methodu sona ekleme yapar.

        System.out.println(list);

        System.out.println(list.element());     // önden okuma yapıyor
        System.out.println(list.peek());        // önden okuma yapıyor

        System.out.println(list.remove());
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);

        // Methodlar: add, offer (ön tarafa ekleme yapmak için)
        // Methodlar: element, peek (ön taraftan okuma yapar)
        // Methodlar: remove, poll (ön taraftan silme yapar)

        System.out.println("--------------------");

        Queue<Integer> list2 = new LinkedList<>();
        list2.add(12);
        list2.offer(32);
        list2.offer(23);
        list2.offer(2);
        list2.remove();
        list2.add(33);
        list2.poll();
        System.out.println(list2); // [23, 2, 33]
        list2.add(55);
        list2.poll();
        System.out.println(list2.element()); // [2]
        System.out.println(list2);  // [2, 33, 55]

        System.out.println("--------------------");

        Queue<String> list3 = new LinkedList<>();
        list3.offer("ÖMER");
        list3.offer("EBRU");
        list3.offer("ADIL");
        list3.offer("ELİF");

        System.out.println(list3);
        System.out.println(list3.element());
        System.out.println(list3.peek());
        list3.add("FAHRİ");
        list3.add("ZELİHA");
        list3.add("ZEYNEP");

        System.out.println(list3);
        System.out.println(list3.remove());
        System.out.println(list3.poll());
        System.out.println(list3);

        list3.forEach(System.out::println);
        System.out.println(list3.removeIf(s -> s.startsWith("A")));
        System.out.println(list3);

        System.out.println("--------------------");

        Deque<String> list4 = new LinkedList<>();
        list4.addFirst("ÖMER");
        list4.addFirst("EBRU");
        list4.addLast("ADİL");
        list4.addLast("ELİF");

        System.out.println(list4); // [EBRU, ÖMER, ADİL, ELİF]

        list4.offerFirst("FAHRİ");
        list4.offerLast("ZELİHA");

        System.out.println(list4);

        System.out.println(list4.getFirst());
        System.out.println(list4.getLast());
        System.out.println(list4.peekFirst());
        System.out.println(list4.peekLast());
        System.out.println(list4.removeFirst());
        System.out.println(list4.removeLast());
        System.out.println(list4.pollFirst());
        System.out.println(list4.pollLast());
        System.out.println(list4);

        list4.push("EFE");
        list4.push("DİLEK");
        System.out.println(list4);
        System.out.println(list4.pop());
        System.out.println(list4);
        System.out.println(list4.peek());

    }

}
