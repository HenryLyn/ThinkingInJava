package top.linhuarui.thinking_in_java.chapter7.section10;

/**
* @author LHR
* @date 2018/8/24
* @desc 创建Rodent（啮齿动物）:Mouse（老鼠）,Gerbil（鼹鼠）,Hamster（大颊鼠）等的一个继承分级结构。
 * 在基础类中，提供适用于所有 Rodent的方法，并在衍生类中覆盖它们，从而根据不同类型的Rodent 采 取不同的行动。
 * 创建一个Rodent 数组，在其中填充不同类型的 Rodent，然后调用自己的基础类方法，看看 会有什么情况发生。
* @version 1.0 
* @modify 
*   @date 
*/
public class E1 {

    public static void main (String[] args) {
        Rodent rodent[] = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };

        for (int i = 0; i < rodent.length; i++) {
            rodent[i].bite();
        }
    }
}

class Rodent {
    public void bite() {
        System.out.println("Rodent.bite()");
    }
}

class Mouse extends Rodent {
    @Override
    public void bite() {
        System.out.println("Mouse.bite()");
    }
}

class Gerbil extends Rodent {
    @Override
    public void bite() {
        System.out.println("Gerbil.bite()");
    }
}

class Hamster extends Rodent {
    @Override
    public void bite() {
        System.out.println("Hamster.bite()");
    }
}