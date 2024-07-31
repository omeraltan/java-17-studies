package org.basics.ocp8._13_Exception;

class Auto implements AutoCloseable {

    int num;
    Auto(int num) {
        this.num = num;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close: " + num);
    }

    public static void main(String[] args) {
        try(Auto a1 = new Auto(1); Auto a2 = new Auto(2)){
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        }finally {
            System.out.println("finally");
        }
    }
}

public class ExceptionTest07 {

    /**
     *
     * try içerisindeki "a1" ve "a2"'nin kapatılma sırası tam tersi şekildedir.
     * Ilk önce "a2" kapatılır daha sonra "a1" kapatılır.
     * Bu yüzden output şu şekilde olacaktır :
     * Close: 2
     * Close: 1
     * ex
     * finally
     *
     */

}
