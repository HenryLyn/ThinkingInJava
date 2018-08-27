package top.linhuarui.thinking_in_java.chapter8.section4.s1;

import java.util.Vector;

/**
* @author LHR
* @date 2018/8/27
* @desc One way to crash Java
* @version 1.0 
* @modify 
*   @date 
*/
public class CrashJava {
    @Override
    public String toString() {
        return "CrashJava address" + this + "\n"; // 'this' to string will call toString also.
    }

    public static void main (String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.addElement(new CrashJava());
        }
        System.out.println(v);
    }
}
