package top.linhuarui.thinking_in_java.chapter3.section3_1.section3_1_5;

/**
* @author LHR
* @date 2018/8/9
* @desc equivalence practice with Integer object.
* @version 1.0 
*/
public class Equivalence {

    public static void main (String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
    }
}
