package top.linhuarui.thinking_in_java.chapter6.section3;

/**
* @author LHR
* @date 2018/8/22
* @desc Combining composition & inheritance
* @version 1.0
* @modify
*   @date
*/
public class PlaceSetting extends Custom {
    Spoon sp;
    Fork frk;
    Knife kn;
    DinnerPlate pl;

    PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("PlaceSetting constructor");
    }

    public static void main (String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}

class Plate {
    Plate (int i) {
        System.out.println("Plate constructor");
    }
}

class DinnerPlate extends Plate {

    DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate constructor");
    }
}

class Utensil {
    Utensil (int i) {
        System.out.println("Utensil constructor");
    }
}

class Spoon extends Utensil {

    Spoon(int i) {
        super(i);
        System.out.println("Spoon constructor");
    }
}

class Fork extends Utensil {

    Fork(int i) {
        super(i);
        System.out.println("Fork constructor");
    }
}

class Knife extends Utensil {

    Knife(int i) {
        super(i);
        System.out.println("Knife constructor");
    }
}

// A cultural way of doing something:
class Custom {
    Custom (int i) {
        System.out.println("Custom constructor");
    }
}