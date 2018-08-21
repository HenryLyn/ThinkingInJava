package top.linhuarui.thinking_in_java.chapter4.section5;

/**
* @author LHR
* @date 2018/8/21
* @desc Array initialization
* @version 1.0
* @modify
*   @date
*/
public class ArrayInit {
    public static void main (String[] args) {
        Integer[] a = {
                new Integer(1),
                new Integer(2),
                new Integer(3)
        };

        // after java 1.1
        Integer[] b = new Integer[] {
                new Integer(1),
                new Integer(2),
                new Integer(3)
        };

    }

}
