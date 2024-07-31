package org.basics.ocp8._14_Locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleTest01 {

    public static void main(String[] args) {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages",new Locale("tr","TR"));
        String message = resourceBundle.getString("message");
        System.out.println(message);

        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("messages",new Locale("en","US"));
        String message2 = resourceBundle2.getString("message");
        System.out.println(message2);

        ResourceBundle resourceBundle3 = ResourceBundle.getBundle("texts.resource",new Locale("tr", "TR"));
        String message3 = resourceBundle3.getString("property.key");
        System.out.println(message3);
    }

}
