package top.linhuarui.thinking_in_java.chapter5.section2.dessert;

/**
* @author LHR
* @date 2018/8/22
* @desc Accesses a class in a separate compilation unit.
* @version 1.0
* @modify
*   @date
*/
public class Cake {
    public static void main (String[] args) {
        Pie x = new Pie();
        x.f();
    }
}
