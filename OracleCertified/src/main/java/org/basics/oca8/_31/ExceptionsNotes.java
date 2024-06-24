package org.basics.oca8._31;

public class ExceptionsNotes {

    public static void main(String[] args) {
        int number = 100;
        // System.out.println(number / 0); // program crash olur!
        // System.out.println("not work!");

        try {
            System.out.println(number / 0);
            System.out.println("not work");
        }catch (ArithmeticException e){
            // fırlatılan hatanın ya kendisi ya da super tipi olmalıdır.
            // yoksa catch bloğuna düşmez.
            System.out.println("exception caught!");
        }

        // try bloğunda bir exception ortaya çıktığında,  catch bloğunda yakalanırsa program çalışmaya devam eder. // crach olmaz.

        try {
            System.out.println(number / 0);
            System.out.println("not work2");
        }catch (RuntimeException e){ // ArithmeticException IS A RuntimeException
            System.out.println("exception caught2!");
        }
    }

}

/**
 *
 * exception handling (istisna yönetimi)
 * try, catch, finally, throw, throws şeklinde keywordler yer almaktadır.
 * exception -> java.lang.Exception
 * error     -> java.lang.Error
 *
 * try-catch
 * genel format :
 *  try{
 *
 *  }catch(Exception1 ex1){
 *
 *  }catch(Exception2 ex2){
 *
 *  }catch(Exception3 ex3){
 *
 *  }
 *
 * Javada Exceptionlar Class'dır.
 * java.lang ArithmeticException
 * java.lang.RuntimeException
 * java.lang.Exception
 * java.langThrowable
 *
 *
 *
 *
 */
