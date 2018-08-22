package top.linhuarui.thinking_in_java.chapter6.section3.s2;

/**
* @author LHR
* @date 2018/8/22
* @desc Overloading a base-class method name
 * in a derived class does not hide the
 * base-class versions
* @version 1.0
* @modify
*   @date
*/
public class Hide {
    public static void main (String[] args) {
        Bart b = new Bart();
        b.doh(1); // doh(float) used.
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}

class Homer {
    char doh (char c) {
        System.out.println("doh(char)");
        return 'd';
    }

    float doh (float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
}

class Milhouse {}

class Bart extends Homer {
    void doh (Milhouse m) {}
}
