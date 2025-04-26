package org.basics.ocp17.chapter06;

import java.io.FileNotFoundException;
import java.io.IOException;

public class _07_Inheriting_Members {

    public static void main(String[] args) {



    }

}

class Camel{
    public int getNumberOfHumps(){
        return 1;
    }
}

class BactrianCamel extends Camel{
    // private int getNumberOfHumps(){return 2;} // -> DOES NOT COMPILE
}

class Reptile{
    protected void sleep() throws IOException{}
    protected void hide(){}
    protected void exitShell() throws FileNotFoundException{}
}

class GalapagosTortoise extends Reptile{
    public void sleep() throws FileNotFoundException{}
    // public void hide() throws FileNotFoundException{}    // DOES NOT COMPILE
    // public void exitShell() throws IOException{}         // DOES NOT COMPILE
}

class Rhino{
    protected  CharSequence getName(){
        return "rhino";
    }
    protected String getColor(){
        return "grey, black, or white";
    }
}

class JavaRhino extends Rhino{
    public String getName(){
        return "Javan rhino";
    }
    // public CharSequence getColor(){return "grey";}  // DOES NOT COMPILE
}

/**
 *
 * Bir methodun override edilebilmesi için:
 * 1- Child sınıfta yer alan method, parent sınıfta yer alan method ile aynı signature a sahip olmalıdır.
 * 2- İsmi ve parametreleri aynı olmak zorundadır. Parametreler farklı olursa overloaded method olurlar.
 * 3- Child sınıfta yer alan methodun erişim seviyesi en az parent sınıftaki method kadar olmalıdır.
 * 4- Child sınıfta yer alan method yeni veya daha geniş bir checked exception uygulayamaz. Ancak unchecked exception ekleyebilir.
 * 5- Eğer method geriye bir değer dönüyorsa bu durumda override ettiğimiz methodda aynı tipte veya subtype tipinde olmalıdır. Buna covariant return type adı verilir.
 * Method Signatures : Eğer iki method aynı isme sahip fakat farklı signature a sahipse bu durumda methodlar override değil overloaded olacaktır.
 * private methodlar kalıtılamazlar yani child class tarafından override edilemezler. Ancak alt sınıfta aynı yapıda yeni bir method oluşturabilirsiniz.
 * static methodlar override edilemezler hidden durumda olabilirler. Hidden durum static parent ve child classlar arasındaki methodlar için, aynı method signature ına sahip methodlar arasında ortaya çıkacaktır.
 * Java değişkenlerin override edilmesine izin vermez. Sadece hidden durumda olabilirler. Hidden variable durumu parent ve child class larda aynı isimde variable olduğunda ortaya çıkacaktır.
 * final methodlar override edilemezler.
 *
 */
