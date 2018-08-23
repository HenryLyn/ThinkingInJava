package top.linhuarui.thinking_in_java.chapter7.section2.s2;

/**
* @author LHR
* @date 2018/8/23
* @desc Polymorphism in java
* @version 1.0
* @modify
*   @date
*/
public class Shapes {
    public static Shap randShap () {
        switch ((int) (Math.random() * 3)) {
            default:// To quite the compiler
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

    public static void main (String[] args) {
        Shap[] s = new Shap[9];

        // Fill up the array with shapes;
        for (int i = 0; i < s.length; i++) {
            s[i] = randShap();
        }

        // Make polymorphic method calls:
        for (int i = 0; i < s.length; i++) {
            s[i].draw();
        }
    }
}

class Shap {
    void draw () {}
    void erase () {}
}

class Circle extends Shap {
    @Override
    void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    void erase() {
        System.out.println("Circle.erase()");
    }
}

class Square extends Shap {
    @Override
    void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    void erase() {
        System.out.println("Square.erase()");
    }
}

class Triangle extends Shap {
    @Override
    void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    void erase() {
        System.out.println("Triangle.erase()");
    }
}