package org.basics.ocp17.chapter09;

import java.util.*;

public class _05_Using_The_Queue_And_Deque_Interfaces {

    public static void main(String[] args) {

        linkedListQueueExample1();

        System.out.println("---------------");

        //linkedListQueueExample2();

        System.out.println("---------------");

        priorityQueueExample();

        System.out.println("---------------");

        dequeExample();

        System.out.println("---------------");

        arrayDequeExample();

        System.out.println("---------------");

        stackExample();

    }

    private static void linkedListQueueExample1(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(4);
        System.out.println(queue.remove());     // -> 10
        System.out.println(queue.peek());       // -> 4
        System.out.println(queue.peek());
    }

    private static void linkedListQueueExample2(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(35);
        queue.offer(10);
        queue.offer(30);
        queue.add(25);
        queue.add(15);
        queue.add(5);

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println(queue.poll());       // No Exception!
        System.out.println(queue.poll());       // No Exception!
        System.out.println(queue.poll());       // No Exception!
        System.out.println(queue.poll());       // No Exception!

        System.out.println(queue.remove());     // NoSuchElementException
    }

    private static void priorityQueueExample(){
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(4);

        System.out.println(queue.remove());     // 10
        System.out.println(queue.element());       // 4
        System.out.println(queue.peek());       // 4
    }

    private static void dequeExample(){
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addFirst(2);
        arrayDeque.add(3);
        arrayDeque.add(4);
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(0);
        arrayDeque.addLast(5);
        arrayDeque.add(6);

        System.out.println(arrayDeque);                 // [0, 1, 2, 3, 4, 5, 6]

        System.out.println("peekFirst");
        System.out.println(arrayDeque.peekFirst());     // 0
        System.out.println(arrayDeque.peekFirst());     // 0
        System.out.println(arrayDeque.peekFirst());     // 0

        System.out.println("peekLast");
        System.out.println(arrayDeque.peekLast());      // 6
        System.out.println(arrayDeque.peekLast());      // 6
        System.out.println(arrayDeque.peekLast());      // 6

        System.out.println("peek");
        System.out.println(arrayDeque.peek());          // 0
        System.out.println(arrayDeque.peek());          // 0
        System.out.println(arrayDeque.peek());          // 0

        System.out.println("getFirst");
        System.out.println(arrayDeque.getFirst());      // 0
        System.out.println(arrayDeque.getFirst());      // 0
        System.out.println(arrayDeque.getFirst());      // 0

        System.out.println("getLast");
        System.out.println(arrayDeque.getLast());       // 6
        System.out.println(arrayDeque.getLast());       // 6
        System.out.println(arrayDeque.getLast());       // 6

        System.out.println("removeFirst");
        System.out.println(arrayDeque.removeFirst());   // 0
        System.out.println(arrayDeque.removeFirst());   // 1
        System.out.println(arrayDeque);                 // [2, 3, 4, 5, 6]

        System.out.println("removeLast");
        System.out.println(arrayDeque.removeLast());    // 6
        System.out.println(arrayDeque.removeLast());    // 5
        System.out.println(arrayDeque);                 // [2, 3, 4]

        System.out.println("pollFirst");
        System.out.println(arrayDeque.pollFirst());     // 2
        System.out.println(arrayDeque);                 // [3, 4]

        System.out.println("pollLast");
        System.out.println(arrayDeque.pollLast());      // 4
        System.out.println(arrayDeque);                 // [3]

        System.out.println("poll");
        System.out.println(arrayDeque.poll());          // 3
        System.out.println(arrayDeque);                 // []
        System.out.println(arrayDeque.poll());          // null
        System.out.println(arrayDeque.poll());          // null

        System.out.println(arrayDeque.pollFirst());     // null
        System.out.println(arrayDeque.pollLast());      // null

        // System.out.println(arrayDeque.remove());        // NoSuchElementException (Eleman olmadığı için hata fırlatacaktır.)
        // System.out.println(arrayDeque.removeFirst());   // NoSuchElementException (Eleman olmadığı için hata fırlatacaktır.)
        // System.out.println(arrayDeque.removeLast());    // NoSuchElementException (Eleman olmadığı için hata fırlatacaktır.)
    }

