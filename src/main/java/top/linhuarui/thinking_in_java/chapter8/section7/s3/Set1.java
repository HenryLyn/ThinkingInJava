package top.linhuarui.thinking_in_java.chapter8.section7.s3;

import top.linhuarui.thinking_in_java.chapter8.section7.s1.Collection1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
* @author LHR
* @date 2018/8/30
* @desc Things you can do with Sets
* @version 1.0 
* @modify 
*   @date 
*/
public class Set1 {
    public static void testVisual (Set a) {
        Collection1.fill(a);
        Collection1.fill(a);
        Collection1.fill(a);
        Collection1.print(a);
        // No duplicates!
        a.addAll(a);
        a.add("one");
        a.add("one");
        a.add("one");
        Collection1.print(a);
        // Look something up:
        System.out.println("a.contains(\"one\"): " + a.contains("one"));
    }

    public static void main (String[] args) {
        testVisual(new HashSet());
        testVisual(new TreeSet());
    }
}
