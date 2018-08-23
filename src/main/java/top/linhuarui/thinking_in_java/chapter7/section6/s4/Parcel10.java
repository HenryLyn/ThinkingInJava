package top.linhuarui.thinking_in_java.chapter7.section6.s4;

/**
* @author LHR
* @date 2018/8/23
* @desc Static inner classes.
* @version 1.0
* @modify
*   @date
*/
public class Parcel10 {
    private static class PContents extends Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static class PDestination implements Destination{
        private String label;

        PDestination (String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public static Destination dest (String s) {
        return new PDestination(s);
    }

    public static Contents cont () {
        return new PContents();
    }

    public static void main (String[] args) {
        Contents c = cont();
        Destination d = dest("Tanzania");
    }
}

abstract class Contents {
    abstract public int value ();
}

interface Destination {
    String readLabel();
}