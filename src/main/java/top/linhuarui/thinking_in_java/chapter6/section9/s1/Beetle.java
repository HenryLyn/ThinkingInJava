package top.linhuarui.thinking_in_java.chapter6.section9.s1;

/**
* @author LHR
* @date 2018/8/23
* @desc The full process of initialization.
* @version 1.0
* @modify
*   @date
*/
public class Beetle extends Insect{

    int k = prt("Beetle.k initialized");

    Beetle () {
        prt("k = " + k);
        prt("j = " + j);
    }

    static int x2 = prt("Beetle.x2 initialized");

    static int prt (String s) {
        System.out.println(s);
        return 63;
    }

    public static void main (String[] args) {
        prt("Beetle constructor");
        Beetle b = new Beetle();
    }

}

class Insect {
    int i = 9;
    int j;

    Insect () {
        prt("i = " + i + ", j = " + j);
        j = 39;
    }

    static int x1 = prt("static Insect.x1 initialized");

    static int prt (String s) {
        System.out.println(s);
        return 47;
    }
}