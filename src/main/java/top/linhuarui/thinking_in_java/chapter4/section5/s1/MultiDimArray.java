package top.linhuarui.thinking_in_java.chapter4.section5.s1;

import top.linhuarui.thinking_in_java.utils.Util;

/**
* @author LHR
* @date 2018/8/22
* @desc Creating multidimensional arrays.
* @version 1.0
* @modify
*   @date
*/
public class MultiDimArray {
    public static void main (String[] args) {
        int[][] a1 = {
                {1, 2, 3, },
                {4, 5, 6, },
        };

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                System.out.println("a1[" + i + "][" + j + "] = " + a1[i][j]);
            }
        }
        // 3-D array with fixed length:
        int[][][] a2 = new int[2][2][4];
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                for (int k = 0; k < a2[i][j].length; k++) {
                    System.out.println("a2[" + i + "][" + j + "][" + k + "] = " + a2[i][j][k]);
                }
            }
        }
        // 3-D array with varied-length vectors:
        int[][][] a3 = new int[Util.randInt(7)][][];
        for (int i = 0; i < a3.length; i++) {
            a3[i] = new int[Util.randInt(5)][];
            for (int j = 0; j < a3[i].length; j++) {
                a3[i][j] = new int[Util.randInt(5)];
            }
        }
        for (int i = 0; i < a3.length; i++) {
            for (int j = 0; j < a3[i].length; j++) {
                for (int k = 0; k < a3[i][j][k]; k++) {
                    System.out.println("a3[" + i + "][" + j + "][" + k + "] = " + a3[i][j][k]);
                }
            }
        }
        // Array of non-primitive objects:
        Integer[][] a4 = {
                { new Integer(1), new Integer(2)},
                { new Integer(3), new Integer(4)},
                { new Integer(5), new Integer(6)},
        };
        for (int i = 0; i < a4.length; i++) {
            for (int j = 0; j < a4[i].length; j++) {
                System.out.println("a4[" + i + "][" + j + "] = " + a4[i][j]);
            }
        }
        Integer[][] a5;
        a5 = new Integer[3][];
        for (int i = 0; i < a5.length; i++) {
            a5[i] = new Integer[3];
            for (int j = 0; j < a5[i].length; j++) {
                a5[i][j] = new Integer(i * j);
            }
        }
        for (int i = 0; i < a5.length; i++) {
            for (int j = 0; j < a5[i].length; j++) {
                System.out.println("a5[" + i + "][" + j + "] = " + a5[i][j]);
            }
        }
    }
}
