package org.basics.ocp17.chapter03;

public class _09_Adding_Optional_Labels {

    public static void main(String[] args) {
        breakExample1();
        System.out.println("------------");
        breakLabelExample1();
        System.out.println("------------");
        breakExample2();
        System.out.println("------------");
        breakLabelExample2();
        System.out.println("------------");
        continueExample();
        System.out.println("------------");
        continueLabelExample();
        System.out.println("------------");
        continueExample2();
        System.out.println("------------");
        continueLabelExample2();

    }

    public static void breakExample1(){
        for (int i = 0; i < 100; i++){
            System.out.println(i);
            if(i == 10){
                break;
            }
        }
    }

    public static void breakLabelExample1(){
        LOOP:
        for (int i = 0; i < 100; i++){
            System.out.println(i);
            if(i == 10){
                break LOOP;
            }
        }
    }

    public static void breakExample2(){
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.println(i + "," + j);
                if(i == 2){
                    break;
                }
            }
            System.out.println();
        }
    }

    public static void breakLabelExample2(){
        OUTER:
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.println(i + "," + j);
                if(i == 2){
                    break OUTER;
                }
            }
            System.out.println();
        }
    }

    // Bu method da sayılar çift olduğunda yani sayı iki ile bölündüğünde kalan sıfır olduğunda
    // döngü o aşamadaki loop için sonlandırılır.
    // Bir sonraki loop a geçer.
    public static void continueExample(){
        for (int i = 0; i < 20; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void continueLabelExample(){
        LABEL:
        for (int i = 0; i < 20; i++){
            if(i % 2 == 0){
                continue LABEL;
            }
            System.out.println(i);
        }
    }

    public static void continueExample2(){
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i == 2){
                    continue;
                }
                System.out.println(i + " , " + j);
            }
            System.out.println("line1");
            System.out.println("line2");

            System.out.println();
        }
    }

    public static void continueLabelExample2(){
        OUTER:
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i == 2){
                    continue OUTER;
                }
                System.out.println(i + " , " + j);
            }
            System.out.println("line1");
            System.out.println("line2");
            System.out.println();
        }
    }

}

/**
 *
 * 1. Label'lar opsiyoneldir. Tanımladığımız noktada iki nokta üst üste ekleyerek deklarasyonu yapılmaktadır.
 * 2. "break" veya "continue" anahtar kelimesiyle kullanılabilirler.
 * 3. Label'lardaki isimlerndirmeler SNAKE_CASE yapısı kullanılarak yapılır. (Örnek : OUTER_LOOP, INNER_LOOP)
 * 4. Break: break anahtar kelimesi kendisini çevreleyen döngüyü kıracaktır.
 * 5. Break statement'ına opsiyonel olarak label eklenebilir (etiket).
 * 6. Continue: continue anahtar kelimesi mevcut loop iterasyonunu sonlandırır ve bir sonraki iterasyona geçmesini sağlar.
 * 7. syntax olarak "break"'e benzer ancak sonuç olarak farklı çalışacaktır.
 * 8. "break" ve "continue" ifadeleri en içerdeki loop a etki ederler. Label kullanıldığında bu durum değişmektedir.
 * 9.
 *
 */
