package top.linhuarui.thinking_in_java.chapter5.section2;

import top.linhuarui.thinking_in_java.chapter5.section2.dessert.Cookie;

/**
* @author LHR
* @date 2018/8/22
* @desc Uses the library.
* @version 1.0
* @modify
*   @date
*/
public class Dinner {
    public Dinner () {
        System.out.println("Dinner constructor");
    }

    public static void main (String[] args) {
        Cookie x = new Cookie();
        //! x.foo(); // Can't access
    }
}
