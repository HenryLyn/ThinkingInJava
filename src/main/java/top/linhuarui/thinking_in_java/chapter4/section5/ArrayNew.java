package top.linhuarui.thinking_in_java.chapter4.section5;

import java.util.Random;

/**
* @author LHR
* @date 2018/8/21
* @desc Creating arrays with new.
* @version 1.0
* @modify
*   @date
*/
public class ArrayNew {

    static Random random = new Random();
    static int pRand (int mod) {
        return Math.abs(random.nextInt()) % mod + 1;
    }

    public static void main (String[] args) {
        int[] a;
        a = new int[pRand(20)];
        System.out.println("length of a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }

}
