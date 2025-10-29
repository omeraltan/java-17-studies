package org.basics.ocp17.chapter10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _26_Working_With_Advanced_Stream_Pipeline_Concepts {

    public static void main(String[] args) {

        var ohMy1 = Stream.of("lions","tigers","bears","dog","bird","chicken","sheep","snake","rabbit","monkey","fish");
        Map<Integer, Long> map1 = ohMy1.collect(
            Collectors.groupingBy(
                String::length,
                Collectors.counting()));
        System.out.println(map1);    // {3=1, 4=2, 5=4, 6=3, 7=1}

        System.out.println("--------------------");
        List<Book> books = Arrays.asList(
            new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 15000000),
            new Book("1984", "George Orwell", 1949, 30000000),
            new Book("To Kill a Mockingbird", "Harper Lee", 1960, 40000000),
            new Book("The Catcher in the Rye", "J.D. Salinger", 1951, 65000000),
            new Book("Pride and Prejudice", "Jane Austen", 1813, 20000000),

            new Book("Animal Farm", "George Orwell", 1945, 20000000),
            new Book("Sense and Sensibility", "Jane Austen", 1811, 15000000),
            new Book("The Hobbit", "J.R.R. Tolkien", 1937, 140000000),
            new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, 150000000),
            new Book("Murder on the Orient Express", "Agatha Christie", 1934, 30000000),

            new Book("And Then There Were None", "Agatha Christie", 1939, 100000000),
            new Book("The Da Vinci Code", "Dan Brown", 2003, 80000000),
            new Book("Angels & Demons", "Dan Brown", 2000, 39000000),
            new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997, 120000000),
            new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1998, 77000000),

            new Book("The Alchemist", "Paulo Coelho", 1988, 65000000),
            new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943, 140000000),
            new Book("It", "Stephen King", 1986, 35000000),
            new Book("The Shining", "Stephen King", 1977, 45000000)
        );

        Map<String, Long> soldCopiesStats = books
            .stream()
            .filter(book -> book.soldCopies() > 35_000_000)
            .collect(Collectors.groupingBy(Book::author, Collectors.counting()));
        System.out.println(soldCopiesStats);

        System.out.println("--------------------");

        var ohMy2 = Stream.of("lions","tigers","bears");
        Map<Integer, Optional<Character>> map2 = ohMy2.collect(
            Collectors.groupingBy(
                String::length,
                Collectors.mapping(
                    s -> s.charAt(0),
                    Collectors.minBy((a,b) -> a - b))));
        System.out.println(map2);   // {5=Optional[b], 6=Optional[t]}

        System.out.println("--------------------");

        List<EmployeeForOffice> employeeForOfficeList = Arrays.asList(
            new EmployeeForOffice("Tom Jones", 45, 15000.00),
            new EmployeeForOffice("Harry Andrews", 45, 7000.00),
            new EmployeeForOffice("Ethan Hardy", 65, 8000.00),
            new EmployeeForOffice("Nancy Smith", 22, 10000.00),
            new EmployeeForOffice("Deborah Sprightly", 29, 9000.00)
        );

        List<String> employeeNames = employeeForOfficeList
            .stream()
            .collect(Collectors.mapping(EmployeeForOffice::name, Collectors.toList()));
        System.out.println(employeeNames);

        System.out.println("--------------------");

        List<Integer> employeeAges = employeeForOfficeList
            .stream()
            .map(EmployeeForOffice::age).toList();
        System.out.println(employeeAges);

        System.out.println("--------------------");

        List<Person> personList = Arrays.asList(
            new Person("bob",34),
            new Person("bob",43),
            new Person("mary",84),
            new Person("john",12),
            new Person("bob",22),
            new Person("mary", 34));

        Stream<Person> personStream = personList.stream();

        Map<String, List<Integer>> result = personStream.collect(
            Collectors.groupingBy(p -> p.name,
                Collectors.mapping(e -> e.age, Collectors.toList())));
        System.out.println("Mapping result - " + result);

        System.out.println("--------------------");

        var ohMy3 = Stream.of("lions","tigers","bears","cat","dog","bird","fish","chicken");
        Map<Integer, Optional<Character>> map3 = ohMy3.collect(
            Collectors.groupingBy(String::length,
                Collectors.mapping(
                s -> s.charAt(0),
                Collectors.minBy((a,b) -> a - b))));
        System.out.println(map3);

        System.out.println("--------------------");

        var ohMy4 = Stream.of("lions","tigers","bears","cat","dog","bird","fish","chicken");
        Map<Integer, Optional<String>> map4 = ohMy4.collect(
            Collectors.groupingBy(String::length,
                Collectors.mapping(
                    String::toUpperCase,
                    Collectors.minBy(String::compareTo))));
        System.out.println(map4);


    }

    private record Book(String title, String author, int releaseYear, int soldCopies){}

    private record EmployeeForOffice(String name, Integer age, Double salary){}

    private record Person(String name, Integer age){}

}

/**
 *
 * -------------------- groupingBy with counting() method --------------------
 * -------------------- Debugging Complicated Generics -----------------------
 * collect() içinde çoğunlukla iç içe generics olur ve derleyici hataları okunması zordur. Bu durumla başa çıkmak için üç teknik:
 *
 * Teknik 1: Sıfırdan başla ve adım adım ekle
 * Basit bir ifadeyle başla ve yavaş yavaş ekle. Her adımda küçük bir değişiklik yap. Böylece hatayı hangi kod parçasının getirdiğini görürsün.
 * Örnek:
 *      // 1. Adım: Basit başla
 *      Map<String, Long> result = books.stream()
 *     .collect(Collectors.groupingBy(Book::author));
 *
 *      // 2. Adım: counting() ekle
 *      Map<String, Long> result = books.stream()
 *          .collect(Collectors.groupingBy(Book::author, Collectors.counting()));
 *
 * Teknik 2: İfadeyi parçalara ayır
 * İfadenin parçalarını ayrı değişkenlere çıkar. Önce küçük parçaları test et.
 * Örnek:
 *      // Önce bu küçük parçayı test et
 *      Collector<String, ?, Map<Integer, Long>> collector =
 *      Collectors.groupingBy(String::length, Collectors.counting());
 *
 *      // Eğer bu compile olursa, sorun başka yerde
 *      Map<Integer, Long> result = books.stream()
 *          .map(Book::title)
 *          .collect(collector);
 *
 * Teknik 3: Wildcard kullan
 * Son ifadenin dönüş tipinde generic wildcard (?) kullan. Kod derlenirse sorun dönüş tipi beklentisiyle ilgilidir.
 * Örnek:
 *      // Wildcard ile dene
 *      Map<?, ?> result = books.stream()
 *          .collect(Collectors.groupingBy(Book::author, Collectors.counting()));
 *
 * // Eğer bu çalışırsa, dönüş tipini düzelt
 * // Map<String, Long> olması gerekiyorsa, generic'leri kontrol et
 *
 * Bu teknikler, Collectors.groupingBy() gibi karmaşık collector'larda tip eşleşmeleri ve iç içe generics sorunlarını daha kolay ayırt etmene yardımcı olur.
 *
 * -------------------- mapping() --------------------
 * Stream'deki elemanları dönüştürüp (map) sonucu başka bir Collector'a geçirir.
 * Başka bir deyişle, bir map() + bir Collector'ı birleştirir.
 * Ne zaman kullanılır?
 *      groupingBy() içinde belirli bir alanı çıkarmak ve toplamak için
 *      partitioningBy() içinde özellik dönüşümü yapmak için
 *      Nested collector'larda ara dönüşüm gerektiğinde
 *
 */
