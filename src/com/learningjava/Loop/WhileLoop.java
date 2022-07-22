package com.learningjava.Loop;

/**
 *
 * @author mrg1813
 */
public class WhileLoop {

    public WhileLoop() {

    }

    public void printNumber(int number) {
        int n = 0;
        while (n <= number) {
            System.out.println("Printed number is: " + n);
            n++;

        }
    }
}
