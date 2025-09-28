package org.basics.ocp17.chapter09;

import java.util.List;

public class _24_Working_With_Generics {

    public static void main(String[] args) {

        var reference = new _24_Working_With_Generics();

        List<String> strings = List.of("e1", "e2");
        List<Integer> integers = List.of(10,20);

        System.out.println(reference.first(strings));
        System.out.println(reference.first(integers));

    }

    <T> T first(List<? extends T> list) {
        return list.get(0);
    }

    /* DOES NOT COMPILE (Dönüş tipi belirtilmediği için derlenmez.)
    <T> <? extends T> second(List<? extends T> list){
        return list.get(0);
    }
     */

    /* DOES NOT COMPILE (class ismi ile aynı isimde type parametresi tanımlanmaya çalışıldığı için hata verir.)
    <B extends A> B third (List<B> list){
        return new B(); //
    }
    */

    // type parametresi dönüş tipi aynı isimde olmadıkları için hata vermez.
    <T extends A> B thirdV2(List<B> list){
        return new B();
    }

    /* DOES NOT COMPILE (sol taraftaki type parametresinde soru işareti geçerli değildir.)
    sol tarafta bir type parametresi belirlenirken sağ tarafta bir bound belirlenmektedir
    <? extends A> B thirdV3(List<? extends A> list){
        return new B();
    }
    */

    // BU deklarasyonda herhangi bir sorun yoktur. Buraya geçirilebilecek parametreler -> List<B1>, List<A1>, List<Object>
    void fourth(List<? super B1> list){

    }

    B1 thirdV4(List<? extends B1> list){
        return list.get(0);
    }

    <T> T thirdV5(List<T> list){
        return list.get(0);
    }

    <T extends A> T thirdV6(List<T> list){
        return list.get(0);
    }

    /* DOES NOT COMPILE
    <T super A> T thirdV7(List<T> list){
        return list.get(0);
    }
    */

    void fourthV1(List<? super B> list){

    }

    <T> void fourthV2(List<? super T> list){

    }

    <T extends B> void fourthV3(List<? super T> list){

    }

    <T extends A> void fourthV4(List<? super A> list){

    }

    <T extends A> void fourthV5(List<? extends T> list){

    }

    /* DOES NOT COMPILE (burada type parametresinde ? olması gerekmektedir.)
    <X> void fifth(List<X super B> list){

    }
    */

    <X> void fifth2(List<? super B> list){

    }




}

class A1 {}
class B1 extends A1 {}
class C1 extends B1 {}


class TestBound {
    public static void main(String[] args) {
        SuperBound superBound = new SuperBound();
        ChildBound childBound = new ChildBound();
        GoodChildBound goodChildBound = new GoodChildBound();

        // type(superBound);       // DOES NOT COMPIULE
        // type(childBound);       // DOES NOT COMPILE
        type(goodChildBound);

        type2(superBound);
        type2(childBound);
        type2(goodChildBound);

    }

    public static <T extends SuperBound & MyInterface> T type(T t) { return t; }
    public static <T extends SuperBound> T type2(T t) { return t; }
}

interface MyInterface {

}

class SuperBound {

}

class ChildBound extends SuperBound {

}

class GoodChildBound extends ChildBound implements MyInterface {

}

/**
 *
 * -------------------- Passing Generic Arguments --------------------
 * Method parametrelerinde ?, extends, super anahtar kelimelerinin kullanılması sonucu oluşan sonuçlara örnekler ile bakalım.
 *
 */
