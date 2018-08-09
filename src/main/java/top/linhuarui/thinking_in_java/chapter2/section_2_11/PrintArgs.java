package top.linhuarui.thinking_in_java.chapter2.section_2_11;

import java.io.InputStreamReader;

/**
* @author LHR
* @date 2018/8/9
* @desc Print three args receive from console. need run in console.
* @version 1.0
*/
public class PrintArgs {
    
    public static void main (String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        System.out.println("args[]0: " + args[0] + " args[1]: " + args[1] + " args[2]: " + args[2]);
    }
}
