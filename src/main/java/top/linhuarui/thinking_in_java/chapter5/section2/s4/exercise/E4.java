package top.linhuarui.thinking_in_java.chapter5.section2.s4.exercise;

import top.linhuarui.thinking_in_java.chapter5.section2.s4.cookie2.Cookie;

/**
* @author LHR
* @date 2018/8/22
* @desc Show that protected methods have package access but are not public
* @version 1.0 
* @modify 
*   @date 
*/
public class E4 {

    public static void main (String[] args) {
        Cookie cookie = new Cookie();
        //! cookie.bite(); // can't access from other package.
    }

}
