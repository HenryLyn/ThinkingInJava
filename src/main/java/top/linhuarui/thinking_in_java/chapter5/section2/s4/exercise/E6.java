package top.linhuarui.thinking_in_java.chapter5.section2.s4.exercise;

/**
* @author LHR
* @date 2018/8/22
* @desc Create a class with protected data.
 * Create a second class in the same file with a method that manipulates the protected data in the first class.
* @version 1.0 
* @modify 
*   @date 
*/
public class E6 {
    public static void main (String[] args) {
        new B().manipulate(1);
    }
}

class A {
    protected int data;
}

class B {

    A a;

    void manipulate (int data) {
        a = new A();
        a.data = data;
        System.out.println("data in class A is: " + a.data);
    }
}