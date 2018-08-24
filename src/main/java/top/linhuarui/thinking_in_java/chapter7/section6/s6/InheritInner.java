package top.linhuarui.thinking_in_java.chapter7.section6.s6;

/**
* @author LHR
* @date 2018/8/24
* @desc Inheriting an inner class.
* @version 1.0
* @modify
*   @date
*/
public class InheritInner extends WithInner.Inner {

    //! InheritInner () {} // Won't compile

    InheritInner (WithInner wi) {
        wi.super();
    }
}

class WithInner {
    class Inner {}
}