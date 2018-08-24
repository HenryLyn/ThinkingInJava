package top.linhuarui.thinking_in_java.chapter7.section10;

/**
* @author LHR
* @date 2018/8/24
* @desc 改正WindError.java 中的问题。
* @version 1.0 
* @modify 
*   @date 
*/
public class E3 {
}

class WindError {
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
    public void play (int n) {
        System.out.println("Instrument.play()");
    }
}

class WindX extends InstrumentX {
    @Override
    public void play(int n) {
        System.out.println("Windx.play(int n)");
    }
}