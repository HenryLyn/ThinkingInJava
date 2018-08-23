package top.linhuarui.thinking_in_java.chapter6.section11;

/**
* @author LHR
* @date 2018/8/23
* @desc 修改练习1，使A 和B 都有含有自变量的构建器，则不是采用默认构建器。
 * 为C 写一个构建器，并在C 的构建器中执行所有初始化工作。
* @version 1.0
* @modify
*   @date
*/
public class E2 {
    public static void main (String[] args) {
        E2C c = new E2C(2);
    }
}

class E2A {
    E2A (int i) {
        System.out.println("Create Class A with i = " + i);
    }
}

class E2B {
    E2B (int i) {
        System.out.println("Create Class B with i = " + i);
    }
}

class E2C extends E2A {
    E2B  b ;
    E2C(int i) {
        super(i);
        b = new E2B(1);
    }
}