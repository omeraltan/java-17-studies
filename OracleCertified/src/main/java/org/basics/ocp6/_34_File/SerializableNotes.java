package org.basics.ocp6._34_File;

import java.io.*;

class Laptop implements Serializable {
    int price;
    transient String brand;
}

public class SerializableNotes {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Laptop laptop = new Laptop();
        laptop.price = 10000;
        laptop.brand = "Apple";

        FileOutputStream fos = new FileOutputStream("laptop.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(laptop);
        oos.close();

        FileInputStream fis = new FileInputStream("laptop.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Laptop laptopFound = (Laptop) ois.readObject();
        System.out.println(laptopFound.price);
        System.out.println(laptopFound.brand);

    }

}

/**
 *
 *
 *
 */
