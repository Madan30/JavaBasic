package com.learning.StatementQA;

import java.util.Scanner;

/**
 *
 * @author mrg1813
 */
public class PositiveNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Number is positive: " + num);
        } else if (num < 0) {
            System.out.println("Number is negative: " + num);
        } else {
            System.out.println("Number is zero: " + num);
        }
    }

}
