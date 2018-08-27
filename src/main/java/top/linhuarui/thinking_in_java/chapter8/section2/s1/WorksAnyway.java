package top.linhuarui.thinking_in_java.chapter8.section2.s1;

import java.util.Vector;

/**
* @author LHR
* @date 2018/8/27
* @desc In special cases, things just seem to work correctly.
* @version 1.0
* @modify
*   @date
*/
public class WorksAnyway {
    public static void main (String[] args) {
        Vector mice = new Vector();
        for (int i = 0; i < 3; i++) {
            mice.addElement(new Mouse(i));
        }
        for (int i = 0; i < mice.size(); i++) {
            // No cast necessary, automatic call to Object.toString();
            System.out.println("Free Mouse: " + mice.elementAt(i));
            MouseTrap.caughtYa(mice.elementAt(i));
        }
    }
}

class Mouse {
    private int mouseNumber;

    Mouse (int i) {
        mouseNumber = i;
    }

    // Magic method:

    @Override
    public String toString() {
        return "This is Mouse #" + mouseNumber;
    }

    void print (String msg) {
        if (msg != null) {
            System.out.println(msg);
        }
        System.out.println("Mouse number " + mouseNumber);
    }
}

class MouseTrap {
    static void caughtYa (Object m) {
        Mouse mouse = (Mouse) m; // Cast from Object
        mouse.print("Caught one!");
    }
}