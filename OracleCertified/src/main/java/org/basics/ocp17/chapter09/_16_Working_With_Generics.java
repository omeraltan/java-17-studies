package org.basics.ocp17.chapter09;

import java.util.ArrayList;
import java.util.List;

public class _16_Working_With_Generics {

    public static void main(String[] args) {



    }

    // type erasure olduğu için iki methodun da parametresi aynı olarak kabul edilir.
    // Bundan dolayı compile time hatası alır. Overloaded method olmazlar. Aynı method olurlar.
    protected void chew(List<Object> input){}
    // protected void chew(List<Double> input){}   // DOES NOT COMPILE



}

// Bu class 'ı önceki derste kullandığımız type parameter'lı Crate class'ı olarak düşünebiliriz.
// Günün sonunda bütün type parameter'lar Object'e dönüşüyor.
class Crate2 {

    private Object contents;

    public Object lookInCrate(){
        return contents;
    }

    public void packCrate(Object contents){
        this.contents = contents;
    }

}

class LongTailAnimal{
    protected void chew(List<Object> input){}
}

class Anteater extends LongTailAnimal{

    // protected void chew(List<Double> input){}   // DOES NOT COMPILE (Sadece generic tipin değiştirilmesi override edilebileceği anlamına gelmez.)

    protected void chew(List<Object> input){}       // Bu halde override method olur.

    protected void chew(ArrayList<Double> input){}  // Bu halde overloaded method olur.

}


class Mammal {
    public List<CharSequence> play(){return new ArrayList<>();}
    public CharSequence sleep(){return "";}
}

class Monkey extends Mammal {
    public ArrayList<CharSequence> play(){return  new ArrayList<>();}       // ArrayList List 'in sub class'ı olduğu için burada play() methodu override edilebilir.
    // Burada kritik nokta super class'ta generic tipi CharSequence ise alt class'ta da override edilen methodun generic tipi CharSequence olmak zorundadır.
}

class Goat extends Mammal {
    // public List<String> play(){return new ArrayList<>();}   // DOES NOT COMPILE (Generic type farklı olduğu için hata verir.)
    public String sleep(){return "";}       // Burada String CharSequence'in covariant tipi olduğu için sorun olmayacaktır.
}



/**
 *
 * --------------- Understanding Type Erasure ---------------
 * Generic type kullandığımızda compiler uygun bir type kullanmamız için bizi zorlar.
 * Örnek olarak List<String> yaptığımızda bu listeye Integer tipinde bir obje ekleyemeyiz. Sadece String objesi ekleyebiliriz.
 * Aslında arka planda bu tip bilgisi compiler tarafından kaldırılır, bütün type parameter'lar object tipine dönüşür.
 * Kod arka tarafta generic syntax'ından arındırılır. Buna "type erasure" adı verilir.
 * Generic yapısı bize "compile time" 'da koruma sağlar. Bu sayede derleme zamanında generic tanımından farklı bir tipte eleman eklememize izin vermez.
 *
 * --------------- Overloading A Generic Method -------------
 * İki method overloaded yapmak için sadece generic ifadenin değişmesi yeterli olmaz.
 * Bir methodu override etmek için sadece generic ifadenin değiştirilmesi yeterli olmaz.
 *
 * --------------- Returning Generic Types ------------------
 * genericler kendi arasında covariant olmaz. Yani sub class'ı kulanamayız. Generic type parametresi tam olarak eşleşmelidir.
 * Aynı tipte olmalıdır. Yoksa derleme hatası verecektir.
 *
 *
 */
