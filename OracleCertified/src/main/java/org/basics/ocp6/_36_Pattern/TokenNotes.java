package org.basics.ocp6._36_Pattern;

public class TokenNotes {

    public static void main(String[] args) {
        getTest1();
        System.out.println("------------");
        getTest2();
        System.out.println("------------");
        getTest3();
        System.out.println("------------");
        getTest4();
    }

    public static void getTest1(){
        String content = "key1,key2,key3,key4";
        String[] tokens = content.split(",");
        for (String token : tokens) {
            System.out.println(token);
        }
    }

    public static void getTest2(){
        String content = "key1,key2:key3;key4,key5";
        String[] tokens = content.split(",");
        for (String token : tokens) {
            System.out.println(token);
        }
    }

    public static void getTest3(){
        String content = "key1,key2:key3;key4,key5";
        String[] tokens = content.split(",|:|;"); // virgül, noktalı virgül, iki nokta üst üste göre split et.
        for (String token : tokens) {
            System.out.println(token);
        }
    }

    public static void getTest4(){
        String content = "key1,key2:key3;key4,key5.key6";
        String[] tokens = content.split(",|:|;|\\."); // virgül, noktalı virgül, iki nokta üst üste ve nokata ya göre split et.
        // nokta için \\. kaçış karakterini kullanmamız gerekmektedir.
        for (String token : tokens) {
            System.out.println(token);
        }
    }

}

/**
 *
 * Token -> simge, sembol
 * Büyük parçaları küçük parçalara böl
 *
 * java.lang.String
 * java.lang.StringTokenizer
 *
 */
