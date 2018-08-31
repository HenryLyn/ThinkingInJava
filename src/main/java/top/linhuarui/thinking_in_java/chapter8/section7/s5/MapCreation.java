package top.linhuarui.thinking_in_java.chapter8.section7.s5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

/**
* @author LHR
* @date 2018/8/31
* @desc Demonstrates time differences in Map creation
* @version 1.0
* @modify
*   @date
*/
public class MapCreation {
    public static void main (String[] args) {
        final long REPS = 100000;

        System.out.print("Hashtable");
        long t1 = System.currentTimeMillis();
        for (long i = 0; i < REPS; i++) {
            new Hashtable<>();
        }
        long t2 = System.currentTimeMillis();
        System.out.println(": " + (t2 - t1));

        System.out.print("TreeMap");
        t1 = System.currentTimeMillis();
        for (long i = 0; i < REPS; i++) {
            new TreeMap<>();
        }
        t2 = System.currentTimeMillis();
        System.out.println(": " + (t2 - t1));

        System.out.print("HashMap");
        for (long i = 0; i < REPS; i++) {
            new HashMap<>();
        }
        t2 = System.currentTimeMillis();
        System.out.println(": " + (t2 - t1));
    }
}
