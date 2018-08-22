package top.linhuarui.thinking_in_java.utils.debug;

/**
* @author LHR
* @date 2018/8/22
* @desc Assertion tool for debugging
* @version 1.0
* @modify
*   @date
*/
public class Assert {
    private static void perr (String msg) {
        System.out.println(msg);
    }

    public final static void is_true (boolean exp) {
        if (!exp) {
            perr("Assertion failed");
        }
    }

    public final static void is_false (boolean exp) {
        if (exp) {
            System.out.println("Assertion failed");
        }
    }

    public final static void is_true (boolean exp, String msg) {
        if (!exp) {
            perr("Assertion failed: " + msg);
        }
    }

    public final static void is_false (boolean exp, String msg) {
        if (exp) {
            perr("Assertion failed: " + msg);
        }
    }
}
