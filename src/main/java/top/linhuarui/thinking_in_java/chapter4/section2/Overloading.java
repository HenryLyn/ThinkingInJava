package top.linhuarui.thinking_in_java.chapter4.section2;

/**
* @author LHR
* @date 2018/8/16
* @desc Demonstrates of both constructor and ordinary method overloading.
* @version 1.0
* @modify
*   @date
*/
public class Overloading {

    public static void main (String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor:
        new Tree();
    }

}

class Tree {
    int height;

    Tree () {
        System.out.println("Planting a seeding");
        height = 0;
    }

    Tree (int i) {
        System.out.println("Creating new Tree that is " + i + " feet tall");
        height = i;
    }

    void info () {
        System.out.println("Tree is " + height + " feet tall");
    }

    void info (String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}
