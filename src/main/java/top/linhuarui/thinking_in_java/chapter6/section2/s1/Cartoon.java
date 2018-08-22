package top.linhuarui.thinking_in_java.chapter6.section2.s1;

/**
* @author LHR
* @date 2018/8/22
* @desc Constructor calls during inheritance.
* @version 1.0
* @modify
*   @date
*/
public class Cartoon extends Drawing{
    Cartoon () {
        System.out.println("Cartoon constructor");
    }

    public static void main (String[] args) {
        Cartoon x = new Cartoon();
    }
}

class Art {
    Art() {
        System.out.println("Art Constructor");
    }
}

class Drawing extends Art {
    Drawing () {
        System.out.println("Drawing constructor");
    }
}
