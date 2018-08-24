package top.linhuarui.thinking_in_java.chapter7.section7.s2;

/**
* @author LHR
* @date 2018/8/24
* @desc Testing finalize with inheritance.
* @version 1.0 
* @modify 
*   @date 
*/
public class Frog extends Amphibian{
    Frog () {
        System.out.println("Frog()");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Frog finalize");
        if (DoBaseFinalization.flag) {
            try {
                super.finalize();
            } catch (Throwable t) {}
        }
    }

    public static void main (String[] args) {
        if (args.length != 0 && args[0].equals("finalize")) {
            DoBaseFinalization.flag = true;
        } else {
            System.out.println("not finalizing bases");
        }

        new Frog(); // Instantly becomes garbage.
        System.out.println("bye!");
        // Must to do this to guarantee that all finalizers will be called:
        System.runFinalizersOnExit(true);
    }
}

class DoBaseFinalization {
    public static boolean flag = false;
}

class Characteristic {
    String s;

    Characteristic (String c) {
        s = c;
        System.out.println("Creating Characteristic " + s);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalizing Characteristic " + s);
    }
}

class LivingCreature {

    Characteristic p = new Characteristic("is alive");

    LivingCreature () {
        System.out.println("LivingCreature()");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("LivingCreature finalize");
        // Call base-class version LAST!
        if (DoBaseFinalization.flag) {
            try {
                super.finalize();
            } catch (Throwable t) {

            }
        }
    }
}

class Animal extends LivingCreature {
    Characteristic p = new Characteristic("has heart");

    Animal () {
        System.out.println("Animal()");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Animal finalize");
        if (DoBaseFinalization.flag) {
            try {
                super.finalize();
            } catch (Throwable t) {

            }
        }
    }
}

class Amphibian extends Animal {
    Characteristic p = new Characteristic("Can live in water");

    Amphibian () {
        System.out.println("Amphibian()");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Amphibian finalize");
        if (DoBaseFinalization.flag) {
            try {
                super.finalize();
            } catch (Throwable t) {}
        }
    }
}