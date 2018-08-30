package top.linhuarui.thinking_in_java.chapter8.section5;


import java.util.Vector;

/**
* @author LHR
* @date 2018/8/27
* @desc A generic sorting vector
* @version 1.0
* @modify
*   @date
*/
public class SortVector extends Vector {
    private Compare compare; // To hold the callback

    public SortVector (Compare comp) {
        compare = comp;
    }

    public void sort () {
        quickSort (0, (size() - 1));
    }

    private void quickSort (int left, int right) {
        if (right > left) {
            Object o1 = elementAt(right);
            int i = (left - 1);
            int j = right;
            while (true) {
                while (compare.lessThanOrEqual(elementAt(++i), o1) && i < j);
                while (j > 0) {
                    if (compare.lessThanOrEqual(elementAt(--j), o1)) {
                        break; // out of while
                    }
                }
                if (i >= j) {
                    break;
                }
                swap(i, j);
            }
            swap(i, right);
            quickSort(left, i - 1);
            quickSort(i + i, right);
        }
    }

    private void swap(int left, int right) {
        Object tmp = elementAt(left);
        setElementAt(elementAt(right), left);
        setElementAt(tmp, right);
    }
}
