package top.linhuarui.thinking_in_java.chapter3.section3_1_5;

/**
* @author LHR
* @date 2018/8/9
* @desc Practice equals method in user-defined object.
* @version 1.0
*/
public class EqualsMethod2 {

    public static void main (String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }

}

class Value {
    int i;
}