package com.learningjava.Methods;

/**
 *
 * @author mrg1813
 */
public class Addition {

    private int c;

    public Addition() {

    }

    public int sum(int d, int f) { // method with parameter and return type
        return c = d + f;
    }

    public void mul(int a, int b) { // method with parameter and no return type
        int s = a * b;
        System.out.println("The multiplication of number is " + s);
    }

    public void sub() { // method without return type and parameter
        int x = 20;
        int y = 10;
        int z = x - y;
        System.out.println("The subtraction of number is: " + z);
    }

    public int divide() { // method without paramter and return type
        int m = 20;
        int n = 10;
        int div = m / n;
        return div;
    }

}
