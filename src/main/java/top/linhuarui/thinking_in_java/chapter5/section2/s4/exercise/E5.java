package top.linhuarui.thinking_in_java.chapter5.section2.s4.exercise;

/**
* @author LHR
* @date 2018/8/22
* @desc  Create a class with public, private, protected, and package-access fields and method members.
 * Create an object of this class and see what kind of compiler messages you get when you try to access all the class members.
 * Be aware that classes in the same directory are part of the “default” package
* @version 1.0
* @modify
*   @date
*/
public class E5 {
    String strDefault = "default";
    private String strPrivate = "private";
    protected String strProtected = "protected";

    void mDefault () {
        System.out.println("this is a default access method.");
    }

    private void mPrivate () {
        System.out.println("this is a private access method.");
    }

    protected void mProtected () {
        System.out.println("this is a protected access method.");
    }
}
