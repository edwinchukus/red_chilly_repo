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
public class WAEC {
    
    public static void main(String[] args) {
        //Switch Case Statement
        
         System.out.println("Enter your browser name");
       Scanner scanner = new Scanner(System.in);
       
        
        String browser  =  scanner.nextLine();
        
        switch(browser){
            case "Firefox":
                System.out.println("The test is running on firefox broswer ...");
                break;
            case "Chrome":
                 System.out.println("The test is running on chrome broswer ...");
                break;
            case "InternetExplorer":
                 System.out.println("The test is running on firefox broswer ...");
                break;            
            default: 
                System.out.println("There is no such browser on this project, try another valid browser");                
        }
    }
    
}
