package org.basics.ocp6._43_Inner_Class;

// singleton design pattern
public class BillPughSingleton {

    private BillPughSingleton() {

    }

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
