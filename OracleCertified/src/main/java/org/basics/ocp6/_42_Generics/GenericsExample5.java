package org.basics.ocp6._42_Generics;

class Hayvan{

}

class Kopek extends Hayvan{

}

class Kedi extends Hayvan{

}


public class GenericsExample5 {

    public static void main(String[] args) {

        Hayvan hayvanKopek = new Kopek();
        // List<Hayvan> hayvanList = new ArrayList<Kopek>(); // Compiler error
        // Kopek IS-A Hayvan
        // ArrayList IS-A List olsa da bu şekilde kullanmak legal değildir. compiler error

        Hayvan[] hayvanKopekArray = new Kopek[5];
        hayvanKopekArray[0] = new Kopek();
        hayvanKopekArray[1] = new Kedi();
        // Kedi IS-A Kopek olmadığı için runtime da exception alırız.

    }

}


