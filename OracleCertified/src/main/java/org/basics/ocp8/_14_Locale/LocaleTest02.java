package org.basics.ocp8._14_Locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleTest02 {

    public static void main(String[] args) {

        ResourceBundle rb = ResourceBundle.getBundle("org.basics.ocp8._14_Locale.Message", new Locale("en","US"));
        System.out.println(rb.getString("key1"));
        System.out.println(rb.getString("key2"));

        System.out.println("-----");

        ResourceBundle rb2 = ResourceBundle.getBundle("org.basics.ocp8._14_Locale.Message", new Locale("tr","TR"));
        System.out.println(rb2.getString("key1"));
        System.out.println(rb2.getString("key2"));

    }

}
