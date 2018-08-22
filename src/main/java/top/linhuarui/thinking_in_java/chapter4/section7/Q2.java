package top.linhuarui.thinking_in_java.chapter4.section7;

/**
* @author LHR
* @date 2018/8/22
* @desc 在练习 1的基础上增加一个过载的构建器，令其采用一个 String自变量，并随同自己的消息打印出来。
* @version 1.0
* @modify
*   @date
*/
public class Q2 {
    public static void main (String[] args) {
        new B ("Create Object B");
    }
}
class B {
    B () {
        System.out.println("Create Object B");
    }

    B (String s) {
        System.out.println("s = " + s);
    }
}