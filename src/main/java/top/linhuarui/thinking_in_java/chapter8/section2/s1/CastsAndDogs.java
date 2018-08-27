package top.linhuarui.thinking_in_java.chapter8.section2.s1;

import java.util.Vector;

/**
* @author LHR
* @date 2018/8/27
* @desc Simple collection exception (Vector)
* @version 1.0
* @modify
*   @date
*/
public class CastsAndDogs {
    public static void main (String[] args) {
        Vector cats = new Vector();
        for (int i = 0; i < 7; i++) {
            cats.addElement(new Cat(i));
            // Not a problem to add a dog to cats;
        }
        cats.addElement(new Dog(7));
        for (int i = 0; i < cats.size(); i++) {
            ((Cat)cats.elementAt(i)).print();
            // Dog is detected only at run-time;
        }
    }
}

class Cat {
    private int catNumber;

    Cat (int i) {
        catNumber = i;
    }

    void print () {
        System.out.println("Cat #" + catNumber);
    }
}

class Dog {
    private int dogNumber;

    Dog (int i) {
        dogNumber = i;
    }

    void print () {
        System.out.println("Dog #" + dogNumber);
    }
}
