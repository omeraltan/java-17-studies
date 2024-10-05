package org.basics.ocp17.chapter03;

public class _08_Nested_Loops {

    public static void main(String[] args) {
        nestedLoop1();
        System.out.println("------");
        nestedLoop2();
    }

    public static void nestedLoop1(){
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};

        for(int[] mySimpleArray : myComplexArray){
            for (int i = 0; i < mySimpleArray.length; i++){
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }

    public static void nestedLoop2(){
        int hungryHippopotamus = 8;
        while (hungryHippopotamus > 0){
            do {
                hungryHippopotamus -=2;
            }while (hungryHippopotamus > 5);
            hungryHippopotamus--;
            System.out.print(hungryHippopotamus + ", ");
        }
    }

}

/**
 *
 * 1. İç içe birden fazla döngünün olduğu yapılardır.
 * 2.
 *
 */
