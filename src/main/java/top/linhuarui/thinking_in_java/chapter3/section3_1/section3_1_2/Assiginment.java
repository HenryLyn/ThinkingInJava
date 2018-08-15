package top.linhuarui.thinking_in_java.chapter3.section3_1.section3_1_2;

/**
* @author LHR
* @date 2018/8/8
* @desc Assignment with objects is a bit tricky
* @version 1.0
*/
public class Assiginment {

    public static void main (String args[]) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 9;
        n2.i = 47;

        System.out.println("1: n1.i: " + n1.i + ", n2.i: " + n2.i);
        n1 = n2;
        System.out.println("2: n1.i: " + n1.i + ", n2.i: " + n2.i);
        n1.i = 27;
        System.out.println("3: n1.i: " + n1.i + ", n2.i: " + n2.i);


    }
}

class Number {
    int i;
}