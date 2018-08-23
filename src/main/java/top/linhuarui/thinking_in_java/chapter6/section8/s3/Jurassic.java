package top.linhuarui.thinking_in_java.chapter6.section8.s3;

/**
* @author LHR
* @date 2018/8/23
* @desc Making an entire class final
* @version 1.0
* @modify
*   @date
*/
public class Jurassic {
    public static void main (String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}

class SmallBrain {}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f() {}
}

//! class Further extends Dinosaur {}
// error: Cannot extend final class 'Dinosaur'