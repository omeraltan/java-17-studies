package org.basics.ocp6._39_Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample3 {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(-10);
        hashSet.add(-20);
        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(100);
        hashSet.add(50);
        System.out.println(hashSet);
        // [50, -20, 20, 100, -10, 10] -> Elemanlar eklendiği sırada değiller. unordered bir özelliğe sahiptir.

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(-10);
        linkedHashSet.add(-20);
        linkedHashSet.add(20);
        linkedHashSet.add(10);
        linkedHashSet.add(100);
        linkedHashSet.add(50);
        System.out.println(linkedHashSet);
        // [-10, -20, 20, 10, 100, 50] -> Elemanlar eklendiği sıradadır. elemanlar eklediğimiz sırada tutulur.

    }

}
