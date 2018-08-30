package top.linhuarui.thinking_in_java.chapter8.section5;

/**
* @author LHR
* @date 2018/8/27
* @desc Interface for sorting callback;
* @version 1.0
* @modify
*   @date
*/
interface Compare {
    boolean lessThan (Object lhs, Object rhs);
    boolean lessThanOrEqual (Object lhs, Object rhs);
}
