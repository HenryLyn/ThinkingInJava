package top.linhuarui.thinking_in_java.chapter7.section6.s2;

/**
* @author LHR
* @date 2018/8/23
* @desc A method that returns an anonymous inner class.
* @version 1.0
* @modify
*   @date
*/
public class Parcel6 {
    public Contents cont () {
       return new Contents() {
           private int i = 11;

           @Override
           public int value() {
               return i;
           }
       }; // Semicolon required in this case
    }

    public static void main (String[] args) {
        Parcel6 p = new Parcel6();
        Contents c = p.cont();
    }

}
