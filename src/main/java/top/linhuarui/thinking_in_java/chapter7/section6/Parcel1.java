package top.linhuarui.thinking_in_java.chapter7.section6;

/**
* @author LHR
* @date 2018/8/23
* @desc Creating inner classes
* @version 1.0
* @modify
*   @date
*/
public class Parcel1 {
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

    // Using inner classes looks just like using any other class, within Parcel1:
    public void ship (String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
    }

    public static void main (String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tanzania");
    }
}
