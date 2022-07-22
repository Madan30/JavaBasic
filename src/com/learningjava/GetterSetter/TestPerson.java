
package com.learningjava.GetterSetter;

/**
 *
 * @author mrg1813
 */
public class TestPerson {
    public static void main(String args[]){
        
        
        // getter and setter method is required to protect the data hiding.
        Person person = new Person();
        person.setName("MG");
        person.setAge(24);
        person.setPhoneNumber("9818445147");
        
        System.out.println(person.getName());
        
        person.showPersonInfo();
    }
    
}
