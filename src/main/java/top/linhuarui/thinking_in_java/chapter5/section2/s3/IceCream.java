package top.linhuarui.thinking_in_java.chapter5.section2.s3;

/**
* @author LHR
* @date 2018/8/22
* @desc Demonstrates "private" keyword.
* @version 1.0
* @modify
*   @date
*/
public class IceCream {
    public static void main (String[] args) {
        //! Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}

class Sundae {
    private Sundae () {}
    static Sundae makeASundae () {
        return new Sundae();
    }
}
