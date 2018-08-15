package top.linhuarui.thinking_in_java.chapter3.section3_1.section3_1_8;

/**
* @author LHR
* @date 2018/8/9
* @desc Test of unsigned right shift.
* @version 1.0
*/
public class URShift {

    public static void main (String[] args) {
        int i = -1;
        i >>>= 10;
        System.out.println(i);
        long l = -1;
        l >>>= 10;
        System.out.println(l);
        short s = -1;
        s >>>= 10;
        System.out.println(s);
        byte b = -1;
        b >>>= 10;
        System.out.println(b);
    }
}
