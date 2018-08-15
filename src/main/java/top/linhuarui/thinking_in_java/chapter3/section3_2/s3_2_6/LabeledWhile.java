package top.linhuarui.thinking_in_java.chapter3.section3_2.s3_2_6;

import static top.linhuarui.thinking_in_java.utils.Util.prt;

/**
* @author LHR
* @date 2018/8/15
* @desc Java's "labeled while" loop
* @version 1.0
* @modify
*   @date
*/
public class LabeledWhile {
    public static void main (String[] args) {
        int i = 0;
        outer:
        while (true) {
            prt("Outer while loop");
            while (true) {
                i++;
                prt("i = " + i);
                if (i == 1) {
                    prt("continue");
                    continue ;
                }
                if (i == 3) {
                    prt("continue outer");
                    continue outer;
                }
                if (i == 5) {
                    prt("break");
                    break ;
                }
                if (i == 7) {
                    prt("break outer");
                    break outer;
                }
            }
        }
    }
}
