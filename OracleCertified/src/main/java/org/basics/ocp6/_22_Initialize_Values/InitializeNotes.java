package org.basics.ocp6._22_Initialize_Values;

import java.util.Arrays;

public class InitializeNotes {

    int intVariable;
    byte byteVariable;
    short shortVariable;
    long longVariable;
    float floatVariable;
    double doubleVariable;
    char charVariable;
    boolean booleanVariable;
    String stringVariable;
    int[] intArrayVariable;

    public static void main(String[] args) {
        InitializeNotes init = new InitializeNotes();
        System.out.println(init);
    }

    @Override
    public String toString() {
        return "InitializeNotes{" +
            "intVariable=" + intVariable +
            ", byteVariable=" + byteVariable +
            ", shortVariable=" + shortVariable +
            ", longVariable=" + longVariable +
            ", floatVariable=" + floatVariable +
            ", doubleVariable=" + doubleVariable +
            ", charVariable=" + charVariable +
            ", booleanVariable=" + booleanVariable +
            ", stringVariable='" + stringVariable + '\'' +
            ", intArrayVariable=" + Arrays.toString(intArrayVariable) +
            '}';
    }
}

/**
 * Default Values for Primitives and Reference Types :
 *
 * Object Reference         -> null
 * byte, short, int, long   -> 0
 * float, double            -> 0.0
 * boolean                  -> false
 * char                     -> '\u0000'
 */
