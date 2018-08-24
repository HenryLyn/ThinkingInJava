package top.linhuarui.thinking_in_java.chapter7.section6.s7;

/**
* @author LHR
* @date 2018/8/24
* @desc An inner class cannot be overriden like a method
* @version 1.0
* @modify
*   @date
*/
public class BigEgg extends Egg{
    public class Yolk {
        public Yolk () {
            System.out.println("BigEgg.Yolk()");
        }
    }

    public static void main (String[] args) {
        new BigEgg();
    }
}

class Egg {
    protected class Yolk {
        public Yolk () {
            System.out.println("Egg.Yolk()");
        }
    }

    private Yolk y;
    public Egg () {
        System.out.println("New Egg()");
        y = new Yolk();
    }
}