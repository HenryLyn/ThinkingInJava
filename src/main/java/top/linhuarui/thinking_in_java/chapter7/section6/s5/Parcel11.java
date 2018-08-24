package top.linhuarui.thinking_in_java.chapter7.section6.s5;

/**
* @author LHR
* @date 2018/8/24
* @desc Creating inner classes
* @version 1.0
* @modify
*   @date
*/
public class Parcel11 {
    class Contents {
        private int i = 11;

        public int value () {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination (String whereTo) {
            label = whereTo;
        }

        String readLabel () {
            return label;
        }
    }

    public static void main (String[] args) {
        Parcel11 p = new Parcel11();
        // Must use instance of outer class to create an instances of the inner class:
        Parcel11.Contents c = p.new Contents();
        Parcel11.Destination d = p.new Destination("Tanzania");
    }
}
