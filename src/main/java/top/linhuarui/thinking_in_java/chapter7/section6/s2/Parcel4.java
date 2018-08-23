package top.linhuarui.thinking_in_java.chapter7.section6.s2;

/**
* @author LHR
* @date 2018/8/23
* @desc Nesting a class within a method.
* @version 1.0
* @modify
*   @date
*/
public class Parcel4 {

    public Destination dest (String s) {
        class PDestination implements Destination {
            private String label;

            public PDestination (String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main (String[] args) {
        Parcel4 p = new Parcel4();
        Destination d = p.dest("Tanzania");
    }
}
