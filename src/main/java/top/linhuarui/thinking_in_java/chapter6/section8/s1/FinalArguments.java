package top.linhuarui.thinking_in_java.chapter6.section8.s1;

/**
* @author LHR
* @date 2018/8/23
* @desc Using "final" with method arguments
* @version 1.0
* @modify
*   @date
*/
public class FinalArguments {

    void with (final Gizmo g) {
        //! g = new Gizmo(); // Illegal -- g is final
        g.spin();
    }

    void without (Gizmo g) {
        g = new Gizmo(); // OK -- g not final
        g.spin();
    }

    // void f (final int i) {
    //     i++; // Can't change
    // }

    // You can only read from a final primitive:
    int g (final int i) {
        return i;
    }

    public static void main (String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        //! bf.with(null); // throw a java.lang.NullPointerException
        bf.with(new Gizmo());
    }
}

class Gizmo {
    public void spin () {}
}