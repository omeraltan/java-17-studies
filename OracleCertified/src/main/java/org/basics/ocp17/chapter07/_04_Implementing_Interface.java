package org.basics.ocp17.chapter07;

public class _04_Implementing_Interface {

}

interface IsColdBlooded{
    boolean hasScales();
    default double getTemperature(){
        return 10.0;
    }
}

class Snake implements IsColdBlooded{

    @Override
    public boolean hasScales() {    // Required override
        return true;
    }

    public double getTemperature(){ // Optional override
        return 12;
    }
}

interface Carnivore{
    // public default void eatMeat();                   // -> DOES NOT COMPILE (abstract gibi tanımlanmış)
    // public int getRequiredFoodAmount(){return 13;}   // -> DOES NOT COMPILE (default olarak tanımlanmamış)
}

interface Walk{
    public default int getSpeed(){return 5;}
}

interface Run{
    public default int getSpeed(){return 10;}
}

class Cat implements Walk, Run{
    public int getSpeed(){return 1;}

    public int getWalkSpeed(){
        return Walk.super.getSpeed();
    }

    public int getRunSpeed(){
        return Run.super.getSpeed();
    }
}

interface Hop{
    static int getJumpHeight(){
        return 8;
    }

}

class Skip{
    public int skip(){
        return Hop.getJumpHeight();
    }
}

class Bunny implements Hop{
    public void printDetails(){
        // System.out.println(getJumpHeight());     // -> DOES NOT COMPILE
    }
}

interface ZooTrainTour{
    abstract int getTrainName();
    private static void ride(){}
    default void playHorn(){getTrainName(); ride();}
    // public static void slowDown(){playHorn();}       // -> OOES NOT COMPILE (static method default methodu çağıramaz.)
    static void speedUp(){ride();}
}

/**
 *
 * Interface'ler önceleri sadece "abstract" methodlara ve "constant" 'lara sahipti sonrasında yeni methodlar eklenmiştir.
 *
 *                                  --------------- Interface Member Types ---------------
 *
 *                                  Membership type         Required modifiers          Implicit modifiers          Has value or body?
 *                                  ---------------         ------------------          ------------------          ------------------
 * concrete variable                Class                   -                           public static final         Yes
 * abstract method                  Instance                -                           public abstract             No
 * default method                   Instance                default                     public                      Yes
 * static method                    Class                   static                      public                      Yes
 * private method                   Instance                private                     -                           Yes
 * private static method            Class                   private static              -                           Yes
 *
 * "public" ve "private" methodları interfacelerde tanımlayabiliriz ancak "protected" ve "package level" olarak bir tanımlama yapılamaz.
 * Bir interface'e default bir method eklersek bu method mevcut implementasyonu bozmayacaktır. Default methodları override etmek zorunda değiliz.
 * Default anahtar kelimesi interfacelerde, default methodlarda kullanılmaktadır ancak default anahtar kelimesinin "access level" (package level, public, protected, private) ile bir alakası yoktur.
 * Default methodlar public access level özelliğine sahiptir.
 * Default Interface Method Definition Rules :
 * 1- Bir default method sadece interface içerisinde tanımlanabilir.
 * 2- Bir default method mutlaka default anahtar kelimesi ile tanımlanmalıdır ve gövdeli olmalıdır.
 * 3- Bir default method dolaylı olarak public'tir.
 * 4- Bir default method public, abstract ve static olamaz ve bunlarla birlikte bir araya gelemez.
 * 5- Bir default method, bu default method'a sahip interface'i implement eden sınıflar tarafından "override" edilebilir ama bir zorunuluk yoktur.
 * 6- Eğer bir sınıf iki yada daha fazla aynı method signature'a sahip methodu inherit ediyorsa bu durumda ilgili sınıf bu default method'u mutlaka override etmelidir.
 * Declaring static Interface Methods :
 * 1- Interface'lerde static method tanımıda yapılabilir.
 * 2- Bir static method mutlaka static anahtar kelimesi ile tanımlanmalıdır ve gövdeli olmalıdır.
 * 3- Bir static method'da access modifier yoksa dolaylı olarak public'tir.
 * 4- Bir static method "abstract" yada "final" yada "default" olamaz.
 * 5- Bir static method kalıtılmaz.
 * 6- Bir interface'in static methodu çağırılırken interface ismi nokta method ismi ile çağırılır.
 * 7- Bir static method'da access modifier yoksa bu durumda "public" olacaktır.
 * Private Interface Method Definition Rules:
 * 1- private interface methodlar "private" olarak işaretlenmelidir ve gövdeli olmalıdır.
 * 2- private static method, interface'te yer alan herhangi bir methoddan çağırılabilir.
 * 3- private interface method sadece default yada ilgili interface'te yer alan diğer private non-static methodlardan çağırılabilir.
 * 4- private methodlara bu interface'i implemente eden sınıflar erişim sağlayamaz sadece interface içerisinde kullanılabilirler.
 *
 *
 * Interface member access:
 *
 *                                 Accessible from default and private methods within the interface?            Accessible from static methods within the interface?            Accessible from methods in classes inheriting the interface?            Accessible without an instance of the interface?
 *                                 -----------------------------------------------------------------            ----------------------------------------------------            ------------------------------------------------------------            ------------------------------------------------
 * Constant variable                Yes                                                                         Yes                                                             Yes                                                                     Yes
 * abstract method                  Yes                                                                         No                                                              Yes                                                                     No
 * default method                   Yes                                                                         No                                                              Yes                                                                     No
 * static method                    Yes                                                                         Yes                                                             Yes (interface name required)                                           Yes(interface name required)
 * private method                   Yes                                                                         No                                                              No                                                                      No
 * private static method            Yes                                                                         Yes                                                             No                                                                      No
 *
 *
 * Javada instance methodlar direkt olarak static methodları çağıramazlar ancak static methodlar direkt olarak instance methodları çağırabilirler.
 * static methodlar ve değişkenler interface class objesine aittir.
 *
 */
