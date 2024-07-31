package org.basics.ocp8._13_Exception;

class Laptop implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Shut down...");
        throw new IllegalStateException("Shut down exception"); // 2.exception (supressed)
    }
}

public class ExceptionTest06 {

    public static void main(String[] args) {

        try (Laptop laptop = new Laptop()){
            System.out.println("Opening laptop...");
            int number = 1 / 0;                         // 1.exception
        }catch (Exception e){
            System.out.println("catch block");
            System.out.println(e.getMessage());
            for (Throwable t : e.getSuppressed()){
                System.out.println(t.getMessage());
            }
        }

    }

}

/**
 *
// * Java'da "suppressed exception" (baskılan istisna), bir veya daha fazla istisna nesnesinin,
 * başka bir istisna nesnesinin yanında tutulduğu ve bu durumun hata yönetimi sırasında daha iyi bir bilgi sağladığı bir durumdur.
 * Genellikle, bir "try-with-resources" bloğunda veya bir close() metodunda, bir kaynak kapatılırken bir istisna fırlatıldığında bu istisna,
 * daha önce fırlatılmış olan bir istisnanın yanında tutulur.
 *
 */
