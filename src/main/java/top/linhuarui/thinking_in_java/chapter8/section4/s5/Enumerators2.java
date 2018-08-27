package top.linhuarui.thinking_in_java.chapter8.section4.s5;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
* @author LHR
* @date 2018/8/27
* @desc Revising Enumerations
* @version 1.0
* @modify
*   @date
*/
public class Enumerators2 {
    public static void main (String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 5; i++) {
            v.addElement(new Mouse(i));
        }

        Hashtable h = new Hashtable();
        for (int i = 0; i < 5; i++) {
            h.put(new Integer(i), new Hamster(i));
        }
        System.out.println("Vector");
        PrintData.print(v.elements());
        System.out.println("Hashtable");
        PrintData.print(h.elements());
    }
}

class PrintData {
    static void print (Enumeration e) {
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement().toString());
        }
    }
}

class Mouse {
    private int mouseNumber;

    Mouse (int i) {
        mouseNumber = i;
    }

    // Magic method:

    @Override
    public String toString() {
        return "This is Mouse #" + mouseNumber;
    }

    void print (String msg) {
        if (msg != null) {
            System.out.println(msg);
        }
        System.out.println("Mouse number " + mouseNumber);
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
