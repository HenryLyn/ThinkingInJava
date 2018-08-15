package top.linhuarui.thinking_in_java.chapter3.section3_4;

/**
* @author LHR
* @date 2018/8/15
* @desc modify Q1 break when i = 47;
* @version 1.0 
* @modify 
*   @date 
*/
public class Q2 {
    public static void main (String[] args) {
        for (int i = 1; i <= 100; i ++) {
            System.out.println(i);
            if (i == 47) {
                break;
            }
        }
    }
}
