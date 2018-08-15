package top.linhuarui.thinking_in_java.chapter3.section3_2.s3_2_4;

/**
* @author LHR
* @date 2018/8/15
* @desc Demonstrates the do-while loop
* @version 1.0
* @modify
*   @date
*/
public class DoWhileTest {
    public static void main (String[] args) {
        int i = 0;
        do {
            i--;
            System.out.println(i);
        } while (i > 0);
    }
}
