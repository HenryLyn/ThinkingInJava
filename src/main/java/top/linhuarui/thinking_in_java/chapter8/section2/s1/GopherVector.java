package top.linhuarui.thinking_in_java.chapter8.section2.s1;

import java.util.Vector;

/**
* @author LHR
* @date 2018/8/27
* @desc A type-conscious Vector
* @version 1.0
* @modify
*   @date
*/
public class GopherVector {
    private Vector v = new Vector();

    public void addElement (Gopher m) {
        v.addElement(m);
    }

    public Gopher elementAt (int index) {
        return (Gopher) v.elementAt(index);
    }

    public int size () {
        return v.size();
    }

    public static void main (String[] args) {
        GopherVector gophers = new GopherVector();
        for (int i = 0; i < 3; i++) {
            gophers.addElement(new Gopher(i));
        }
        for (int i = 0; i < gophers.size(); i++) {
            GopherTrap.caughtYa(gophers.elementAt(i));
        }
    }
}

class Gopher {
    private int gopherNumber;
    Gopher (int i) {
        gopherNumber = i;
    }

    void print (String msg) {
        if (msg != null) {
            System.out.println(msg);
        }
        System.out.println("Gopher number " + gopherNumber);
    }
}

class GopherTrap {
    static void caughtYa (Gopher g) {
        g.print("Caught One");
    }
}