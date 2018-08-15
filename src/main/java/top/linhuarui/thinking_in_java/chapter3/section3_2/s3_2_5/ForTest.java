package top.linhuarui.thinking_in_java.chapter3.section3_2.s3_2_5;

/**
* @author LHR
* @date 2018/8/15
* @desc Demonstrates "for" loop by listing all the ASCII characters.
* @version 1.0
* @modify
*   @date
*/
public class ForTest {
    public static void main (String[] args) {
        for (char c = 0; c < 128; c++) {
            System.out.println(
                    "value: " + (int) c
                    + " character: " + c
            );
        }
    }
}
