package org.basics.ocp17.chapter03;

public class _06_The_Do_While_Statement {

    public static void main(String[] args) {
        int lizard = 0;
        do {
            lizard++;
        }while (false);
            System.out.println(lizard); // 1
    }

}

/**
 *
 * 1. While döngüsünün aksine "do-while" döngüsü en az bir kez çalışmayı garanti eder.
 * 2. Do-While döngüsünde kontrol sonda yapılır.
 * 3. Break abahtar kelimesi while veya do-while döngülerinde kullanılabilir. Dmgüyü kırmak için kullanılır.
 *
 */
