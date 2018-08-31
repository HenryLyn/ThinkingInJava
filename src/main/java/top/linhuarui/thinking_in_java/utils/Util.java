package top.linhuarui.thinking_in_java.utils;

import top.linhuarui.thinking_in_java.chapter8.section7.s1.Collection1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
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

    /**
     * @author LHR
     * @date 2018/8/31
     * @desc  Producing a Set of the keys:
     * @params [m]
     * @returns void
     * @version 1.0
     * @modify
     *   @date
     */
    public static void printKeys (Map m) {
        System.out.print("Size = " + m.size() + ", ");
        System.out.print("Keys: ");
        Collection1.print(m.keySet());
    }

    /**
     * @author LHR
     * @date 2018/8/31
     * @desc Producing a Collection of the values:
     * @params [m]
     * @returns void
     * @version 1.0
     * @modify
     *   @date
     */
    public static void printValues (Map m) {
        System.out.print("Values: ");
        Collection1.print(m.values());
    }

    /**
     * @author LHR
     * @date 2018/8/31
     * @desc Iterating through Map.Entry objects (pairs):
     * @params [m]
     * @returns void
     * @version 1.0
     * @modify
     *   @date
     */
    public static void print (Map m) {
        Collection entries = m.entrySet();
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("Key = " + e.getKey() + ", Value = " + e.getValue());
        }
    }
}
