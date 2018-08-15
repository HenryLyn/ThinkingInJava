package top.linhuarui.thinking_in_java.chapter3.section3_2.s3_2_7;

import static top.linhuarui.thinking_in_java.utils.Util.prt;

/**
* @author LHR
* @date 2018/8/15
* @desc What happens when you cast a float or double to an integral value?
* @version 1.0
* @modify
*   @date
*/
public class CastingNumbers {

    public static void main (String[] args) {
        double
            above = 0.7,
            below = 0.4;
        prt("above: " + above);
        prt("below: " + below);
        prt("(int)above: " + (int)above);
        prt("(int)below: " + (int)below);
        prt("(char)('a' + above): " + (char)('a' + above));
        prt("(char)('a' + below): " + (char)('a' + below));
    }

}
