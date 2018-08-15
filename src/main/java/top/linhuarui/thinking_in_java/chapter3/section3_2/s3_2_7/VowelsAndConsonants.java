package top.linhuarui.thinking_in_java.chapter3.section3_2.s3_2_7;

import static top.linhuarui.thinking_in_java.utils.Util.prt;

/**
* @author LHR
* @date 2018/8/15
* @desc Demonstrates the switch statement.
* @version 1.0
* @modify
*   @date
*/
public class VowelsAndConsonants {

    public static void main (String[] args) {
        for (int i = 0; i < 100; i ++) {
            char c = (char)(Math.random() * 26 + 'a');
            prt(c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    prt("vowel");
                    break;
                case 'y':
                case 'w':
                    prt("Sometimes a vowel");
                    break;
                default:
                    prt("consonant");
            }
        }
    }
}
