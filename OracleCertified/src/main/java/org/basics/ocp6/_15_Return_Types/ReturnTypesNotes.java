package org.basics.ocp6._15_Return_Types;

import java.util.ArrayList;
import java.util.List;

class Computer{

}

class Laptop extends Computer{

}

class Store{
    public Computer buyComputer(){
        return new Computer();
    }
}

class EStore extends Store{

    // override methodlarda dönüş tipi sub-class olabilir.
    // covariant return type adı verilir.
    @Override
    public Computer buyComputer(){
        return new Laptop();
    }
}

public class ReturnTypesNotes {

    public static void main(String[] args) {
        char a = 'a';
        System.out.println(a);
        System.out.println((int) a);
    }

    // rule - 1
    public String getKey(){
        return null;
    }

    // rule - 1 and rule - 2
    public int[] getValues(){
        return null;
    }

    // rule - 3
    public int foo(){
        char c = 'c';
        return c;
    }

    // rule - 4
    public int foo2(){
        float f = 3.14f;
        return (int)f;
    }

    public int foo3(){
        long l = 10;
        return (int)l;
    }

    // rule - 5
    public void bar(){
        //return "this is it";
    }

    public void bar2(int number){
        if(number == 10){
            return;
        }
        //
        //
        //
    }

    // rule - 6
    public List<String> getList(){
        ArrayList<String> list = new ArrayList<>();
        return list;
    }

}

/**
 *
 * covariant return type
 * override methodlarda dönüş tipi değişmez.
 * fakat covariant return type olabilir.
 * 1 - bir methodun dönüş tipi referans type ise null dönebilir.
 * 2 - dönüş tipi array olabilir.
 * 3 - char 16 bit unsigned bir veri tipidir. unsigned -> işaretsiz -> negatif değil. 2^16-1 : 65535
 * 4 - float gibi veri tiplerinin dönüş türü int yapılabilir. Bunun için cast işlemi yapılması gerekir.
 * 5 - method dönüş tipi "void" ise geriye bir şey döndüremezsiniz.
 * 6 - method dönüş tipi süper class veya interface ise döndüğümüz değer / reference subclass olabilir.
 */
