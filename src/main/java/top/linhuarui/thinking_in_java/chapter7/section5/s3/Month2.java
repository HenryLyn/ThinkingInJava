package top.linhuarui.thinking_in_java.chapter7.section5.s3;

/**
* @author LHR
* @date 2018/8/23
* @desc A more robust enumeration system
* @version 1.0
* @modify
*   @date
*/
public final class Month2 {
    private String name;

    private Month2(String nm) {
        name = nm;
    }

    @Override
    public String toString() {
        return name;
    }

    public final static Month2
        JAN = new Month2("January"),
        FEB = new Month2("February"),
        MAR = new Month2("March"),
        APR = new Month2("April"),
        MAY = new Month2("May"),
        JUN = new Month2("June"),
        JUL = new Month2("July"),
        AUG = new Month2("August"),
        SEP = new Month2("September"),
        OCT = new Month2("October"),
        NOV = new Month2("November"),
        DEC = new Month2("December");

    public final static Month2[] month = {
        JAN, JAN, FEB, MAR, APR, MAR, JUN,
        JUL, AUG, SEP, OCT, NOV, DEC
    };

    public static void main (String[] args) {
        Month2 m = Month2.JAN;
        System.out.println(m);
        m = Month2.month[12];
        System.out.println(m);
        System.out.println(m == Month2.DEC);
        System.out.println(m.equals(Month2.DEC));
    }
}
