package com.learningjava.Loop;

/**
 *
 * @author mrg1813
 */
public class TestLoop {

    public static void main(String args[]) {
        // A loop statement allows us to execute a statement or group of statements multiple times

        ForLoop fl = new ForLoop();
        int[] ag = new int[]{22, 12, 35, 67, 89, 34};
        System.out.println("*************************For loop***********************************");
        fl.displayAge(ag);
        
        fl.printId(10);

        System.out.println("**************************While loop***********************************");

        WhileLoop wh = new WhileLoop();
        wh.printNumber(20);

        System.out.println("**************************Do While loop***********************************");
        DoWhileLoop dw = new DoWhileLoop();
        dw.printNum(6);

    }

}
