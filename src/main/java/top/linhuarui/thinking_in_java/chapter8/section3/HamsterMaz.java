package top.linhuarui.thinking_in_java.chapter8.section3;

import java.util.Enumeration;
import java.util.Vector;

/**
* @author LHR
* @date 2018/8/27
* @desc Using an Enumeration
* @version 1.0
* @modify
*   @date
*/
public class HamsterMaz {
    public static void main (String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 3; i++) {
            v.addElement(new Hamster(i));
        }
        Printer.printAll(v.elements());
    }
}

class Hamster {
    private int hamsterNumber;

    Hamster (int i) {
        hamsterNumber = i;
    }

    @Override
    public String toString() {
        return "This is Hamster #" + hamsterNumber;
    }
}

class Printer {
    static void printAll (Enumeration e) {
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement().toString());
        }
    }
}