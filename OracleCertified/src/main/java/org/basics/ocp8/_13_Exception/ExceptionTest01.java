package org.basics.ocp8._13_Exception;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ExceptionTest01 {

    public static void main(String[] args) {

        try {
            testMethod();
        }catch (FileNotFoundException | SQLException e){
            e.printStackTrace();
        }

    }

    public static void testMethod() throws FileNotFoundException, SQLException{

    }

}

/**
 *
 * catch(Exception1 e | Exception2 e | Exception3 e)    -> DOES NOT COMPILE
 * catch(Exception1 e1 | Exception2 e2 | Exception3 e3) -> DOES NOT COMPILE
 * catch(Exception1 | Exception2 | Exception3 e)        -> COMPILE
 * Multi-Catch bloğunda, aralarında IS-A ilişkisi olan exception tiplerini kullanamayız. Legal değildir.
 * try{
 *
 * }catch(FileNotFoundException | IOException e){}      -> DOES NOT COMPILE (FileNotFoundException IS-A IOException)
 *
 *
 */
