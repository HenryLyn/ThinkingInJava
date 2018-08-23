package top.linhuarui.thinking_in_java.chapter7.section6.s2;

/**
* @author LHR
* @date 2018/8/23
* @desc An anonymous inner class that performs initialization. A briefer version of Parcel5.java
* @version 1.0
* @modify
*   @date
*/
public class Parcel8 {
    // Argument must be final to use inside anonymous inner class:
    public Destination dest (final String dest) {
        return new Destination() {
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main (String[] args) {
        Parcel8 p = new Parcel8();
        Destination d = p.dest("Tanzania");
    }
}
