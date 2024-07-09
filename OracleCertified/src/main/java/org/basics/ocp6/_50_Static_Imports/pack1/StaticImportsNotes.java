package org.basics.ocp6._50_Static_Imports.pack1;

class Constants{

    public static final String NOTES = "Notes";
    public static final Integer ZERO = 0;

}

public class StaticImportsNotes {


    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Constants.NOTES);
        System.out.println(Constants.ZERO);
    }

}

/**
 *
 *
 * static keyword ünün kullanım alanları :
 * 1 - static variable
 * 2 - static method
 * 3 - static initialize block
 * 4 - static nested class
 * 5 - static import
 *
 */
