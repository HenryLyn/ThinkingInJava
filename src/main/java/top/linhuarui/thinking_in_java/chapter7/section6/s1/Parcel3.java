package top.linhuarui.thinking_in_java.chapter7.section6.s1;

/**
* @author LHR
* @date 2018/8/23
* @desc Returning a handle to an inner class
* @version 1.0
* @modify
*   @date
*/
public class Parcel3 {
    private class PContents extends Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        public PDestination (String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination dest (String s) {
        return new PDestination(s);
    }

    public Contents cont () {
        return new PContents();
    }
}

class Test {
    public static void main (String[] args) {
        Parcel3 p = new Parcel3();
        Contents c = p.cont();
        Destination d = p.dest("Tanzania");
        // Illegal -- Can't access private class:
        //! Parcel3.PContents c = p.new PContents();
    }
}

abstract class Contents {
    abstract public int value ();
}

interface Destination {
    String readLabel ();
}

