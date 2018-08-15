package top.linhuarui.thinking_in_java.chapter3.section3_1.section3_1_13;

/**
* @author LHR
* @date 2018/8/13
* @desc literal type.
* @version 1.0 
* @modify 
*   @date 
*/
public class Literals {
    char c = 0xffff; // max char hex value
    byte b = 0x7f; // max byte hex vale
    short s = 0x7fff; // max short hex value
    int i1 = 0x2f; // Hexadecimal - lowercase
    int i2 = 0x2F; // Hexadecimal - uppercase
    int i3 = 0177; // octal - leading zero
    // hex and oct also work with long
    long n1 = 200L; // long suffix - uppercase
    long n2 = 200l; // long suffix - lowercase
    long n3 = 200;
    // !long 16(200) // not allowed ???
    float f1 = 1;
    float f2 = 1F; // float suffix - uppercase
    float f3 = 1f; // float suffix - lowercase
    float f4 = 1e-45f; // 10 to the power
    float f5 = 1e+9f; // float suffix with 1e
    double d1 = 1d; // double suffix - lowercase;
    double d2 = 1D; // double suffix - uppercase;
    double d3 = 47e47d; // 10 to the power

}
