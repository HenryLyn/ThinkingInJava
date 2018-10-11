package top.linhuarui.thinking_in_java.chapter8.section8;

import java.util.Enumeration;
import java.util.Vector;

/**
* @author LHR
* @date 10/11/18
* @desc 修改练习1，用Enumeration 在调用 hop()的同时遍历 Vector。
* @version 1.0
* @modify
*   @date
*/
public class E2 {
    public static void main (String[] args) {
        Vector<Gerbil2> vector = new Vector<>();
        // populate gerbil
        for (int i = 1; i <= 10; i++) {
            vector.add(new Gerbil2(i));
        }

        // traverse vector
        Enumeration e = vector.elements();
        while (e.hasMoreElements()) {
            ((Gerbil2) e.nextElement()).hop();
        }
    }
}

class Gerbil2 {

    int gerbilNumber;

    Gerbil2 (int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop () {
        System.out.println("Gerbil number " + gerbilNumber);
    }
}