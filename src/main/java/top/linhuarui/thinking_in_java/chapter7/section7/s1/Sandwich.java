package top.linhuarui.thinking_in_java.chapter7.section7.s1;

/**
* @author LHR
* @date 2018/8/24
* @desc Order of constructor calls
* @version 1.0
* @modify
*   @date
*/
public class Sandwich extends PortableLunch{
    Bread b = new Bread();
    Cheese c = new Cheese();
    Lettuce l = new Lettuce();

    Sandwich () {
        System.out.println("Sandwich()");
    }

    public static void main (String[] args) {
        new Sandwich();
    }
}

class Meal {
    Meal () {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread () {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese () {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce () {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch () {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch () {
        System.out.println("PortableLunch()");
    }
}