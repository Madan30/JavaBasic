
package com.learningjava.Constructor;

/**
 *
 * @author mrg1813
 */
public class Student {
    private int id;
    public String name;
    private int age;
    
    // creating default constructor
    public Student(){
        
    }
    
    // creating parameter constructor
    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
        
    }
    
    public void showStudent(){
        System.out.println("Name" + name + " Age " + age + " id " + id);
    }
    
}
