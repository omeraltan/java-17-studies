package org.basics.ocp17.chapter08;

public class _04_Using_Method_References {

    private static MyClass myClassStaticVariable = new MyClass();
    private MyClass myClassInstanceVariable = new MyClass();

    public static void main(String[] args) {

        var str = "Zoo";
        StringStart methodRef = str::startsWith;;
        StringStart lambda = s -> str.startsWith(s);

        System.out.println(methodRef.beginningCheck("Z"));
        System.out.println(lambda.beginningCheck("A"));

        System.out.println("--------------------");

        var str2 = "";
        StringChecker methodRef2 = str2::isEmpty;
        StringChecker lambda2 = () -> str2.isEmpty();

        System.out.println(methodRef2.check());
        System.out.println(lambda2.check());

        exampleMethodForStringStart();

        System.out.println("--------------------");

        exampleMethodForStringStart2();

        System.out.println("--------------------");

        exampleMethodForStringChecker();
    }

    private static void exampleMethodForStringStart(){
        System.out.println("----- Example method For String Start -----");

        StringStart start = MyClass::staticMethod;
        StringStart start2 = new MyClass()::instanceMethod;
        MyClass myClassRef = new MyClass();
        // static method referenced through non-static qualifier
        // StringStart start3 = myClassRef::staticMethod;  // DOES NOT COMPILE
        StringStart start4 = ss -> myClassRef.instanceMethod(ss);
        StringStart start5 = ss -> MyClass.staticMethod(ss);


        System.out.println(start.beginningCheck("MyClass"));
        System.out.println(start2.beginningCheck("MyClass"));
        System.out.println(start4.beginningCheck("MyClass"));
        System.out.println(start5.beginningCheck("MyClass"));
    }

    private static void exampleMethodForStringStart2(){
        System.out.println("----- Example method For String Start-2 -----");

        StringStart start = myClassStaticVariable::instanceMethod; // Sınıfın static değişkenleri üzerinden de isntance methodları kullanabiliriz.
        // StringStart start2 = myClassInstanceVariable::staticMethod; // -> DOES NOT COMPILE static değişken ile static methoda erişemeyiz.
        // Static method referenced through non-static qualifier
        // StringStart start3 = myClassStaticVariable::staticMethod; // -> DOES NOT COMPILSE static değişken üzerinden bir static method çağırılamaz.
        // Sınıf üzerinden static method çağırılabilir.
        System.out.println(start.beginningCheck("A"));

    }

    private static void exampleMethodForStringChecker(){
        System.out.println("----- Example method For String Checker -----");

        var str = "";
        StringChecker methodRef = str::isEmpty;
        StringChecker lambda = () -> str.isEmpty();

        System.out.println(methodRef.check());
        System.out.println(lambda.check());
    }

}

@FunctionalInterface
interface StringStart{
    boolean beginningCheck(String prefix);
}

@FunctionalInterface
interface StringChecker{
    boolean check();
}

class MyClass{

    private String test;

    public MyClass() {
    }

    public MyClass(String test) {
        this.test = test;
    }

    boolean instanceMethod(String str){
        return str.startsWith("My");
    }

    static boolean staticMethod(String str){
        return str.startsWith("My");
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}

/**
 *
 * Calling Instance Methods on a Particular Object (Belirli bir objenin instance methodunu çağırmak)
 * static methodlar instance lar üzerinden çağırılamazlar. Sınıf üzerinden çağırılabilirler.
 * static bir değişken üzerinden instance method çağırılabilir.
 * static methodlar static değişkenler üzerinden çağırılamazlar. Sınıf ismi üzerinden çağırılabilirler.
 * Referans değişken üzerinden static bir method çağırılamaz.
 *
 */
