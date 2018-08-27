package top.linhuarui.thinking_in_java.chapter8.section4.s4;

import java.util.Hashtable;

/**
* @author LHR
* @date 2018/8/27
* @desc Looks plausible, but doesn't work right.
* @version 1.0
* @modify
*   @date
*/
public class SpringDetector {
    public static void main (String[] args) {
        Hashtable ht = new Hashtable();
        for (int i = 0; i < 10; i++) {
            ht.put(new Groundhog(i), new Prediction());
        }
        System.out.println("ht = " + ht + "\n");
        System.out.println("Looking up prediction for groundhog #3: ");
        Groundhog gh = new Groundhog(3);
        if (ht.containsKey(gh)) {
            System.out.println((Prediction) ht.get(gh));
        }
    }
}

class Groundhog {
    int ghNumber;

    Groundhog (int n) {
        ghNumber = n;
    }
}

class Prediction {
    boolean shadow = Math.random() > 0.5;

    @Override
    public String toString() {
        if (shadow) {
            return "Six more weeks of Winter!";
        } else {
            return "Early Spring";
        }
    }
}