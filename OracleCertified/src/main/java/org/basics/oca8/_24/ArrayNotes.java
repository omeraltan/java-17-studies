package org.basics.oca8._24;

public class ArrayNotes {

    int [] array;       // Önerilen yaklaşımda [] değişken isminden önce olmalıdır.
    int badArray[];     // Derleme hatası vermez fakat önerilmez.

    // int [15] compileErrorArray; // legal değildir.

    public static void main(String[] args) {
        int [][] myArray = new int[3][];
        // 2 -D array tanımladık.
        // elemanları -> int[]
        // elemanları int[] olduğu için -> "null" atanır
        int[] oneDimension = new int[3];
        // elemanlar -> int tipindedir.
        // elemanları int olduğu için otomatik olarak 0 atanır

        int[][] twoDimension = new int[3][];
        twoDimension[0] = new int[2];
        twoDimension[0][0] = 6;
        twoDimension[0][1] = 7;
        twoDimension[1] = new int[3];
        twoDimension[1][0] = 8;
        twoDimension[1][1] = 9;
        twoDimension[1][2] = 10;
        twoDimension[2] = new int[4];
        twoDimension[2][0] = 12;
        twoDimension[2][1] = 13;
        twoDimension[2][2] = 14;
        twoDimension[2][3] = 15;
        for(int [] a : twoDimension){
            for(int b : a){
                System.out.print(b + " ");
            }
        }
    }

}

/**
 *
 * Javada array tipindeki değişkenler referans tiptir.
 * int[] -> reference type bir değişkendir.
 * decleration kısmında arrayin boyutunu veremeyiz legal değildir.
 * array in elemanları primitive yada reference type olabilir.
 * bir array in initialize default değerleri vardır. Örneğin: int -> 0, double -> 0.0, String -> null
 *
 *
 */
