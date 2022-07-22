package com.learningjava.Loop;

/**
 *
 * @author mrg1813
 */
public class DoWhileLoop {

    public DoWhileLoop() {

    }

    public void printNum(int num) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < num);
    }

}
