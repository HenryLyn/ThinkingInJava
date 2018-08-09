package top.linhuarui.thinking_in_java.chapter2.section2_7;

import java.util.Date;
import java.util.Properties;

/**
* @author LHR
* @date 2018/8/8
* @desc first java example program in Thinking in java
*/
public class Property {

    public static void main (String[] args) {
        System.out.println(new Date());
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println("--- Memory Usage:");
        Runtime rt = Runtime.getRuntime();
        System.out.println(
                "Total Memory = "
                + rt.totalMemory()
                + " Free Memory = "
                + rt.freeMemory());
    }
}
