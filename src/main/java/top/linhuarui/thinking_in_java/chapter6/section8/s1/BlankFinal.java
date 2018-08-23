package top.linhuarui.thinking_in_java.chapter6.section8.s1;

/**
* @author LHR
* @date 2018/8/23
* @desc "Blank" final data members.
* @version 1.0
* @modify
*   @date
*/
public class BlankFinal {

    final int i = 0; // Initialized final
    final int j; // Blank final
    final  Poppet p; // Blank final handle

    // Blank finals MUST be initialized in the constructor:
    BlankFinal () {
        j = 1; // Initialize blank final
        p = new Poppet();
    }

    BlankFinal (int x) {
        j = x; // Initialize blank final
        p = new Poppet();
    }

    public static void main (String[] args) {
        BlankFinal bf = new BlankFinal();
    }

}

class Poppet {}
