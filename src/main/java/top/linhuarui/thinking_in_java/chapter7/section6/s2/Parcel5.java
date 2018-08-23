package top.linhuarui.thinking_in_java.chapter7.section6.s2;

/**
* @author LHR
* @date 2018/8/23
* @desc Nesting a class within a scope
* @version 1.0
* @modify
*   @date
*/
public class Parcel5 {

    private void internalTracking (boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                TrackingSlip (String s) {
                    id = s;
                }

                String getSlip () {
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
        // Can't use it here! Out of scope:
        //! TrackingSlip ts = new TrackingSlip("x");
    }

    public void track () {
        internalTracking(true);
    }

    public static void main (String[] args) {
        Parcel5 p = new Parcel5();
        p.track();
    }
}
