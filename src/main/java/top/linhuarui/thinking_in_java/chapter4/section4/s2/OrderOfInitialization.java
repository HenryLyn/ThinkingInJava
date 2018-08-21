package top.linhuarui.thinking_in_java.chapter4.section4.s2;

/**
* @author LHR
* @date 2018/8/21
* @desc Demonstrates initialization order.
 * when the constructor is called, to create a Tag object, you'll see a message:
* @version 1.0 
* @modify 
*   @date 
*/
public class OrderOfInitialization {
    public static void main (String[] args) {
        Card t = new Card();
        t.f(); // Shows that construction is done
    }
}

class Tag {
    Tag (int marker) {
        System.out.println("Tag (" + marker + ")");
    }
}

class Card {
    Tag t1 = new Tag(1); // Before constructor

    Card () {
        System.out.println("Card()");
        t3 = new Tag(33); // Re-initialize t3
    }

    Tag t2 = new Tag(2);

    void f() {
        System.out.println("f()");
    }

    Tag t3 = new Tag(3); // at end
}
