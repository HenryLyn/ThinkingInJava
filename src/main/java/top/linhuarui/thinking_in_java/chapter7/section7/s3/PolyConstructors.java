package top.linhuarui.thinking_in_java.chapter7.section7.s3;

/**
* @author LHR
* @date 2018/8/24
* @desc Constructors can polymorphism don't produce what you might expect.
* @version 1.0
* @modify
*   @date
*/
public class PolyConstructors {
    public static void main (String[] args) {
        new RoundGlyph(5);
    }
}

abstract class Glyph {
    abstract void draw ();

    Glyph () {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {

    int radius = 1;

    RoundGlyph (int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}