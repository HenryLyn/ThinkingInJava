package top.linhuarui.thinking_in_java.chapter3.section3_1.section3_1_6;

import java.util.Random;

/**
* @author LHR
* @date 2018/8/9
* @desc Relational and logical operators
* @version 1.0
*/
public class Bool {

    public static void main (String[] args) {
        Random rand = new Random();
        int i = rand.nextInt() % 100;
        int j = rand.nextInt() % 100;
        prt("i = " + i);
        prt("j = " + j);
        prt("i > j is " + (i > j));
        prt("i < j is " + (i < j));
        prt("i >= j is " + (i >= j));
        prt("i <= j is " + (i <= j));
        prt("i == j is " + (i == j));
        prt("i != j is " + (i != j));

        // Treating an int as a boolean is not legal Java
        //! prt("i && j is " + (i && j));

        prt("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
        prt("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
    }

    static void prt (String s) {
        System.out.println(s);
    }
}
