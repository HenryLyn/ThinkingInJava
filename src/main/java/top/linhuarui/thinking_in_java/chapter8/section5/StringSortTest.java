package top.linhuarui.thinking_in_java.chapter8.section5;

import java.util.Enumeration;

/**
* @author LHR
* @date 2018/8/27
* @desc Testing the generic sorting Vector
* @version 1.0
* @modify
*   @date
*/
public class StringSortTest {
    static class StringCompare implements Compare {

        @Override
        public boolean lessThan(Object lhs, Object rhs) {
            return ((String)lhs).toLowerCase().compareTo(((String) rhs).toLowerCase()) < 0;
        }

        @Override
        public boolean lessThanOrEqual(Object lhs, Object rhs) {
            return ((String)lhs).toLowerCase().compareTo(((String) rhs).toLowerCase()) <= 0;
        }
    }

    public static void main (String[] args) {
        SortVector sv = new SortVector(new StringCompare());
        sv.addElement("f");
        sv.addElement("A");
        sv.addElement("C");
        sv.addElement("c");
        sv.addElement("b");
        sv.addElement("B");
        sv.addElement("D");
        sv.addElement("a");
        sv.sort();
        Enumeration e = sv.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
