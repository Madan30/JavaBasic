package com.learningjava.Loop;

/**
 *
 * @author mrg1813
 */
public class ForLoop {

    public void displayAge(int ages[]) {
     
        for (int i = 0; i < ages.length; i++) {
            System.out.println(" Age is : " + ages[i]);
        }
    }
    
    public void printId(int n){
        for(int i=0; i<=n;i++){
            System.out.println("number is: " + n);
        }
        
    }

}
