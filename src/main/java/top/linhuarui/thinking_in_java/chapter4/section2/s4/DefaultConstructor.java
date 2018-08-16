package top.linhuarui.thinking_in_java.chapter4.section2.s4;

public class DefaultConstructor {
    public static void main (String[] args) {
        Bird nc = new Bird(); // new class with default constructor.
        //new Bush();  // ignore the default constructor if we defined other constructors.
    }
}

class Bird {
    int i;
}

class Bush {
    Bush (int i) {}
    Bush (double d) {}
}