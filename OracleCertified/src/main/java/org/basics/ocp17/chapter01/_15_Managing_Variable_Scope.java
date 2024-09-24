package org.basics.ocp17.chapter01;

public class _15_Managing_Variable_Scope {

    // 1.
    public void eat(int piecesOfCheese){
        int bitesOfCheese = 1;
    }

    // 2.
    public void eatIfHungry(boolean hungry){
        if(hungry){
            int bitesOfCheese = 1;
        }
        // System.out.println(bitesOfCheese);      -> DOES NOT COMPILE
    }

    // 3.
    public void scopeStuations(String value){
        int localVariable = 10;
        if(value != null){
            // int localVariable = 10;      -> DOES NOT COMPILE
            int size = 10;
        }
        // System.out.println(size);        -> DOES NOT COMPILE
        int size = 30;

        System.out.println(size);

    }
}

/**
 *
 * 1. Değişkenlerin yaşam alanı yukarıdaki örnekte sadece method un scope kadardır.
 * 2. Local değişkenin tanımlanmış olduğu scope methodun scope'undan daha geniş olamaz ama daha küçük olabilir.
 * 3. Bir method içinde tanımlanan değişkenlere erişim bulundukları sıraya göre değişiklik göstermektedir.
 * 4. Local Variables   : Tanımlanmış olduğu block sonlanana kada scope'u geçerlidir.
 * 5. Method Parameters : Method boyunca scope içerisinde olacaktır.
 * 6. Instance Variables: Nesne Garbage Collection tarafından temizlenene kadar scope içerisindedir.
 * 7. Class Variables   : static değişkenler yani class variabless program sonlanana kadar scope içerisinde olacaktır.
 *
 */
