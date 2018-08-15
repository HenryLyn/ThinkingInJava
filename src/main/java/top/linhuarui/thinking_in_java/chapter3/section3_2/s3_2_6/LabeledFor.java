package top.linhuarui.thinking_in_java.chapter3.section3_2.s3_2_6;

/**
* @author LHR
* @date 2018/8/15
* @desc Java's "labeled for loop"
* @version 1.0
* @modify
*   @date
*/
public class LabeledFor {

    public static void main (String[] args) {
        int i = 0;
        outer: // Can't have statements here
        for (; true;) {
            inner: // Can't have statements here
            for (; i < 10; i++) {
                prt("i = " + i);
                if (i == 2) {
                    prt("continue");
                    continue ;
                }
                if (i == 3) {
                    prt("break");
                    i++; // Otherwise i never gets incremented.
                    break ;
                }
                if (i == 7) {
                    prt("continue outer");
                    i++; // Otherwise i never gets incremented.
                    continue outer;
                }
                if (i == 8) {
                    prt("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        prt("continue inner");
                        continue inner;
                    }
                }
            }
        }
        // Can't break or continue to labels here.
    }

    private static void prt(String s) {
        System.out.println(s);
    }
}
