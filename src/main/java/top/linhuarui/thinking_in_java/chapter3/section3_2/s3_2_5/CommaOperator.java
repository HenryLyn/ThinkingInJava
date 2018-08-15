package top.linhuarui.thinking_in_java.chapter3.section3_2.s3_2_5;

/**
* @author LHR
* @date 2018/8/15
* @desc Comma operator practice.
* @version 1.0 
* @modify 
*   @date 
*/
public class CommaOperator {
    public static void main (String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
