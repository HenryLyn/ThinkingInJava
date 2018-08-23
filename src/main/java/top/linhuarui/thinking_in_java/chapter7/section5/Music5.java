package top.linhuarui.thinking_in_java.chapter7.section5;

/**
* @author LHR
* @date 2018/8/23
* @desc Interfaces
* @version 1.0
* @modify
*   @date
*/
public class Music5 {
    // Doesn't care about type, so new types added to the system still work right:
    static void tune (Instrument5 i) {
        i.play();
    }

    static void tuneAll (Instrument5[] e) {
        for (int i = 0; i < e.length; i++) {
            tune(e[i]);
        }
    }

    public static void main (String[] args) {
        Instrument5[] orchestra = new Instrument5[5];
        int i = 0;
        orchestra[i++] = new Wind5();
        orchestra[i++] = new Percussion5();
        orchestra[i++] = new Stringed5();
        orchestra[i++] = new Brass5();
        orchestra[i++] = new Woodwind5();
        tuneAll(orchestra);
    }
}

interface Instrument5 {
    // Compile-time constant:
    int i = 5; // public & static & final

    // Cannot have method definitions:
    void play (); // Automatically public

    String what ();

    void adjust();
}

class Wind5 implements Instrument5 {

    @Override
    public void play() {
        System.out.println("Wind5.play()");
    }

    @Override
    public String what() {
        return "Wind5";
    }

    @Override
    public void adjust() {

    }
}

class Percussion5 implements Instrument5 {

    @Override
    public void play() {
        System.out.println("Percussion5");
    }

    @Override
    public String what() {
        return "Percussion5";
    }

    @Override
    public void adjust() {

    }
}

class Stringed5 implements Instrument5 {

    @Override
    public void play() {
        System.out.println("Stringed5.play()");
    }

    @Override
    public String what() {
        return "Stringed5";
    }

    @Override
    public void adjust() {

    }
}

class Brass5 extends Wind5 {
    @Override
    public void play() {
        System.out.println("Brass5.play()");
    }

    @Override
    public void adjust() {
        System.out.println("Brass5.adjust()");
    }
}

class Woodwind5 extends Wind5 {
    @Override
    public void play() {
        System.out.println("Woodwind5.play()");
    }

    @Override
    public String what() {
        return "Woodwind5";
    }
}