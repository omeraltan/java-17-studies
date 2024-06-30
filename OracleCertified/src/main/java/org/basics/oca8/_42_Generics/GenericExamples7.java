package org.basics.oca8._42_Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

interface SuperCar{

}

class Car implements SuperCar{

}

class Mercedes extends Car{

}

class Amg extends Mercedes{

}

class BMW extends Mercedes{

}

public class GenericExamples7 {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<Car>();
        addElementGenericRule(cars);

        List<Mercedes> mercedesList = new ArrayList<Mercedes>();
        List<BMW> bmwList = new ArrayList<BMW>();
        List<Amg> amgList = new ArrayList<Amg>();
        List<Object> objectList = new ArrayList<>();
        addElementWildCard(mercedesList);
        addElementWildCard(bmwList);
        addElementWildCard(cars);
        System.out.println("-----------------");
        addElementWildCardSuper(cars);
        addElementWildCardSuper(mercedesList);
        addElementWildCardSuper(objectList);
        // addElementWildCardSuper(amgList); compiler error
        // addElementWildCardSuper(bmwList); compiler error

        // mercedesList.add(new Car()); Car IS-A Mercedes değildir. Mercedes IS-A Car dır.


    }

    public static void addElementGenericRule(List<Car> cars){

    }

    // "?" wildcard ı ile extends kullanıldığında burada eleman eklemeye izin vermez!
    public static void addElementWildCard(List<? extends SuperCar> cars){

        // cars.add(new Mercedes()); -> Herhangi bir veri eklemenize izin vermez.
        // cars.add(new BMW());      -> Herhangi bir veri eklemenize izin vermez.
        cars.add(null); //           -> Sadece "null" değerler eklemenize izin verilir.
    }

    // "?" wildcard ı ile "super" kullanıldığında Mercedes yada super tipi olması gereklidir.
    public static void addElementWildCardSuper(List<? super Mercedes> mercedes){
        // Burada kural eklemeler yapılırken ilgili sınıfın ve alt sınıfın nesneleri eklenebilir.
        mercedes.add(null);
        mercedes.add(new Mercedes());
        mercedes.add(new Amg());

    }

}
