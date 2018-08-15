package top.linhuarui.thinking_in_java.chapter3.section3_2.s3_2_1;

/**
* @author LHR
* @date 2018/8/15
* @desc true or false conditional statement.
* @version 1.0
* @modify
*   @date
*/
public class TrueOrFalse {

    public static void main (String[] args) {
        int a = 0;
        prt("a == 0 ? " + (a == 0));
        prt("a != 0 ? " + (a != 0));
    }

    private static void prt(String s) {
        System.out.println(s);
    }

}
