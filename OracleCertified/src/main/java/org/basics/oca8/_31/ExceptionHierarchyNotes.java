package org.basics.oca8._31;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHierarchyNotes {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("dosta.txt");
        // Bir method / constructor ı çağırdığımızda ve bu method / constructor bir checked exception
        // fırlatma riski taşıdığında (throws ifadesi barındırdığında) bu durumda compiler bize
        // derleme hatası verir.
        // platform bize bunun için seçenek sunar (handle or declare rule)
        // handle  -> try - catch
        // declare -> throws
        // bu kural sadece checked exception lar için geçerlidir.
        // bir kere throws ettiğimizde, artık try-catch arasına almamız gerekmez.

        FileReader fr = null;
        try{
            fr = new FileReader("dosta.txt");
            fr.read();
        }catch (FileNotFoundException e){

        }catch (ArithmeticException e1){
            // FileNotFoundException yada IOException aralarında hiyerarşi yoktur.
            // ArithmeticException IS - A Exception olduğundan önce yer almalıdır.
        }catch (IOException e2){

        }catch (Exception e3){

        }finally {
            fr.close();
        }
     }
}

/**
 *
 *                                          Object
 *
 *                                          Throwable (Checked Exception)
 *
 *                                Error                     Exception (Checked Exception)
 *
 *                                                 Checked Exceptions               Runtime Exception
 *
 * javada primitive tipler hariç herşey nesnedir. Exceptionlar da nesnedir.
 * java.lang.Exception    -   java.lang.Error    -    java.langRuntimeException
 *
 * Error ları yakalamak gibi bir derdimiz yoktur.
 * Errorlar ve RuntimeExceptionlar unchecked tipindedir.
 * diğer sınıflar ise (Exception) RuntimeException ını kalıtmayan exceptionlardır,  Throwable is checked tipindedir.
 * throws keyword method / constructor deklarasyonunda/ifadesinde/tanımlanmasında kullanılabilir.
 * throws -> ben bir x hatasını fırlatabilirim. Kesin fırlatılacak diye bir şey yoktur.
 * birden fazla catch bloğu olduğunda aralarında hiyerarşik bir bağlantı olduğunda bu durumda alt sınıf / subclass önce yer almalıdır.
 *
 */
