package org.basics.ocp17.chapter06;

public class _06_Initializing_Instances {

    public static void main(String[] args) {



    }

}

class ZooTickets{
    private String name = "BestZoo";
    {
        System.out.print(name + "-");
    }
    private static int COUNT = 0;
    static {
        System.out.print(COUNT + "-");
    }
    static {
        COUNT += 10;
        System.out.print(COUNT + "-");
    }
    public ZooTickets(){
        System.out.print("z-");
    }

    public static void main(String[] args) {
        new ZooTickets();
    }
}

class Primate{
    public Primate(){
        System.out.print("Primate-");
    }
}

class Ape extends Primate{
    public Ape(int fur){
        System.out.print("Ape1-");
    }
    public Ape(){
        System.out.print("Ape2-");
    }
}

class Chimpanzee extends Ape{
    public Chimpanzee(){
        super(2);
        System.out.print("Chimpanzee-");
    }

    public static void main(String[] args) {
        new Chimpanzee();
    }
}

class Cuttlefish{
    private String name = "swimmy";
    {
        System.out.println(name);
    }
    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }
    {
        COUNT++;
        System.out.println(COUNT);
    }
    public Cuttlefish(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Ready");
        new Cuttlefish();
    }
}

class GiraffeFamily{
    static {
        System.out.print("A");
    }
    {
        System.out.print("B");
    }
    public GiraffeFamily(String name){
        this(1);
        System.out.print("C");
    }
    public GiraffeFamily(){
        System.out.print("D");
    }
    public GiraffeFamily(int stripes){
        System.out.print("E");
    }
}

class Okapi extends GiraffeFamily{
    static {
        System.out.print("F");
    }
    public Okapi(int stripes){
        super("sugar");
        System.out.print("G");
    }
    {
        System.out.print("H");
    }

    public static void main(String[] args) {
        new Okapi(1);
        System.out.println();
        new Okapi(2);
    }
}



/**
 *
 * Bir class ta çalışma sırası şu şekildedir:
 * 1- "class" initialize edilir sonra "static block" 'lar çalışır. Bu çalışma yukarıdan aşağı doğrudur.
 * 2- sonra bir nesne oluşturulduğunda initialize block'lar çalışır
 * 3. sonra constructor'lar çalışır.
 * static initialize blocklar br kez initialize edilir.
 * Sınıfımız ilk olarak kullanıldığında JVM tarafından initialize edilir.
 * static final değişkenler bir kere değer atamasına tabi tutulur bu işlem static initializer block ta yada tanımlandığı yerde yapılması gerekmektedir.
 * final instance değişkenler bir kez değer atamasına tabi tutulur bu tanımlandığı yerde yada instance initializer block ta yada constructor da olmak zorundadır.
 * final olmayan static ve instance değişkenler için bir değer ataması otomatik olarak yapılır ve sıralamsı şu şekildedir:
 * variable declaration, initializers, and finally constructors
 *
 */
