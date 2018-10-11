package top.linhuarui.thinking_in_java.chapter8.section8;

import java.util.Vector;

/**
* @author LHR
* @date 10/11/18
* @desc 新建一个名为Gerbil 的类，在构建器中初始化一个 int gerbilNumber（类似本章的 Mouse 例子）。为
 * 其写一个名为hop()的方法，用它打印出符合 hop()条件的 Gerbil 的编号。建一个Vector，并为 Vector 添
 * 加一系列Gerbil 对象。现在，用elementAt()方法在 Vector 中遍历，并为每个 Gerbil 都调用 hop()。
* @version 1.0
* @modify
*   @date
*/
public class E1 {

    public static void main (String[] args) {
        Vector<Gerbil> vector = new Vector<>();
        // populate gerbil
        for (int i = 1; i <= 10; i++) {
            vector.add(new Gerbil(i));
        }

        // invoke hop method
        for (int i = 0; i < vector.size(); i++) {
            vector.elementAt(i).hop();
        }
    }
}

class Gerbil {

    int gerbilNumber;

    Gerbil (int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop () {
        System.out.println("Gerbil number " + gerbilNumber);
    }
}