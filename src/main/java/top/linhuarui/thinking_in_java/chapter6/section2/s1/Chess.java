package top.linhuarui.thinking_in_java.chapter6.section2.s1;

/**
* @author LHR
* @date 2018/8/22
* @desc Inheritance, constructors and arguments
* @version 1.0
* @modify
*   @date
*/
public class Chess extends BoardGame{

    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main (String[] args) {
        Chess x = new Chess();
    }
}

class Game {
    Game (int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame (int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}