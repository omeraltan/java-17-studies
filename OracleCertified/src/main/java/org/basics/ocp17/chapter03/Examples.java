package org.basics.ocp17.chapter03;
/**
 *
 * Which statements, when inserted independently into the following blank, will cause the code to print 2 at runtime?
 * (Choose all that apply.)
 *
 * A. break BUNNY       -> 1
 * B. break RABBIT      -> 2
 * C. continue BUNNY    -> 2
 * D. continue RABBIT   -> 2
 * E. break             -> 2
 * F. continue          -> 5
 * G. None of the above, as the code contains a compiler error.
 *
 */
public class Examples {

    public static void main(String[] args) {
        int count = 0;
        BUNNY: for (int row = 1; row <= 3; row++) {
            RABBIT: for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0)
                    break BUNNY;
                    count++;
            }
        }
        System.out.println(count);
    }

}


