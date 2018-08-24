package top.linhuarui.thinking_in_java.chapter7.section10;

/**
* @author LHR
* @date 2018/8/24
* @desc 修改练习1，使Rodent 成为一个接口。
* @version 1.0 
* @modify 
*   @date 
*/
public class E2 {

    public static void main (String[] args) {
        Rodent2[] rodent2s = new Rodent2[3];
        rodent2s[0] = new Mouse2();
        rodent2s[1] = new Gerbil2();
        rodent2s[2] = new Hamster2();

        for (int i = 0; i < rodent2s.length; i++) {
            rodent2s[i].bite();
        }
    }
}

interface Rodent2 {
    public void bite() ;
}

class Mouse2 implements Rodent2 {
    @Override
    public void bite() {
        System.out.println("Mouse2.bite()");
    }
}

class Gerbil2 implements Rodent2 {
    @Override
    public void bite() {
        System.out.println("Gerbil2.bite()");
    }
}

class Hamster2 implements Rodent2 {
    @Override
    public void bite() {
        System.out.println("Hamster2.bite()");
    }
}