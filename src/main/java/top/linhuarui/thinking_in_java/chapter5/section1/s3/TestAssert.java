package top.linhuarui.thinking_in_java.chapter5.section1.s3;
import top.linhuarui.thinking_in_java.utils.debug.*;
//import top.linhuarui.thinking_in_java.utils.debug.Assert;

/**
* @author LHR
* @date 2018/8/22
* @desc Demonstrating the assertion tool
 * Comment the following, and uncomment the subsequent line to change assertion behavior:
* @version 1.0
* @modify
*   @date
*/
public class TestAssert {
    public static void main (String[] args) {
        Assert.is_true((2 + 2) == 5);
        Assert.is_false((1 + 1) == 2);
        Assert.is_true((2 + 2) == 5, "2 + 2 == 5");
        Assert.is_false((1 + 1) == 2, "1 + 1 != 2");
    }
}
