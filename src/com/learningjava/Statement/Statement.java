package com.learningjava.Statement;

/**
 *
 * @author mrg1813
 */
public class Statement {

    public Statement() {

    }

    public void getCitizen(int age) {
        if (age >= 16) {
            System.out.println("You can get citizen");
        } else {
            System.out.println("Not allowed age must be 16");
        }
    }

    public int compareNumber(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest Number");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest Number");
        } else {
            System.out.println(c + " is the largest Number");
        }

        return 0;
    }

}
