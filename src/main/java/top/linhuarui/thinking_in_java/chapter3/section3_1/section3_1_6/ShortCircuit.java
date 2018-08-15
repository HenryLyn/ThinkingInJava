package top.linhuarui.thinking_in_java.chapter3.section3_1.section3_1_6;

public class ShortCircuit {

    public static void main (String[] args) {
        if (test1(0) && test2(2) && test3(2)) {
            System.out.println("expression is true");
        } else {
            System.out.println("expression is false");
        }
    }

    static boolean test1 (int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }

    static boolean test2 (int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("result: " + (val < 2));
        return val < 2;
    }

    static boolean test3 (int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("result: " + (val < 3));
        return val < 3;
    }
}
