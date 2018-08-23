package top.linhuarui.thinking_in_java.chapter7.section4;

/**
* @author LHR
* @date 2018/8/23
* @desc Abstract classes and methods
* @version 1.0
* @modify
*   @date
*/
public class Music4 {
    // Doesn't care about type, so new types added to the system still work right:
    static void tune (Instrument4 i) {
        i.play();
    }

    static void tuneAll (Instrument4[] e) {
        for (int i = 0; i < e.length; i++) {
            tune(e[i]);
        }
    }

    public static void main (String[] args) {
        Instrument4[] orchestra = new Instrument4[5];
        int i = 0;

        // Upcasting during addition to the array:
        orchestra[i++] = new Wind4();
        orchestra[i++] = new Percussion4();
        orchestra[i++] = new Stringed4();
        orchestra[i++] = new Brass4();
        orchestra[i++] = new Woodwind4();
        tuneAll(orchestra);
    }
}

abstract class Instrument4 {
    int i; // storage allocated for each

    public abstract void play ();

    public String what () {
        return "Instrument4";
    }

    public abstract void adjust ();
}

class Wind4 extends Instrument4 {

    @Override
    public void play() {
        System.out.println("Wind4.play()");
    }

    @Override
    public String what() {
        return "Wind4";
    }

    @Override
    public void adjust() {}
}

class Percussion4 extends Instrument4 {
    @Override
    public void play() {
        System.out.println("Percussion4.play()");
    }

    @Override
    public String what() {
        return "Percussion4";
    }

    @Override
    public void adjust() {

    }
}

class Stringed4 extends Instrument4 {
    @Override
    public void play() {
        System.out.println("Stringed4.play()");
    }

    @Override
    public String what() {
        return "Stringed4";
    }

    @Override
    public void adjust() {

    }
}

class Brass4 extends Instrument4 {
    @Override
    public void play() {
        System.out.println("Brass4.play()");
    }

    @Override
    public void adjust() {
        System.out.println("Brass4.adjust()");
    }
}

class Woodwind4 extends Wind4 {
    @Override
    public void play() {
        System.out.println("Woodwind4.play()");
    }

    @Override
    public String what() {
        return "Woodwind4";
    }
}