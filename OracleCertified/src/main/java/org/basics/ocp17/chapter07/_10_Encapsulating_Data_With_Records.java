package org.basics.ocp17.chapter07;

import java.util.ArrayList;
import java.util.List;

public class _10_Encapsulating_Data_With_Records {

    public static void main(String[] args) {

        List<String> emails = new ArrayList<>();
        emails.add("email1@injavawetrust.com");
        emails.add("email2@injavawetrust.com");

        Employee employee = new Employee("emp-name", emails);
        System.out.println(employee);
        emails.clear();

        System.out.println(employee);

        System.out.println("---------------");

        List<String> emails4 = new ArrayList<>();
        emails4.add("email1@injavawetrust.com");
        emails4.add("email2@injavawetrust.com");

        Employee4 employee4 = new Employee4("emp-name", emails);
        System.out.println(employee4);
        emails.clear();

        System.out.println(employee4);

    }

}

record Employee(String name, List<String> emails){

    // private Employee{}   // -> Compact constructor access level cannot be more restrictive than the record access level ('package-private')

    Employee{
        emails = new ArrayList<>(emails);
    }

//    public Employee(String name, List<String> emails){
//        this.name = name;
//        this.emails = emails;
//    }
}

record Employee4(String name, List<String> emails){

    public Employee4{
        emails = new ArrayList<>(emails);
        name = name.concat(" suffix");
        name = name.concat(" more suffix");
        System.out.println("compact-constructor");
    }

    void method(){
        System.out.println("method-1");
    }

    void method2(){
        System.out.println("static-method-1");
    }

}


/**
 *
 * compact constructor ve canonical contructor birlikte tanımlanamazlar.
 * Eğer "record" public ise compact constructor'da public olmak zorundadır.
 * Eğer "record" public ise canonical constructor'da public olmak zorundadır (access seviyesini düşüremeyiz.).
 * Record'lar class access level'inden daha geniş bir access level'e sahip olabilir.
 *
 */
