package top.linhuarui.thinking_in_java.chapter4.section7;

/**
* @author LHR
* @date 2018/8/22
* @desc 创建同句柄数组联系起来的对象，最终完成练习3。
* @version 1.0
* @modify
*   @date
*/
public class Q4 {
    public static void main (String[] args) {
        B[] b = {
                new B(),
                new B(),
        };
    }
}
