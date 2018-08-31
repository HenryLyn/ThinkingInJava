package top.linhuarui.thinking_in_java.chapter8.section7.s8;

import java.util.*;

/**
* @author LHR
* @date 2018/8/31
* @desc Using the Collections.synchronized methods
* @version 1.0
* @modify
*   @date
*/
public class Synchronization {
    public static void main (String[] args) {
        Collection c = Collections.synchronizedCollection(new ArrayList());
        List list = Collections.synchronizedList(new ArrayList());
        Set s = Collections.synchronizedSet(new HashSet());
        Map m = Collections.synchronizedMap(new HashMap());
    }
}
