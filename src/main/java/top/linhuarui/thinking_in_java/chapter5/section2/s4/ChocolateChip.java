package top.linhuarui.thinking_in_java.chapter5.section2.s4;

import top.linhuarui.thinking_in_java.chapter5.section2.s2.dessert.Cookie;

/**
* @author LHR
* @date 2018/8/22
* @desc Can't use package-access member from another package.
* @version 1.0
* @modify
*   @date
*/
public class ChocolateChip extends Cookie {

    public ChocolateChip () {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp () {
        //! foo(); // Can't access foo.
    }

    public static void main (String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
