package top.linhuarui.thinking_in_java.chapter8.section7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
* @author LHR
* @date 2018/8/30
* @desc A simple example using the new Collections
* @version 1.0 
* @modify 
*   @date 
*/
public class SimpleCollection {

    public static void main (String[] args) {
        Collection c = new ArrayList();
        for (int i = 0; i < 10; i++) {
            c.add(Integer.toString(i));
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
