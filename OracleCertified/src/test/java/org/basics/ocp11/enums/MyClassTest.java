package org.basics.ocp11.enums;

import jdk.jfr.Description;
import org.basics.ocp8.chapter02.enums.MyClass;
import org.junit.Test;



public class MyClassTest {

    @Test
    @Description("Should give me a true day")
    public void test() {
        MyClass.getDayInformation(MyClass.Day.SATURDAY);
    }

}
