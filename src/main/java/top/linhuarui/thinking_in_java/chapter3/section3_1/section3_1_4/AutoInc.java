package top.linhuarui.thinking_in_java.chapter3.section3_1.section3_1_4;

/**
* @author LHR
* @date 2018/8/9
* @desc Demonstrates the ++ and -- operators.
* @version 1.0 
*/
public class AutoInc {
    
    public static void main (String[] args) {
        int i = 1;
        prt("i : " + i);
        prt("++i : " + ++i);
        prt("i++ : " + i++);
        prt("i :" + i);
        prt("--i : " + --i);
        prt("i-- : " + i--);
        prt("i : " + i);
        // personal added.
        int c = i++;
        prt("c = i++ : " + c);
        prt("i : " + i);
    }

    static void prt(String s) {
        System.out.println(s);
    }
}
