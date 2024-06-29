package org.basics.oca8._42;

class GenericClass<T>{

    // T, Type parameter
    private T ref;

    public GenericClass(T ref) {
        this.ref = ref;
    }

    public T getRef() {
        return ref;
    }

    public void setRef(T ref) {
        this.ref = ref;
    }

}

class GenericClassV2<K,V>{

    // instance değişken
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}


public class TypeNotes {

    public static void main(String[] args) {

        GenericClass<Integer> obj1 = new GenericClass<>(2000);
        GenericClass<String> obj2 = new GenericClass<>("key");

        System.out.println(obj1.getRef());
        System.out.println(obj2.getRef());

        GenericClassV2<String, Boolean> obj3 = new GenericClassV2<>();

    }

}
