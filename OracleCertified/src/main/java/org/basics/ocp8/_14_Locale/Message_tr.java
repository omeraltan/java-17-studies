package org.basics.ocp8._14_Locale;

import java.util.ListResourceBundle;

public class Message_tr extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {{"key1", "Merhaba, Hoşgeldiniz!"}, {"key2", "Hoşçakalın!!!"}};
    }

}
