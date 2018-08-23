package top.linhuarui.thinking_in_java.chapter7.section6.s2;

/**
* @author LHR
* @date 2018/8/23
* @desc Using "instance initialization" to perform construction on an anonymous inner class.
* @version 1.0
* @modify
*   @date
*/
public class Parcel9 {
    public Destination dest (final String dest, final float price) {
        return new Destination() {
            private int cost;

            // Instance initialization for each object:
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget!");
                }
            }
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main (String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.dest("Tanzania", 101.395F);
    }

}
