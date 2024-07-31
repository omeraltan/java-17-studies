package org.basics.ocp8._14_Locale;

import java.util.ListResourceBundle;

public class Message_en extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {{"key1", "Hello Welcome"}, {"key2", "Good Bye!!!"}};
    }

}
