package top.linhuarui.thinking_in_java.chapter8.section7.s3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
* @author LHR
* @date 2018/8/31
* @desc Putting your own type in a Set
* @version 1.0
* @modify
*   @date
*/
public class Set2 {
    public static Set fill (Set a, int size) {
        for (int i = 0; i < size; i++) {
            a.add(new MyType(i));
        }
        return a;
    }

    public static Set fill (Set a) {
        return fill(a, 10);
    }

    public static void test (Set a) {
        fill(a);
        fill(a); // Try to add duplicates
        fill(a);
        a.addAll(fill(new TreeSet()));
        System.out.println(a);

    }
    public static void main (String[] args) {
        test(new HashSet());
        test(new TreeSet());
    }
}

class MyType implements Comparable {
    private int i;

    public MyType (int n) {
        i = n;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof MyType) && (i == ((MyType) obj).i);
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public String toString() {
        return i + " ";
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
        int i2 = ((MyType) o).i;
        return (i2 < i ? -1 : (i2 == i ? 0 : 1));
    }
}