package top.linhuarui.thinking_in_java.chapter8.section7.s7;

import top.linhuarui.thinking_in_java.chapter8.section7.s1.Collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
* @author LHR
* @date 2018/8/31
* @desc Sorting and searching Lists with 'Collections'
* @version 1.0 
* @modify 
*   @date 
*/
public class ListSort {
    public static void main (String[] args) {
        final int SZ = 20;
        // Using "natural comparison method":
        List a = new ArrayList();
        for (int i = 0; i < SZ; i++) {
            a.add(new CompClass((int) (Math.random() * 100)));
        }
        Collection1.print(a);
        Collections.sort(a);
        Collection1.print(a);
        Object find = a.get(SZ / 2);
        int loc = Collections.binarySearch(a, find);
        System.out.println("Location of " + find + " = " + loc);
        // Using a Comparator:
        List b = new ArrayList();
        for (int i = 0; i < SZ; i++) {
            b.add(Array1.randString(4));
        }
        Collection1.print(b);
        AlphaComp ac = new AlphaComp();
        Collections.sort(b, ac);
        Collection1.print(b);
        find = b.get(SZ / 2);
        // Must use the Comparator to search, also:
        loc = Collections.binarySearch(b, find, ac);
        System.out.println("Location of " + find + " = " + loc);
    }
}