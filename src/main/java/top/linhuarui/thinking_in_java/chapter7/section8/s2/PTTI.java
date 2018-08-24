package top.linhuarui.thinking_in_java.chapter7.section8.s2;

/**
* @author LHR
* @date 2018/8/24
* @desc Downcasting & Run-Time Type Identification (RTTI)
* @version 1.0
* @modify
*   @date
*/
public class PTTI {
    public static void main (String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].g();

        // Compile-time: method not found in Useful:
        //! x[1].u();
        ((MoreUseful) x[1]).u(); // Downcast/TRRI
        ((MoreUseful) x[0]).u(); // Exception throw

    }
}

class Useful {
    public void f () {}
    public void g () {}
}

class MoreUseful extends Useful {

    @Override
    public void f() {}

    @Override
    public void g() {}

    public void u() {}

    public void v() {}

    public void w() {}
}
