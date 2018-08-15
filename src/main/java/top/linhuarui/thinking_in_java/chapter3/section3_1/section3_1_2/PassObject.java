package top.linhuarui.thinking_in_java.chapter3.section3_1.section3_1_2;
/**
* @author LHR
* @date 2018/8/8
* @desc  Passing objects to methods can be a bit tricky
* @version 1.0
*/
public class PassObject {

    public static void main (String args[]) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    }

    static void f(Letter y) {
        y.c = 'z';
    }
}

class Letter {
    char c;
}
