package top.linhuarui.thinking_in_java.chapter4.section2.s1;

/**
* @author LHR
* @date 2018/8/16
* @desc Overloading based on the order of the arguments.
* @version 1.0
* @modify
*   @date
*/
public class OverloadingOrder {
    static void print(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void print(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }

    public static void main (String[] args) {
        print("String first", 11);
        print(99, "Int first");
    }
}
