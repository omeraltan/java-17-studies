package org.basics.ocp8._03_Interface;

class BaseClass{

    public void foo(){
        System.out.println("BaseClass.foo");
    }

}

interface BaseInterface{

    default void foo(){
        System.out.println("BaseInterface.foo");
    }
}


public class DiamondProblem2 extends BaseClass implements BaseInterface{

    public static void main(String[] args) {
        new DiamondProblem2().foo();
    }

}

/**
 *
 * Bu durumda java bizim yerimize diamond problemi çözer.
 * Hem interface te hemde concrete class ta "foo();" methodu olduğu için java burada önceliği concrete class a verir.
 * Eğer concrete class extends edilmeseydi öncelik interface indir.
 *
 */
