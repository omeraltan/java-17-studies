package org.basics.ocp17.chapter05;

public class _04_Applying_Access_Modifiers {

    private String noise = "quack";
    String noise2 ="quack2";

    private void quack(){
        System.out.println(noise);
    }

    void quack2(){
        System.out.println(noise2);
    }

}

class Duck {

    public static void main(String[] args) {
        makeNoise();
    }

    public static void makeNoise(){
        var duck = new _04_Applying_Access_Modifiers();
        // duck.quack();                    // -> DOES NOT COMPILE
        // System.out.println(duck.noise);  // -> DOES NOT COMPILE
        duck.quack2();
        System.out.println(duck.noise2);
    }

}

/**
 *
 * private access   : Sadece aynı sınıf içerisinden erişim sağlanabilir. Başka bir sınıftan erişim sağlanamaz.
 * 1- Aynı sınıfın içinde oluşturulmuş sınıflar tarafından da erişilemez.
 * package access   : Herhangi bir anahtar kelime kullanmadığımızda "package access" olacaktır.
 * 1- Aynı pakette bulunan sınıflar bu değişkenlere ve methodlara erişim sağlayabilecektir.
 * protected access : Aynı pakette bulunan sınıflar bu değişenlere ve methodlara erişim sağlayabilecektir.
 * 1- "package access" den farkı kalıtım yolu ile diğer paketlerden de erişim sağlanabilir (nesne ile değil)
 * 2- Çağırılan sınıftan bir nesne ile protected access seviyesine sahip değişken veya method çağırılabilir (Kalıtım yolu ile).
 * public access    : Bu access level'e sahip değişken veya method'a herhngi bir paketten erişilebilir.
 *
 *                                              private     package     protected       public
 *                                              -------     -------     ---------       ------
 * the same class                                Yes         Yes         Yes             Yes
 * another class in the same package             No          Yes         Yes             Yes
 * a subclass in a different package             No          No          Yes             Yes
 * an unrelated class in a different package     No          No          No              Yes
 *
 */
