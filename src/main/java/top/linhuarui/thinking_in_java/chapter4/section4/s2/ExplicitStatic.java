package top.linhuarui.thinking_in_java.chapter4.section4.s2;

/**
* @author LHR
* @date 2018/8/21
* @desc Explicit static initialization with the "static" clause.
* @version 1.0
* @modify
*   @date
*/
public class ExplicitStatic {
    public static void main (String[] args) {
        System.out.println("Inside main()");
        Cups.c1.f(99);
    }

    static Cups x = new Cups();
    static Cups y = new Cups();
}

class Cup {
    Cup (int marker) {
        System.out.println("Cup (" + marker + ")");
    }

    void f (int marker) {
        System.out.println("f (" + marker + ")");
    }
}

class Cups {
    static Cup c1;
    static Cup c2;
    static {
        c1 = new Cup(1);
        c2 = new Cup(2);
    }

    Cups () {
        System.out.println("Cups()");
    }
}
