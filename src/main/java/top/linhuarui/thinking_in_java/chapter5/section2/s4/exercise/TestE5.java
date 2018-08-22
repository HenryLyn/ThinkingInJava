package top.linhuarui.thinking_in_java.chapter5.section2.s4.exercise;

/**
* @author LHR
* @date 2018/8/22
* @desc Test E5
* @version 1.0
* @modify
*   @date
*/
public class TestE5 {

    public static void main (String[] args) {
        E5 e5 = new E5();
        System.out.println(e5.strDefault); // package access
        System.out.println(e5.strProtected); // package access and extends access.
        //! System.out.println(e5.strPrivate); // class inside access

        e5.mDefault(); // package access
        e5.mProtected(); // package access and extends access.
        //! e5.mPrivate(); // class inside access
    }
}
