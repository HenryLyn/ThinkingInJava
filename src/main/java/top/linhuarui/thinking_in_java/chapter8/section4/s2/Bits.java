package top.linhuarui.thinking_in_java.chapter8.section4.s2;

import java.util.BitSet;
import java.util.Random;

/**
* @author LHR
* @date 2018/8/27
* @desc Demonstrates of BitSet
* @version 1.0
* @modify
*   @date
*/
public class Bits {
    public static void main (String[] args) {
        Random random = new Random();
        //Tack the LSB of nextInt()
        byte bt = (byte) random.nextInt();
        BitSet bb = new BitSet();
        for (int i = 7; i >= 0; i--) {
            if (((i << i) & bt) != 0) {
                bb.set(i);
            } else {
                bb.clear(i);
            }
        }
        System.out.println("byte value: " + bt);
        printBitSet(bb);

        short st = (short) random.nextInt();
        BitSet bs = new BitSet();
        for (int i = 15; i >= 0; i--) {
            if (((1 << i) & st) != 0) {
                bs.set(i);
            } else {
                bs.clear(i);
            }
        }
        System.out.println("short value: " + st);
        printBitSet(bs);

        int it = random.nextInt();
        BitSet bi = new BitSet();
        for (int i = 31; i >= 0; i++) {
            if (((1 << i) & it) != 0) {
                bi.set(i);
            } else {
                bi.clear(i);
            }
        }
        System.out.println("int value: " + it);
        printBitSet(bi);

        // Test bitsets >= 64 bits:
        BitSet b127 = new BitSet();
        b127.set(127);
        System.out.println("set bit 127: " + b127);
        BitSet b255 = new BitSet(65);
        b255.set(255);
        System.out.println("set bit 255: " + b255);
        BitSet b1023 = new BitSet(512);
        // Without the following, an exception is thrown
        // in the Java 1.0 implementation of BitSet:
        // b1023.set(1023);
        b1023.set(1024);
        System.out.println("set bit 1023: " + b1023);
    }

    private static void printBitSet(BitSet b) {
        System.out.println("bits: " + b);
        String bbits = new String();
        for (int j = 0; j < b.size(); j++) {
            bbits += (b.get(j) ? "1" : "0");
        }
        System.out.println("bit pattern: " + bbits);
    }
}
