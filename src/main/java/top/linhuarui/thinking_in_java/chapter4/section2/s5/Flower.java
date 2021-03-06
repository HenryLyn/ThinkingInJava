package top.linhuarui.thinking_in_java.chapter4.section2.s5;

/**
* @author LHR
* @date 2018/8/21
* @desc Calling constructors with "this"
* @version 1.0 
* @modify 
*   @date 
*/
public class Flower {

    private int petalCount = 0;
    private String s = new String("null");

    Flower (int petals) {
        petalCount = petals;
        System.out.println(
                "Constructor w/ int arg only, petalCount = " + petalCount
        );
    }

    Flower (String ss) {
        System.out.println(
                "Constructor w/ String args only, s = " + ss
        );
    }

    Flower (String s, int petals) {
        this(petals);
        // this(s); // Can't call two!
        this.s = s;
        System.out.println("String & int args");
    }

    Flower () {
        this("hi", 47);
        System.out.println(
                "default constructor (no args)"
        );
    }
    void print () {
        // this(11); // Not inside non-constructor!
        System.out.println(
                "petalCount = " + petalCount + " s = " + s
        );
    }

    public static void main (String[] args) {
        Flower x = new Flower();
        x.print();
    }
}
