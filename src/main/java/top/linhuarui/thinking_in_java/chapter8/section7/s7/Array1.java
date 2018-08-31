package top.linhuarui.thinking_in_java.chapter8.section7.s7;

import java.util.Arrays;
import java.util.Random;

/**
* @author LHR
* @date 2018/8/31
* @desc Testing the sorting & searching in Arrays
* @version 1.0
* @modify
*   @date
*/
public class Array1 {
    static Random r = new Random();
    static String ssource = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz";
    static char[] src = ssource.toCharArray();

    /**
    * @author LHR
    * @date 2018/8/31
    * @desc  Create a random String
    * @params [lenght]
    * @returns java.lang.String
    * @version 1.0
    * @modify
    *   @date
    */
    public static String randString (int lenght) {
        char[] buf = new char[lenght];
        int rnd;
        for (int i = 0; i < lenght; i++) {
            rnd = Math.abs(r.nextInt()) % src.length;
            buf[i] = src[rnd];
        }
        return new String(buf);
    }

    /**
    * @author LHR
    * @date 2018/8/31
    * @desc Create a random array of Strings:
    * @params [length, size]
    * @returns java.lang.String[]
    * @version 1.0
    * @modify
    *   @date
    */
    public static String[] randStrings (int length, int size) {
        String[] s = new String[size];
        for (int i = 0; i < size; i++) {
            s[i] = randString(length);
        }
        return s;
    }

    public static void print (byte[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

    public static void print (String[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        byte[] b = new byte[15];
        r.nextBytes(b); // Fill with random bytes
        print(b);
        Arrays.sort(b);
        print(b);
        int loc = Arrays.binarySearch(b, b[10]);
        System.out.println("Location of " + b[10] + " = " + loc);
        // Test String sort & search:
        String[] s = randStrings(4, 10);
        print(s);
        Arrays.sort(s);
        print(s);
        loc = Arrays.binarySearch(s, s[4]);
        System.out.println("Location of " + s[4] + " = " + loc);
    }
}
