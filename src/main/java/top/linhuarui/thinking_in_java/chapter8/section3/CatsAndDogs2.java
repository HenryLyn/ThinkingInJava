package top.linhuarui.thinking_in_java.chapter8.section3;

import java.util.Enumeration;
import java.util.Vector;

/**
* @author LHR
* @date 2018/8/27
* @desc Simple collection with Enumeration
* @version 1.0
* @modify
*   @date
*/
public class CatsAndDogs2 {
    public static void main (String[] args) {
        Vector cats = new Vector();
        for (int i = 0; i < 7; i++) {
            cats.addElement(new Cat2(i));
        }
        // Not a problem to add a dog to cats
        cats.addElement(new Dog2(7));
        Enumeration e = cats.elements();
        while (e.hasMoreElements()) {
            ((Cat2)e.nextElement()).print();
            // Dog is detected only at run-time
        }
    }
}

class Cat2 {
    private int catNumber;

    Cat2 (int i) {
        catNumber = i;
    }

    void print () {
        System.out.println("Cat #" + catNumber);
    }
}

class Dog2 {
    private int dogNumber;

    Dog2 (int i) {
        dogNumber = i;
    }

    void print () {
        System.out.println("Dog #" + dogNumber);
    }
}