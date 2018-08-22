package top.linhuarui.thinking_in_java.utils;

import java.util.Random;

/**
* @author LHR
* @date 2018/8/15
* @desc utils in thinking in java.
* @version 1.0
* @modify
*   @date 2018/08/21 add new method for get random int value
*/
public class Util {
    
    /**
    * @author LHR
    * @date 2018/8/21
    * @desc print string
    * @params [s]
    * @returns void
    * @version 1.0
    * @modify 
    *   @date 
    */
    @Deprecated 
    public static void prt(String s) {
        System.out.println(s);
    }

    /**
    * @author LHR
    * @date 2018/8/21
    * @desc get random int value.
    * @params [mod]
    * @returns int
    * @version 1.0
    * @modify
    *   @date
    */
    public static int randInt (int mod) {
        return Math.abs(new Random().nextInt()) % mod + 1;
    }
}
