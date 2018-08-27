package top.linhuarui.thinking_in_java.chapter8.section4.s4;

import java.util.Hashtable;

/**
* @author LHR
* @date 2018/8/27
* @desc Simple demonstration of Hashtable.
* @version 1.0
* @modify
*   @date
*/
public class Statistics {
    public static void main (String[] args) {
        Hashtable ht = new Hashtable();
        for (int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            Integer r = new Integer((int) ((Math.random()) * 20));
            if (ht.containsKey(r)) {
                ((Counter) ht.get(r)).i++;
            } else {
                ht.put(r, new Counter());
            }
        }
        System.out.println(ht);
    }
}

class Counter {
    int i = 1;

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
