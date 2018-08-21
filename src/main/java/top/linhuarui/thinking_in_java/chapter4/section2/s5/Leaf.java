package top.linhuarui.thinking_in_java.chapter4.section2.s5;

/**
* @author LHR
* @date 2018/8/21
* @desc Simple use of the "this" keyword.
* @version 1.0
* @modify
*   @date
*/
public class Leaf {

    private int i = 0;

    Leaf increment () {
        i++;
        return this;
    }

    void print () {
        System.out.println("i = " + i);
    }

    public static void main (String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }

}
