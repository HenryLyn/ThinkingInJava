package top.linhuarui.thinking_in_java.chapter7.section6.s4;

/**
* @author LHR
* @date 2018/8/24
* @desc Putting test code in a static inner class
* @version 1.0
* @modify
*   @date
*/
public class TestBed {

    TestBed () {}

    void f () {
        System.out.println("f()");
    }

    public static class Tester {
        public static void main (String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}
