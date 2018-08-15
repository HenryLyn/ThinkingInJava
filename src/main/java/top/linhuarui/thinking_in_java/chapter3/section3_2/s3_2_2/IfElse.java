package top.linhuarui.thinking_in_java.chapter3.section3_2.s3_2_2;

public class IfElse {

    private static final int TARGET = 100;

    public static void main (String[] args) {
        isBigger(10);
    }

    private static int isBigger(int i) {
        if (i > TARGET) {
            return 1;
        } else if (i < TARGET) {
            return -1;
        } else {
            return 0; //match
        }
    }

    private static int isBigger2 (int i) {
        if (i > TARGET) {
            return 1;
        }
        if (i < TARGET) {
            return -1;
        }
        return 0; // match
    }

}
