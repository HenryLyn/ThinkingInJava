package top.linhuarui.thinking_in_java.chapter7.section6.s4;

/**
* @author LHR
* @date 2018/8/24
* @desc Static inner classes inside interface
* @version 1.0
* @modify
*   @date
*/
interface IInterface {
    static class Inner {
        int i, j, k;

        public Inner () {}

        void f () {}
    }
}
