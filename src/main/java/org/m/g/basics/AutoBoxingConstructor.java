package org.m.g.basics;


import java.util.ArrayList;

/**
 * Java 1.5 introduced a special feature of auto conversion of primitive types to the corresponding Wrapper class and vice versa.
 *
 * Autoboxing:
 * ===========
 * Automatic conversion of primitive types to the object of their
 * corresponding wrapper classes is known as autoboxing.
 *
 * For example – conversion of int to Integer, long to Long,
 * double to Double etc.
 *
 * Unboxing:
 * =========
 * It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding
 * primitive type is known as unboxing.
 *
 * For example – conversion of Integer to int, Long to long, Double to double etc.
 */

public class AutoBoxingConstructor {

    public static void main(String[] args) {

        //Autoboxing - int primitive to Integer
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(11);

        //What happens behind the scenes?
        // valueOf Method is called internally
        Integer number = 100;
        Integer number2 = Integer.valueOf(100);


        //unboxing object to primitive conversion
        Integer inum = new Integer(5);
        int num = inum;

        //What happens behind the scenes?
        // intValue Method is called internally
        int inumVal = inum.intValue();
    }

}
