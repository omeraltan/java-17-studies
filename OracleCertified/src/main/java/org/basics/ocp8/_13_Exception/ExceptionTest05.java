package org.basics.ocp8._13_Exception;

class Computer implements AutoCloseable{


    @Override
    public void close() {
        // override methodlarda,  yeni bir checked exception ekleyemeyiz.
        // yada var olan checked exceptionın levelini artıramayız.
    }
}

public class ExceptionTest05 {

    public static void main(String[] args) {

        try(Computer computer = new Computer()){

        }

    }

}

/**
 *
 * "AutoCloseable" Interface'inin Kullanımı :
 * Kaynak Yönetimi: AutoCloseable arayüzünü uygulayan bir sınıf, close() metodunu implement ederek
 * kaynakları düzgün bir şekilde serbest bırakabilir.
 * Otomatik Kapatma: "try-with-resources" yapısını kullanarak, bir nesne oluşturduğunuzda,
 * bu nesne çıkış noktasına ulaşıldığında (örneğin bir hata oluştuğunda veya blok tamamlandığında) otomatik olarak kapatılır.
 * Bu, kaynak sızıntılarını önlemeye yardımcı olur.
 *
 */
