package top.linhuarui.thinking_in_java.chapter4.section4;

/**
* @author LHR
* @date 2018/8/21
* @desc Shows default initial values.
* @version 1.0 
* @modify 
*   @date 
*/
public class InitialValues {
    public static void main (String[] args) {
        Measurement d = new Measurement();
        d.print();
        /*
        * In this case you could also say:
        * new Measurement().print();
        * */
    }
}

class Measurement {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    void print () {
        System.out.println(
                "Data type Initial value\n" +
                        "boolean " + t + "\n" +
                        "char " + c + "\n" +
                        "byte " + b + "\n" +
                        "short " + s + "\n" +
                        "int " + i + "\n" +
                        "long " + l + "\n" +
                        "float " + f + "\n" +
                        "double " + d
        );
    }
}