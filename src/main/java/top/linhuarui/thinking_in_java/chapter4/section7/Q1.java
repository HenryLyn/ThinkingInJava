package top.linhuarui.thinking_in_java.chapter4.section7;

/**
* @author LHR
* @date 2018/8/22
* @desc 用默认构建器创建一个类（没有自变量），用它打印一条消息。创建属于这个类的一个对象
* @version 1.0 
* @modify 
*   @date 
*/
public class Q1 {
    public static void main (String[] args) {
        new A();
    }
}

class A {
    A () {
        System.out.println("Create Object A");
    }
}
