package top.linhuarui.thinking_in_java.chapter3.section3_1.section3_1_16;

/**
* @author LHR
* @date 2018/8/13
* @desc overflow practice
* @version 1.0
* @modify
*   @date
*/
public class Overflow {
    public static void main (String[] args) {
        int big = 0x7fffffff; // max int value
        prt("big = " + big);
        int bigger = big * 4;
        prt("bigger = " + bigger);
    }

    private static void prt(String s) {
        System.out.println(s);
    }

}
