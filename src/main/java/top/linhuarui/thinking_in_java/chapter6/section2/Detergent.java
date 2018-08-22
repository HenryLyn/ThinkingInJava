package top.linhuarui.thinking_in_java.chapter6.section2;

/**
* @author LHR
* @date 2018/8/22
* @desc Inheritance syntax & properties.
* @version 1.0
* @modify
*   @date
*/
public class Detergent extends Cleanser{
    // Change a method:
    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }

    // Add methods to the interface:
    public void foam () {
        append(" foam()");
    }

    // Test the new class:
    public static void main (String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.print();
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}

class Cleanser {
    private String s = new String ("Cleanser");

    public void append (String a) {
        s += a;
    }

    public void dilute () {
        append(" dilute()");
    }

    public void apply () {
        append(" apply()");
    }

    public void scrub () {
        append(" scrub()");
    }

    public void print () {
        System.out.println(s);
    }

    public static void main (String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        x.print();
    }
}