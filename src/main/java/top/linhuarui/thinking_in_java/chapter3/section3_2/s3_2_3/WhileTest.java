package top.linhuarui.thinking_in_java.chapter3.section3_2.s3_2_3;

/**
* @author LHR
* @date 2018/8/15
* @desc Demonstrates the while loop
* @version 1.0
* @modify
*   @date
*/
public class WhileTest {
    public static void main (String[] args) {
        double r = 0;
        while (r < 0.99d) {
            r = Math.random();
            System.out.println(r);
        }
    }
}
