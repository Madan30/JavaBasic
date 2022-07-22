
package com.learningjava.AccessModifier;

/**
 *
 * @author mrg1813
 */
public class TestAccessModifiers  {
    public static void main(String args[]){
        AccessModifier acm = new AccessModifier();
        // acm.number --> i cannot access the private modifers in another class
        System.out.println(acm.name);
        
        System.out.println(acm.c);
        
      
    }
    
}
