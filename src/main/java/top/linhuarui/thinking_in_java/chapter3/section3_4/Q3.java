package top.linhuarui.thinking_in_java.chapter3.section3_4;

/**
* @author LHR
* @date 2018/8/15
* @desc practice switch with break or not.
* @version 1.0
* @modify
*   @date
*/
public class Q3 {
    public static void main (String[] args) {
        System.out.println("Practice with break in every case statement.");
        for (int i = 0; i < 3; i ++) {
            switch (i) {
                case 0:
                    System.out.println("i = 0");
                    break;
                case 1:
                    System.out.println("i = 1");
                    break;
                case 2:
                    System.out.println("i = 2");
                    break;
                default:
                    break;
            }
        }
        System.out.println("Practice without break in every case statement.");
        for (int i = 0; i < 3; i ++) {
            switch (i) {
                case 0:
                    System.out.println("i = 0");
                case 1:
                    System.out.println("i = 1");
                case 2:
                    System.out.println("i = 2");
                default:
            }
        }

    }
}
