package com.learningjava.DataTypes;

/**
 *
 * @author mrg1813
 */
public class DataTypes {

    public static void main(String args[]) {

        // there are two types of data
        // primitive data types: char, int, float, double, long, boolean, byte and short 
        // primitive datatypes: Integers--> int, short, byte, long: floating: float, double
        // character datatypes: char
        System.out.println("**********************Primitives data types in java*********************");
        int num = 20;
        System.out.println("Integer number is: " + num);

        float flt = 22F;
        System.out.println("Floating number is: " + flt);

        byte byt = 100;
        System.out.println("Byte number is: " + byt);

        short st = 200;
        System.out.println("Short number is: " + st);

        double dnum = 20.33;
        System.out.println("Double number is: " + dnum);

        char ch = 'a';
        System.out.println("Character is: " + ch);

        // non primitive data types: the reference types because they refer object, string, array, classes, interface
        System.out.println("**********************Non primitives data types in java*************************************");

        String str = "Nepal";
        System.out.println("String is: " + str);

        int[] arr = new int[5];
        arr[1] = 2;
        arr[2] = 1;
        arr[3] = 9;
        arr[4] = 7;
        // arr[5]=34
        System.out.println("Arrays in java");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //Data types are especially important in Java because it is a strongly typed language.
        //This means that all operations are type-checked by the compiler for type compatibility.
    }

}
