package top.linhuarui.thinking_in_java.chapter7.section5.s1;

/**
* @author LHR
* @date 2018/8/23
* @desc Multiple interface
* @version 1.0
* @modify
*   @date
*/
public class Adventure {
    static void t (CanFight x) {
        x.fight();
    }

    static void u (CanSwim x) {
        x.swim();
    }

    static void v (CanFly x) {
        x.fly();
    }

    static void w (ActionCharactor x) {
        x.fight();
    }

    public static void main (String[] args) {
        Hero i = new Hero();
        t(i); // Treat it as a CanFight
        u(i); // Treat it as a CanSwim
        v(i); // Treat it as a CanFly
        w(i); // Treat it as an ActionCharacter
    }

}

interface CanFight {
    void fight ();
}

interface CanSwim {
    void swim ();
}

interface CanFly {
    void fly ();
}

class ActionCharactor {
    public void fight () {}
}

class Hero extends ActionCharactor implements CanFight, CanSwim, CanFly {

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}