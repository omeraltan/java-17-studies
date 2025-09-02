package org.basics.ocp17.chapter09;

import java.util.List;

public class _18_Working_With_Generics {

    public static void main(String[] args) {



    }

}

class Handler{

    public static <T> void prepare(T t){
        System.out.println("Preparing " + t);
    }

    public static <T> Crate<T> ship(T t){
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }

}

class More{
    public static <T> void sink(T t){}
    public static <T> T identity(T t) {return t;}
    // public static T noGood(T t) {return t;} // DOES NOT COMPILE
    // Static method'lar class instance'ına bağlı değildir - class'ın kendisine aittir
    //Generic type parameter <T> instance seviyesinde tanımlanır - class'ın her instance'ı için farklı olabilir
    //Static method'lar instance oluşturulmadan çağrılabilir, bu yüzden hangi T tipini kullanacağını bilemez
}

class Box{
    public static <T> void ship(T t){
        System.out.println(t);
    }
}

class BoxTest{
    public static void main(String[] args) {
       Box.<String>ship("package");
       Box.<String[]>ship(args);
    }
}

class TrickyCrate<T>{

    public static String crateName() {
        TrickyCrate<Robot> crate = new TrickyCrate<>();
        return crate.tricky("bot");
    }

    public <T> T tricky(T t){
        return t;
    }

}

class Example<T> {  // Class-level generic
    private T field;

    // Method-level generic - farklı tip kullanabilir
    public <U> void method(U param) {
        System.out.println("Class T: " + field.getClass().getSimpleName());
        System.out.println("Method U: " + param.getClass().getSimpleName());
    }

    // Class T'yi kullanan method
    public void useClassT(T param) {
        this.field = param;
    }

    public static void main(String[] args) {
        // Kullanım:
        Example<String> example = new Example<>();
        example.useClassT("hello");           // T = String
        example.method(42);                   // U = Integer
        example.method(true);                  // U = Boolean
    }
}

record CrateRecord<T> (T contents){

    @Override
    public T contents(){
        if (contents == null)
            throw new IllegalStateException("missing contents");
        return contents;
    }

}

class CrateRecordTest{

    public static void main(String[] args) {

        Robot robot = new Robot();
        CrateRecord<Robot> record = new CrateRecord<>(robot);
        CrateRecord<Integer> crateRecord1 = new CrateRecord<>(100);
        CrateRecord<List<Integer>> crateRecord2 = new CrateRecord(List.of(10,20));

        System.out.println(record.contents());
        System.out.println(crateRecord1.contents());
        System.out.println(crateRecord2.contents());

    }

}

record CrateRecord2<T> (T contents) {
    // Bu otomatik olarak şunları oluşturur:
    // - private final T contents field
    // - Constructor: CrateRecord(T contents)
    // - Getter: public T contents()
    // - equals(), hashCode(), toString() methodları
}



/**
 *
 * --------------- Writing Generic Methods ---------------
 * Generic parameterlar class ve interface seviyesinde tanımlanabildiği gibi method tanımlarında da generic parameter kullanılabilir.
 * Bu özellikle static methodlar için kullanılmaktadır.
 * Static methodlar için generic deklerassyonu yapılmak zorundadır.
 * Static method'larda generic type parameter kullanmak için method seviyesinde <T> tanımlamak gerekir, class seviyesinde değil.
 *
 * --------------- Optional Syntax For Invoking A Generic Method ---------------
 * Verilen T parametresi bu şekilde de ifade edilebilir:
 * Box.<String>ship("package");
 * Box.<String[]>ship(args);
 *
 * Class seviyesinde ve method seviyesinde generic type tanımı yapıldığında birbirinden farklı olur (Örnek: TrickyCrate class'ı).
 * Genericler recorlar ile kullanılabilir.
 *
 */
