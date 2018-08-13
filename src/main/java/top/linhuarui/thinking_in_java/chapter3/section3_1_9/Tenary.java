package top.linhuarui.thinking_in_java.chapter3.section3_1_9;

/**
* @author LHR
* @date 2018/8/13
* @desc ternary operator
* @version 1.0
* @modify
*   @date
*/
public class Tenary {
    public static void main (String[] args) {
        System.out.println(ternary(1));
        System.out.println(alternative(1));
    }

    public static int ternary (int i) {
        return i > 10 ? i * 10 : i * 100;
    }

    public static int alternative (int i) {
        if (i > 10) {
            return i * 10;
        } else {
            return i * 100;
        }
    }
}
