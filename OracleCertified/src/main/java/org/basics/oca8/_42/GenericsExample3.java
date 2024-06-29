package org.basics.oca8._42;

public class GenericsExample3 {

    public static void main(String[] args) {
        Integer[] array1 = {1,2,3,4,5};
        Double[] array2 = {1.1,2.2,3.3,4.4,5.5};
        String[] array3 = {"A","B","C","D"};
        GenericsClassV3.genericStaticMethod(array1);
        GenericsClassV3.genericStaticMethod(array2);
        GenericsClassV3.genericStaticMethod(array3);

    }

}

class GenericsClassV3<T> {

    public void genericMethod(T t){

    }

    public static <T> void genericStaticMethod(T[] array){
        for(T element: array){
            System.out.println(element);
        }
    }

}
