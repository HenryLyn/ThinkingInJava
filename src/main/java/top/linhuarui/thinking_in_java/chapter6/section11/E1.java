package top.linhuarui.thinking_in_java.chapter6.section11;

/**
* @author LHR
* @date 2018/8/23
* @desc  用默认构建器（空自变量列表）创建两个类：A和 B，令它们自己声明自己。
 * 从A继承一个名为 C 的新 类，并在C 内创建一个成员B。
 * 不要为C 创建一个构建器。创建类C 的一个对象，并观察结果
* @version 1.0 
* @modify 
*   @date 
*/
public class E1 {
    public static void main (String[] args) {
        C c = new C();
    }
}

class A {
    A () {
        System.out.println("Create Class A");
    }
}

class B {
    B () {
        System.out.println("Create Class B");
    }
}

class C extends A{
    B b = new B();
}