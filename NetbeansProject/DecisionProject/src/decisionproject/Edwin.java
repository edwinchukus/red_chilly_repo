/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisionproject;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class Edwin {
    
    
    public static void main(String[] args) {
        
     
       System.out.println("Enter your name");
       Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        
        if(name.equalsIgnoreCase("Edwin")){
            System.out.println("He is the tutor");
        }else{
            System.out.println("He/she is a student then");
        }
        
        
    }
}
