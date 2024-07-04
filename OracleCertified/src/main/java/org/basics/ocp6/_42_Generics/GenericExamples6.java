package org.basics.ocp6._42_Generics;


import java.util.ArrayList;
import java.util.List;

class Bird{

}

class Sparrow extends Bird{

}

class Crow extends Bird{

}

public class GenericExamples6 {

    public static void main(String[] args) {

        List<Bird> birdList = new ArrayList<Bird>();

        addElement(birdList);

        List<Sparrow> sparrowList = new ArrayList<Sparrow>();

        // addElement(sparrowList); compile error, legal değildir.

        Sparrow[] sparrows = new Sparrow[3];
        addElementArray(sparrows); // java.lang.ArrayStoreException
        // Crow IS-A Sparrow değildir. Bu nedenle runtime da exception a neden olur.

    }

    public static void addElement(List<Bird> birdList) {

        birdList.add(new Sparrow());
        birdList.add(new Crow());
        birdList.add(new Bird());
    }

    public static void addElementArray(Bird[] birds){
        birds[0] = new Crow();
    }

}
