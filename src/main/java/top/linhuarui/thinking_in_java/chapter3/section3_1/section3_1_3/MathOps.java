package top.linhuarui.thinking_in_java.chapter3.section3_1.section3_1_3;

import java.util.Random;

/**
* @author LHR
* @date 2018/8/9
* @desc Demonstrates the mathematical operators.
* @version 1.0 
*/
public class MathOps {
    
    public static void main (String[] args) {
        // create a random number generator,
        // seeds with current time by default
        Random random = new Random();
        int i, j, k;
        // '%' limits maximum value to 99:
        j = random.nextInt() % 100;
        k = random.nextInt() % 100;
        pInt("j", j);
        pInt("k", k);
        i = j + k;
        pInt("j + k", i);
        i = j - k;
        pInt("j - k", i);
        i = k / j;
        pInt("k / j", i);
        i = k * j;
        pInt("k * j", i);
        i = k % j;
        pInt("k % j", i);
        j %= k;
        pInt("j %= k", j);

        // Floating-point number tests;
        float u, v, w; // applies to doubles, too
        v = random.nextFloat();
        w = random.nextFloat();
        pFlt("v", v);
        pFlt("w", w);
        u = v + w;
        pFlt("v + w", u);
        u = u - w;
        pFlt("v - w", u);
        u = v * w;
        pFlt("v * w", u);
        u = v / w;
        pFlt("v / w", u);

        // the following also works for char, byte, short, int, long and double.
        u += v;
        pFlt("u += v", u);
        u -= v;
        pFlt("u -= v", u);
        u *= v;
        pFlt("u *= v", u);
        u /= v;
        pFlt("u /= v", u);


    }

    // Create a shorthand to save typing.
    static void prt (String s) {
        System.out.println(s);
    }

    // shorthand to print a string and an int
    static void pInt (String s, int i) {
        prt(s + " = " + i);
    }

    // shorthand to print a string and a float
    static void pFlt (String s, float f) {
        prt(s + " = " + f);
    }

}
