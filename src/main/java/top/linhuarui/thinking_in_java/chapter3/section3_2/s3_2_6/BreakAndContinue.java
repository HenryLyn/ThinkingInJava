package top.linhuarui.thinking_in_java.chapter3.section3_2.s3_2_6;

/**
* @author LHR
* @date 2018/8/15
* @desc Demonstrates break and continue.
* @version 1.0
* @modify
*   @date
*/
public class BreakAndContinue {
    public static void main (String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) {
                break; // out of for loop
            }
            if (i % 9 != 0) {
                continue; // next iteration
            }
            System.out.println(i);
        }
        int i = 0;
        // An "infinite loop":
        while (true) {
            i++;
            int j = i * 27;
            if (i == 1269) {
                break; // out of loop
            }
            if (i % 10 == 0) {
                continue; // Top of loop
            }
            System.out.println(i);
        }
    }
}
