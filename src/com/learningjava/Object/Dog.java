package com.learningjava.Object;

/**
 *
 * @author mrg1813
 */
public class Dog {

    String name;
    int legs;
    int eyes;

    public void dogInfo() {
        System.out.println("Dog name is: " + this.name);
        System.out.println("Dog has " + this.legs + " legs");
        System.out.println("Dog has " + this.eyes + " eyes");
    }

}
