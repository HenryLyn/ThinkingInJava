package top.linhuarui.thinking_in_java.chapter8.section7.s4;

import top.linhuarui.thinking_in_java.chapter8.section7.s1.Collection1;

import java.util.*;

/**
* @author LHR
* @date 2018/8/31
* @desc Things you can do with Maps
* @version 1.0
* @modify
*   @date
*/
public class Map1 {
    public final static String[][] testData1 = {
            { "Happy", "Cheerful disposition" },
            { "Sleepy", "Prefers dark, quiet places" },
            { "Grumpy", "Needs to work on attitude" },
            { "Doc", "Fantasizes about advanced degree"},
            { "Dopey", "'A' for effort" },
            { "Sneezy", "Struggles with allergies" },
            { "Bashful", "Needs self-esteem workshop"},
    };

    public final static String[][] testData2 = {
            { "Belligerent", "Disruptive influence" },
            { "Lazy", "Motivational problems" },
            { "Comatose", "Excellent behavior" }
    };

    public static Map fill (Map m, Object[][] o) {
        for (int i = 0; i < o.length; i++) {
            m.put(o[i][0], o[i][1]);
        }
        return m;
    }

    /**
    * @author LHR
    * @date 2018/8/31
    * @desc  Producing a Set of the keys:
    * @params [m]
    * @returns void
    * @version 1.0
    * @modify
    *   @date
    */
    public static void printKeys (Map m) {
        System.out.print("Size = " + m.size() + ", ");
        System.out.print("Keys: ");
        Collection1.print(m.keySet());
    }

    /**
    * @author LHR
    * @date 2018/8/31
    * @desc Producing a Collection of the values:
    * @params [m]
    * @returns void
    * @version 1.0
    * @modify 
    *   @date 
    */
    public static void printValues (Map m) {
        System.out.print("Values: ");
        Collection1.print(m.values());
    }

    /**
    * @author LHR
    * @date 2018/8/31
    * @desc Iterating through Map.Entry objects (pairs):
    * @params [m]
    * @returns void
    * @version 1.0
    * @modify
    *   @date
    */
    public static void print (Map m) {
        Collection entries = m.entrySet();
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("Key = " + e.getKey() + ", Value = " + e.getValue());
        }
    }

    public static void test (Map m) {
        fill(m, testData1);
        // Map has 'Set' behavior for keys:
        fill(m, testData1);
        printKeys(m);
        printValues(m);
        print(m);
        String key = testData1[4][0];
        String value = testData1[4][1];
        System.out.println("m.containsKey(\"" + key + "\"): " + m.containsKey(key));
        System.out.println("m.get(\"" + key + "\"): " + m.get(key));
        System.out.println("m.containsValue(\"" + value + "\"): " + m.containsValue(value));
        Map m2 = fill(new TreeMap(), testData2);
        m.putAll(m2);
        printKeys(m);
        m.remove(testData2[0][0]);
        printKeys(m);
        m.clear();
        System.out.println("m.isEmpty():" + m.isEmpty());
        fill(m, testData1);
        // Operations on the Set change the Map:
        m.keySet().removeAll(m.keySet());
        System.out.println("m.isEmpty(): " + m.isEmpty());
    }

    public static void main (String[] args) {
        System.out.println("Testing HashMap");
        test(new HashMap());
        System.out.println("Testing TreeMap");
        test(new TreeMap());
    }
}
