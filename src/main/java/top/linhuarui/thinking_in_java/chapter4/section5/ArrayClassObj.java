package top.linhuarui.thinking_in_java.chapter4.section5;

import java.util.Random;

/**
* @author LHR
* @date 2018/8/21
* @desc Creating an array of non-primitive objects.
* @version 1.0
* @modify
*   @date
*/
public class ArrayClassObj {
    static Random rand = new Random();
    static int pRand (int mod) {
        return Math.abs(rand.nextInt()) % mod + 1;
    }
    public static void main (String[] args) {
        Integer[] a = new Integer[pRand(20)];
        System.out.println("length of a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = new Integer(pRand(500));
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
