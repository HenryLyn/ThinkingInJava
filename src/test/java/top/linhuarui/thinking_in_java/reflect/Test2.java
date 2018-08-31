package top.linhuarui.thinking_in_java.reflect;

import top.linhuarui.thinking_in_java.chapter8.section7.s3.Set1;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Test2<T> {
    private Class<T> clazz;

    protected Class<?> getEntityClass() {
        ParameterizedType pt = (ParameterizedType)getClass().getGenericSuperclass();
        clazz = (Class<T>)pt.getActualTypeArguments()[0];

        return clazz;
    }

    public static void main (String[] args) {
        System.out.println(new Test2<Set1>().getEntityClass());
    }
}
class param<T1, T2> {

    class A {}
    class B extends A {}

    private Class<T2> entityClass;
    public param (){
        Type type = getClass().getGenericSuperclass();
        System.out.println("getClass() == " + getClass());
        System.out.println("type = " + type);
        Type trueType = ((ParameterizedType)type).getActualTypeArguments()[0];
        System.out.println("trueType1 = " + trueType);
        trueType = ((ParameterizedType)type).getActualTypeArguments()[1];
        System.out.println("trueType2 = " + trueType);
        this.entityClass = (Class<T2>)trueType;
        System.out.println("entityClass = " + entityClass);

        B t = new B();
        type = t.getClass().getGenericSuperclass();
        System.out.println(type);
        System.out.println("B is A's super class :" + (type instanceof ParameterizedType) + "   " + ((ParameterizedType)type).getActualTypeArguments().length);
    }

}

class ClassDemo extends param<MyClass, MyInvoke>{
    public static void main(String[] args) {
        ClassDemo classDemo = new ClassDemo();
        Class c = param.class;
        c.getFields();
        c.getMethods();
    }
}



class MyClass {

}

class MyInvoke {

}
