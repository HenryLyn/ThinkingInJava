package top.linhuarui.thinking_in_java.chapter8.section7.s5;

import top.linhuarui.thinking_in_java.chapter8.section7.s1.Collection1;

import java.util.*;

/**
* @author LHR
* @date 2018/8/31
* @desc Demonstrates performance differences in Lists
* @version 1.0
* @modify
*   @date
*/
public class ListPerformance {
    private static final int REPS = 100;

    private abstract static class Tester {
        String name;
        int size; // Test quantity

        Tester (String name, int size) {
            this.name = name;
            this.size = size;
        }

        abstract void test (List a);
    }

    private static Tester[] tests = {
            new Tester("get", 300) {
                @Override
                void test(List a) {
                    for (int i = 0; i < REPS; i++) {
                        for (int j = 0; j < a.size(); j++) {
                            a.get(j);
                        }
                    }
                }
            },
            new Tester("interation", 300) {
                @Override
                void test(List a) {
                    for (int i = 0; i < REPS; i++) {
                        Iterator it = a.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
            },
            new Tester("insert", 1000) {
                @Override
                void test(List a) {
                    int half = a.size() / 2;
                    String s = "test";
                    ListIterator it = a.listIterator();
                    for (int i = 0; i < size * 10; i++) {
                        it.add(s);
                    }
                }
            },
            new Tester("remove", 5000) {
                @Override
                void test(List a) {
                    ListIterator it = a.listIterator();
                    while (it.hasNext()) {
                        it.next();
                        it.remove();
                    }
                }
            }
    };

    public static void test (List a) {
        // A trick to print out the class name:
        System.out.println("Testing " + a.getClass().getName());
        for (int i = 0; i < tests.length; i++) {
            Collection1.fill(a, tests[i].size);
            System.out.print(tests[i].name);
            long t1 = System.currentTimeMillis();
            tests[i].test(a);
            long t2 = System.currentTimeMillis();
            System.out.println(": " + (t2 - t1));
        }
    }

    public static void main (String[] args) {
        test(new ArrayList());
        test(new LinkedList());
    }

}
