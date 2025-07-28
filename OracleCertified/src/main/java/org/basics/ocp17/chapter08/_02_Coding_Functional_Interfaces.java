package org.basics.ocp17.chapter08;

public class _02_Coding_Functional_Interfaces {

    public static void main(String[] args) {

    }

}

@FunctionalInterface
interface Sprint{
    public void sprint(int speed);
}

class Tiger implements Sprint{

    @Override
    public void sprint(int speed) {
        System.out.println("Animal is sprinting fast! " + speed);
    }
}

@FunctionalInterface
interface Dance{        // DOES NOT COMPILE (İki tane abstract method olduğu için functional interface olmaz ve compile time hatası verir.)
    void move();
    // void rest();
}

// Dash interface'i Sprint'i kalıtmakta ve herhangi bir method tanımlamadığı için "Functional Interface" 'dir. Çünkü Sprint interface'inde bir abstract method vardır.
@FunctionalInterface
interface Dash extends Sprint{}

// Sprint interface'inde zaten bir tane abstract method olduğu için "Functional Interface" değildir.
// @FunctionalInterface
interface Skip extends Sprint{
    void skip();
}

// Sleep interface'i abstract bir method içermediği için "Functional Interface" değildir.
interface Sleep{
    private void snore(){}
    default int getZzz(){ return 1; }
}

// Climb interface'i içerisinde bir tane abstract method olduğu için "Functional Interface" 'dir.
@FunctionalInterface
interface Climb{
    void reach();
    default void fall(){}
    static int getBackUp(){ return  100; }
    private static boolean checkHeight(){ return true; }
}

// toString methodu gözardı edilebildiği için Soar interface'i "Functional Interface" değildir.
interface Soar{
    @Override
    abstract String toString();
}

// toString(), equals(Object o), hashCode() hesaba katılmadığı için Dive interface'ini etkilemezler. Bu yüzden Dive interface'i "Functional Interface" 'dir.
@FunctionalInterface
interface Dive{
    @Override
    String toString();
    @Override
    boolean equals(Object o);
    @Override
    int hashCode();

    void dive();
}

// Hibernate interface'i bir "Functional Interface" değildir çünkü iki tane abstract method mevcuttur.
interface Hibernate{
    String toString();
    boolean equals(Hibernate o);    // 1. abtract method (Hibernate tipinde bir parametre aldığı için)
    int hashCode();
    void rest();                    // 2. abstract method
}

/**
 *
 *      --- Coding Functional Interfaces ---
 * Tek bir abstract method içeren interface'lerdir (sam -> single abstract method).
 * @FunctionalInterface anotasyonunu kullanmak opsiyoneldir (@Override anotasyonu gibi).
 * @FunctionalInterface kullanıldığında, eğer kodumuz bir function interface ise çalışacaktır değilse hata verecektir.
 * Butün class'lar görünmesede java.lang.Object sınıfını kalıtırlar. Dolayısıyla bütün sınıflar public String toString(), public boolean equals(Object) ve public int hashCode() methodlarına sahip olacaktır.
 * Eğer bir functional interface bu methodlara sahipse, bu methodlar functional interface'in tek bir abstract methoda sahip olması kuralına etki etmezler (Yani bu methodlar göz ardı edileblir.).
 *
 *
 */
