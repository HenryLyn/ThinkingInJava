package top.linhuarui.thinking_in_java.chapter7.section5.s4;

/**
* @author LHR
* @date 2018/8/23
* @desc Initializing interface fields with non-constant initializer.
* @version 1.0
* @modify
*   @date
*/
public interface RandVals {
    int rint = (int) (Math.random() * 10);
    long rlong = (long) (Math.random() * 10);
    float rfloat = (float) (Math.random() * 10);
    double rdouble = Math.random() * 10;
}
