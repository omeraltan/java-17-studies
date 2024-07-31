package org.basics.ocp8._13_Exception;

import java.sql.SQLException;

public class ExceptionTest02 {

    public static void main(String[] args) {

        try{

        }catch (Exception e){

        }
        // catch bloğunda bir checked exception'ın yer alması için
        // try bloğunda ilgili hatanın fırlatılması yada riski yer alması gerekmektedir.
        try{
            testMethod();           // Eğer burada testMethod(); olmasa catch'de SQLException kısmı hata verir.
        }catch (SQLException e){

        }

    }

    public static void testMethod() throws SQLException {

    }

}
