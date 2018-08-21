package top.linhuarui.thinking_in_java.utils;

import java.util.Random;

/**
* @author LHR
* @date 2018/8/15
* @desc utils in thinking in java.
* @version 1.0
* @modify
*   @date
*/
public class Util {
    public static void prt(String s) {
        System.out.println(s);
    }

    public static int randInt (int mod) {
        return Math.abs(new Random().nextInt()) % mod + 1;
    }
}
