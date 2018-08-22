package top.linhuarui.thinking_in_java.chapter6.section1;

/**
* @author LHR
* @date 2018/8/22
* @desc Composition for code reuse
* @version 1.0
* @modify
*   @date
*/
public class SprinklerSystem {
    private String value1, value2, value3, value4;
    WaterSource source;
    int i;
    float f;

    void print () {
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);
        System.out.println("value4 = " + value4);
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("source = " + source);
    }

    public static void main (String[] args) {
        SprinklerSystem x = new SprinklerSystem();
        x.print();
    }
}

class WaterSource {
    private String s;
    WaterSource () {
        System.out.println("WaterSource()");
        s = new String ("Constructed");
    }

    @Override
    public String toString() {
        return s;
    }
}