    private static void arrayDequeExample(){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(4);
        System.out.println(stack.peek());       // 4
        System.out.println(stack.poll());       // 4
        System.out.println(stack.poll());       // 10
        System.out.println(stack.peek());       // null
    }

    private static void stackExample(){
        Stack<Integer> stack = new Stack<>();

        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);
        System.out.println(stack);

        System.out.println(stack.peek());       // 10
        System.out.println(stack.peek());       // 10
        System.out.println(stack.pop());        // 10
        System.out.println(stack.pop());        // 20
        System.out.println(stack.pop());        // 30
        System.out.println(stack.pop());        // 40
        System.out.println(stack.pop());        // 50
    }

}

/**
 *
 * Queue interface'i java.util paketinde yer alır ve Collection interface'ini kalıtır.
 * Deque interface'i de Queue interface'ini kalıtmaktadır.
 * Queue yapısını elemanları belirli bir sırada eklemek ve çıkartmak için kullanabiliriz.
 * Queue bir sıra gibidir. Örneğin stadyumdan içeri giriş için sıra beklemek gibidir.
 * Queue veri yapısı FIFO (First in First out) veya LIFO (Last in First out) şeklinde olabilir.
 * Deque -> "double and queue" olarak ifade edilir. Regular queue den farklı olarak elemanları başa yada sona ekleyebilir yada çıkartabiliriz.
 * --------------- Example of a Deque ---------------
 * Front (head) ---> Rover - Spot - Bella <--- Back (tail)
 *
 * ----- Comparing Deque Implementation -----
 * LinkedList sınıfı bir List'tir aynı zamanda Deque'dir. Yani List ve Deque interface'lerini implement eder. Dolayısıyla iki sınıfında methodlarına sahiptir.
 * İki ayrı interface'i impelemnte ettiği için tradeof özelliği olarak yani dezavantaj olarak bir pure queue kadar verimli değildir.
 * Eğer saf bir queue kullanmak istersek bu durumda arraydeque kullanabiliriz veya priorityque kullanabiliriz.
 *
 * -------------------- Queue Methods --------------------
 * Functionality                    Methods
 * -------------------------------------------------------
 * Add to back                      public boolean add(E e)         -> Hata fırlatma durumu var
 *                                  public boolean offer (E e)
 *
 * Read from front                  public E element()              -> Hata fırlatma durumu var
 *                                  public E peek()
 *
 * Get and remove from front        public E remove()               -> Hata fırlatma durumu var
 *                                  public E poll()
 *
 * PriorityQueue ise AbstractQueue kalıtır. AbstractQueue ise Queue interface'ini implement eder.
 * Deque ile listenin başına yada sonuna ekleme yapılabilir.
 *
 * -------------------- Deque Methods --------------------
 * Functionality                    Methods
 * -------------------------------------------------------
 * Add to front                     public void addFirst(E e)       -> Hata fırlatma durumu var
 *                                  public boolean offerFirst(E e)
 *
 * Add to back                      public void addLast(E e)        -> Hata fırlatma durumu var
 *                                  public boolean offerLast(E e)
 *
 * Read from front                  public E getFirst()             -> Hata fırlatma durumu var
 *                                  public E peekFirst()
 *
 * Read from back                   public E getLast()              -> Hata fırlatma durumu var
 *                                  public E peekLast()
 *
 * Get and remove from front        public E removeFirst()          -> Hata fırlatma durumu var
 *                                  public E pollFirst()
 *
 * Get and remove from back         public E removeLast()           -> Hata fırlatma durumu var
 *                                  public E pollLast()
 *
 * LIFO (Last in Firts out) kapsamında bazı methodlar bulunmaktadır. Bunlar:
 *
 * -------------------- Using a Deque As a Stack --------------------
 * Functionality                    Methods
 * ------------------------------------------------------------------
 * Add to the front/top             public void push(E e)
 *
 * Remove from the front/top        public E pop()
 *
 * Get first element                public E peek()
 *
 */
