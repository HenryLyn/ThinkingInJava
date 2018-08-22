package top.linhuarui.thinking_in_java.chapter5.section2.s4.cookie2;

/**
* @author LHR
* @date 2018/8/22
* @desc protected access permission.
* @version 1.0 
* @modify 
*   @date 
*/
public class Cookie {
    public Cookie () {
        System.out.println("Cookie constructor");
    }

    protected void bite () {
        System.out.println("bite");
    }
}
