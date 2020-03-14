package org.m.g.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Compare2ArrayList {

    public static void main(String[] args) {

        List<Integer> value1 = Arrays.asList(1,3,4,2,5);

        List<Integer> value2 = Arrays.asList(1,2,3,4,5);

        // Way : 1
        HashSet<Integer> set1 = new HashSet<>(value1);
        HashSet<Integer> set2 = new HashSet<>(value2);
        System.out.println("Way 1: "+set1.equals(set2));

        // Way : 2
        Collections.sort(value1);
        Collections.sort(value2);
        System.out.println("Way 2: "+value1.equals(value2));

        System.out.println("Way 3: "+value1.containsAll(value2));

    }

}
