package com.learningjava.Constructor;

/**
 *
 * @author mrg1813
 */
public class TestStudent {

    public static void main(String agrs[]) {

        // A constructor initializes an object when it is created. 
        //It has the same name as its class and is syntactically similar to a method.
        Student s = new Student(1, "Good", 12);
        s.showStudent();
    }

}
