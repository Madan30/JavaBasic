package com.learningjava.Statement;

/**
 *
 * @author mrg1813
 */
public class IfElseStatement {

    private int a;

    public IfElseStatement(int a) {
        this.a = a;
    }
    public int checkEvenOrOdd() {
        if (this.a % 2 == 0) {
            System.out.println(a + "Even number");
        } else {
            System.out.println(a + "Odd number");
        }
        return 0;
    }

}
