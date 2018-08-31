package top.linhuarui.thinking_in_java.chapter8.section7.s7;

import java.util.Arrays;

/**
* @author LHR
* @date 2018/8/31
* @desc A class that implements Comparable
* @version 1.0
* @modify
*   @date
*/
public class CompClass implements Comparable{
    private int i;

    public CompClass (int ii) {
        i = ii;
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     *
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Object o) {
        // Implicitly tests for correct type:
        int argi = ((CompClass) o).i;
        if (i == argi) {
            return 0;
        }
        if (i < argi) {
            return -1;
        }
        return 1;
    }

    public static void print (Object[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return i + "";
    }

    public static void main (String[] args) {
        CompClass[] a = new CompClass[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = new CompClass((int) (Math.random() * 100));
        }
        print(a);
        Arrays.sort(a);
        print(a);
        int loc = Arrays.binarySearch(a, a[3]);
        System.out.println("Location of " + a[3] + " = " + loc);
    }
}
