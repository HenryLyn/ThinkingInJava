package top.linhuarui.thinking_in_java.chapter7.section5.s2;

/**
* @author LHR
* @date 2018/8/23
* @desc Extending an interface with inheritance
* @version 1.0
* @modify
*   @date
*/
public class HorrorShow {
    static void u (Monster b) {
        b.menace();
    }

    static void v (DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    public static void main (String[] args) {
        DragonZilla if2 = new DragonZilla();
        u(if2);
        v(if2);
    }
}

interface Monster {
    void menace ();
}

interface DangerousMonster extends Monster {
    void destroy ();
}

interface Lethal {
    void kill ();
}

class DragonZilla implements DangerousMonster {

    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood ();
}