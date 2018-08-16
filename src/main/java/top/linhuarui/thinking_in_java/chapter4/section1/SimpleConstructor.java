package top.linhuarui.thinking_in_java.chapter4.section1;

/**
* @author LHR
* @date 2018/8/15
* @desc Demonstration of a simple constructor
* @version 1.0 
* @modify 
*   @date 
*/
public class SimpleConstructor {
    public static void main (String[] args) {
        for (int i = 0; i < 10; i++){
            new Rock();
            new Rock(i);
        }
    }
}

class Rock {
    Rock () {
        System.out.println("Creating Rock");
    }
    Rock (int i) {
        System.out.println("Creating Rock number " + i);
    }
}
