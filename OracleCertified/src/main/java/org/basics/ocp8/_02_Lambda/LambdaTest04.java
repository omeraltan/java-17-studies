package org.basics.ocp8._02_Lambda;

interface LambdaFunction{
    String intKind(int a);
}

public class LambdaTest04 {
    public static void main(String[] args) {
        LambdaFunction lambda1 = (int k) -> {
          if (k %2 == 0) {
              return "even";
          }else {
            return "odd";
          }
        };
        System.out.println(lambda1.intKind(25));
        System.out.println(lambda1.intKind(20));
    }
}
