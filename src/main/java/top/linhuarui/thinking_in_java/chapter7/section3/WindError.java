package top.linhuarui.thinking_in_java.chapter7.section3;

/**
* @author LHR
* @date 2018/8/23
* @desc Accidentally changing the interface.
* @version 1.0
* @modify
*   @date
*/
public class WindError {
    public static void tune (InstrumentX i) {
        i.play(NoteX.MIDDLE_C);
    }

    public static void main (String[] args) {
        WindX flute = new WindX();
        tune(flute);
    }
}

class NoteX {
    public static final int
        MIDDLE_C = 0, C_SHARP = 1, C_FLAT = 2;
}

class InstrumentX {
    public void play (int NoteX) {
        System.out.println("Instrument.play()");
    }
}

class WindX extends InstrumentX {
    // OOPS! Changes the method interfaces:

    public void play(NoteX n) {
        System.out.println("Windx.play(NoteX n)");
    }
}