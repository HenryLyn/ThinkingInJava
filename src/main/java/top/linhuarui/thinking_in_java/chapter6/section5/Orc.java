package top.linhuarui.thinking_in_java.chapter6.section5;

/**
* @author LHR
* @date 2018/8/23
* @desc The protected keyword
* @version 1.0
* @modify
*   @date
*/
public class Orc extends Villain{

    private int j;

    public Orc(int jj) {
        super(jj);
        j = jj;
    }

    public void change (int x) {
        set(x);
    }
}

class Villain {
    private int i;

    protected int read () {
        return i;
    }

    protected void set (int ii) {
        i = ii;
    }

    public Villain (int ii) {
        i = ii;
    }

    public int value (int m) {
        return m * i;
    }
}