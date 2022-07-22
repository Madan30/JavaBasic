package com.learningjava.AccessModifier;

/**
 *
 * @author mrg1813
 */
public class AccessModifier {

    // java has four access type of modifiers and this access modifiers can be used in class, variables, methods, constructors
    // public-->which can be visible to world
    // default --> it can be visible to same packages default access as package-level 
    //access, because a class with default access can be seen only by classes within the same package.
    // private-->visible to class only
    // protected-->visible to packages and subclasses
    private int number = 20;
    public String name = "Madan";

    char c = 'a';

    // non access modifiers: final: final keyword means the class can’t be subclassed.In other words.
    //no other class can  ever extend(inherit from) a final class  and any attempts to do so will result in a compiler error.
    
}
