package top.linhuarui.thinking_in_java.chapter5.section1.s3;

/**
* @author LHR
* @date 2018/8/22
* @desc Turning off the assertion output
 * so you can ship the program.
* @version 1.0
* @modify
*   @date
*/
public class Assert {
    public final static void is_true (boolean exp) {}
    public final static void is_false (boolean exp) {}
    public final static void is_true (boolean exp, String msg) {}
    public final static void is_false (boolean exp, String msg) {}
}
