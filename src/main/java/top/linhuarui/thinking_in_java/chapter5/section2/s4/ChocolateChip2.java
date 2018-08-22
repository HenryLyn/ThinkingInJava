package top.linhuarui.thinking_in_java.chapter5.section2.s4;

import top.linhuarui.thinking_in_java.chapter5.section2.s4.cookie2.Cookie;

/**
* @author LHR
* @date 2018/8/22
* @desc test protected access permission.
* @version 1.0
* @modify
*   @date
*/
public class ChocolateChip2 extends Cookie {
    public ChocolateChip2 () {
        System.out.println("ChocolateChip2 constructor");
    }

    public void chomp () {
        bite();
    }

    public static void main (String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
}
