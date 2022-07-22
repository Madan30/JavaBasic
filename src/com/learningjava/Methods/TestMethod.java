
package com.learningjava.Methods;

/**
 *
 * @author mrg1813
 */
public class TestMethod {
    public static void main(String args[]){
        Addition add = new Addition();
       int resutl =  add.sum(20, 222);
       
       System.out.println("The sum of number is: " + resutl);
       System.out.println("**********************************************************");
       
       add.mul(22, 10);
       
        System.out.println("**********************************************************");
        
        add.sub();
        
        System.out.println("The division of number is : " +add.divide());
    }
    
}
