package top.linhuarui.thinking_in_java.chapter8.section7.s1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
* @author LHR
* @date 2018/8/30
* @desc Things you can do with all Collections.
* @version 1.0
* @modify
*   @date
*/
public class Collection1 {
    /**
    * @author LHR
    * @date 2018/8/30
    * @desc Fill with 'size' elements, start counting at 'start'
    * @params [c, start, size]
    * @returns java.util.Collection
    * @version 1.0
    * @modify
    *   @date
    */
    public static Collection fill (Collection c, int start, int size) {
        for (int i = start; i < start + size; i++) {
            c.add(Integer.toString(i));
        }
        return c;
    }

    /**
    * @author LHR
    * @date 2018/8/30
    * @desc default to a "start" of 0
    * @params [c, size]
    * @returns java.util.Collection
    * @version 1.0
    * @modify
    *   @date
    */
    public static Collection fill (Collection c, int size) {
        return fill(c, 0, size);
    }

    public static Collection fill (Collection c) {
        return fill(c, 0, 10);
    }

    /**
    * @author LHR
    * @date 2018/8/30
    * @desc create & upcast to Collection
    * @params []
    * @returns java.util.Collection
    * @version 1.0
    * @modify
    *   @date
    */
    public static Collection newCollection () {
        // ArrayList is used for simplicity,
        // but it's only seen as a generic Collection
        // everywhere else in the program.
        return fill(new ArrayList());
    }

    /**
    * @author LHR
    * @date 2018/8/30
    * @desc Fill a Collection with a range of values
    * @params [start, size]
    * @returns java.util.Collection
    * @version 1.0
    * @modify
    *   @date
    */
    public static Collection newCollection (int start, int size) {
        return fill(new ArrayList(), start, size);
    }

    /**
    * @author LHR
    * @date 2018/8/30
    * @desc Moving through a List with an iterator
    * @params [c]
    * @returns void
    * @version 1.0
    * @modify
    *   @date
    */
    public static void print (Collection c) {
        for (Iterator x = c.iterator(); x.hasNext();) {
            System.out.print(x.next() + " ");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        Collection c = newCollection();
        c.add("ten");
        c.add("eleven");
        print(c);

        // Make an array from the List:
        Object[] array = c.toArray();

        // Make a String array from the List:
        String[] str = (String[])c.toArray(new String[1]);

        // Find max and min elements; this means
        // different things depending on the way
        // the Comparable interface is implemented:
        System.out.println("Collections.max(c) = " + Collections.max(c));
        System.out.println("Collections.min(c) = " + Collections.min(c));

        // Add a Collection to another Collection
        c.addAll(newCollection());
        print(c);
        // Removes the first one
        c.remove("3");
        print(c);
        // Removes the second one
        c.remove("3");
        print(c);
        // Remove all components that are in the argument collection:
        c.removeAll(newCollection());
        print(c);
        c.addAll(newCollection());
        print(c);
        // Is an element in this Collection?
        System.out.println("c.contains(\"4\") = " + c.contains("4"));
        // Is a Collection in this Collection?
        System.out.println("c.containsAll(newCollection()) = " + c.containsAll(newCollection()));

        Collection c2 = newCollection();
        // Keep all the elements that are in both
        // c and c2 (an intersection of sets):
        c.retainAll(c2);
        print(c);
        // Throw away all the elements in c that also appear in c2:
        c.removeAll(c2);
        System.out.println("c.isEmpty() = " + c.isEmpty());
        c = newCollection();
        print(c);
        // Remove all elements
        c.clear();
        System.out.println("after c.clear():");
        print(c);
    }
}