package org.basics.ocp8._03_Interface;

interface Fly {

    public abstract int getWingsPAN() throws Exception;

    public static final int MAX_SPEED = 100;

    public default void land(){
        System.out.println("Animal is landing");
    }

    public default void eat(){
        System.out.println("Animal is eating");
    }

    public static double calculateSpeed(float distance, double time){
        return distance / time;
    }

}

class Eagle implements Fly {

    @Override
    public int getWingsPAN() throws Exception {
        return 15;
    }

    // Default methodları override edebiliriz.
    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }
}


public class InterfaceTest02 {

    public static void main(String[] args) throws Exception {
        Fly flyeagle = new Eagle();
        System.out.println(flyeagle.getWingsPAN());
        flyeagle.land();
        flyeagle.eat();
        // flyeagle.calculateSpeed(10,5); -> compile time error Bu şekilde çalışmaz.
        Fly.calculateSpeed(10,5); // interface te tanımlı static methodları interfaceName.staticMethodName şeklinde çağırabiliriz.
    }

}
