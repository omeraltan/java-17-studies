package org.basics.ocp17.chapter09;

import java.util.ArrayList;
import java.util.List;

public class _23_Working_With_Generics {

    public static void main(String[] args) {

        List<?> list1 = new ArrayList<A>();             // legal
        List<? extends A> list2 = new ArrayList<A>();   // legal
        List<? super A> list3 = new ArrayList<A>();     // legal

        List<? extends A> list4 = new ArrayList<B>();   // legal
        List<? extends A> list5 = new ArrayList<C>();   // legal

        List<? super C> list6 = new ArrayList<B>();     // legal
        List<? super C> list7 = new ArrayList<A>();     // legal

        // list1.add(new A());      // DOES NOT COMPILE
        // list2.add(new A());      // DOES NOT COMPILE

        // list3.add(new Object()); // DOES NOT COMPILE
        list3.add(new A());
        list3.add(new B());
        list3.add(new C());

        // List<? extends B> list8 = new ArrayList<A>();   // DOES NOT COMPILE
        List<? super B> list9 = new ArrayList<A>();         // A, B or Object olabilir.
        // List<?> list10 = new ArrayList<? extends A>();  // DOES NOT COMPILE (Bu şekilde bir kulanım geçerli değildir. Bounded ifadeleri sol tarafta kullanılabilir.)

        list2.add(null);
        list4.add(null);
        // list4.add(new B());  // DOES NOT COMPILE
        // list4.add(new C());  // DOES NOT COMPILE
        

    }

}

class A {}
class B extends A {}
class C extends B {}

/**
 *
 * -------------------- PuttingIt All Together --------------------
 *
 *
 */
