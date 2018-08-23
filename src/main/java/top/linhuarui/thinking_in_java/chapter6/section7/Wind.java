package top.linhuarui.thinking_in_java.chapter6.section7;

/**
* @author LHR
* @date 2018/8/23
* @desc Inheritance & upcasting
* @version 1.0
* @modify
*   @date
*/
public class Wind extends Instrument{ // wind objects are instruments because they have the same interface;

    public static void main (String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // Upcasting
    }
}

class Instrument {

    public void play () {}

    static void tune (Instrument i) {
        i.play();
    }
}