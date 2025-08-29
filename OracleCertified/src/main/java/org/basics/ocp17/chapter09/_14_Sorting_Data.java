package org.basics.ocp17.chapter09;



import java.util.*;

public class _14_Sorting_Data {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(6,9,1,8);
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,6));   // 1
        System.out.println(Collections.binarySearch(list,3));   // -2
        System.out.println(Collections.binarySearch(list, 1));  // 0
        System.out.println(Collections.binarySearch(list, 8));  // 2

        System.out.println("--------------------");

        var names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c = Comparator.reverseOrder();
        var index = Collections.binarySearch(names, "Hoppy", c);
        System.out.println(index);  // reverseOrder yapıldığı için unpredictable'dır. Belirsiz çıktı için değer -1'dir.

    }

}

class SortRabbits{
    static record Rabbit(int id){}

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit(3));
        rabbits.add(new Rabbit(1));
        rabbits.add(new Rabbit(5));
        rabbits.add(new Rabbit(2));
        rabbits.add(new Rabbit(4));
        // Collections.sort(rabbits);   // DOES NOT COMPILE (Rabbit sınıfı Comparable olmadığı için compile time hatası verir)

        Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
        Collections.sort(rabbits, c);
        System.out.println(rabbits);

        Collections.reverse(rabbits);
        System.out.println(rabbits);


    }
}

class UseTreeSet{

    static class Rabbit{
        int id;

        public Rabbit(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Rabbit{" +
                "id=" + id +
                '}';
        }
    }

    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles"));

        // Set<Rabbit> rabbits = new TreeSet<>();
        // rabbits.add(new Rabbit());   // ClassCastException

        // Set<Rabbit> rabbits = new TreeSet<>((r1,r2) -> r1.id - r2.id);                       // id ye göre sıralama
        Set<Rabbit> rabbits = new TreeSet<>((r1,r2) -> r2.id - r1.id);            // id ye göre tersten sıralama
        rabbits.add(new Rabbit(10));
        rabbits.add(new Rabbit(0));
        rabbits.add(new Rabbit(20));
        rabbits.add(new Rabbit(50));

        System.out.println(rabbits);

        System.out.println("--------------------");

        Set<Rabbit> rabbit2 = new TreeSet<>(Comparator.comparingInt(r -> r.id));        // id'ye göre sıralama
        rabbit2.add(new Rabbit(10));
        rabbit2.add(new Rabbit(0));
        rabbit2.add(new Rabbit(20));
        rabbit2.add(new Rabbit(50));

        System.out.println(rabbit2);
    }

}

class SortingAList{

    public static void main(String[] args) {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);
        bunnies.sort((b1, b2) -> b1.compareTo(b2));     // compareTo methodu iki tane parametre alır ve geriye int döner. Bir functional interface'dir.
        System.out.println(bunnies);

        System.out.println("---------------");

        List<String> bunnies2 = new ArrayList<>();
        bunnies2.add("long ear");
        bunnies2.add("floppy");
        bunnies2.add("hoppy");
        bunnies2.sort(String::compareTo);
        System.out.println(bunnies2);

        System.out.println("---------------");

        List<String> bunnies3 = new ArrayList<>();
        bunnies3.add("long ear");
        bunnies3.add("floppy");
        bunnies3.add("hoppy");
        bunnies3.sort(Comparator.comparingInt(String::length));
        System.out.println(bunnies3);
    }

}

/**
 *
 * -------------------- Searching And Sorting --------------------
 * Set ve Map üzerinde bir sorted yapı yoktur. Unordered bir yapıya sahiptirler.
 *
 *
 */
