package top.linhuarui.thinking_in_java.chapter7.section6.s2;

/**
* @author LHR
* @date 2018/8/23
* @desc An anonymous inner class that calls the base-class constructor
* @version 1.0
* @modify
*   @date
*/
public class Parcel7 {
    public Wrapping wrap (int x) {
        // Base constructor call:
        return new Wrapping(x) {
            @Override
            public int value() {
                return super.value() * 47;
            }
        }; // Semicolon required
    }

    public static void main (String[] args) {
        Parcel7 p = new Parcel7();
        Wrapping w = p.wrap(10);
    }
}
