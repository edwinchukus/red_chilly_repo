/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsStatements;

/**
 *
 * @author Edwin
 */
public class EnhancedForLoop {
    
             static int total;
             
             
    public static void main(String[] args) {
        
        int numbers [] = { 25, 35, 33, 52, 40, 36, 42, 38, 21, 23, 25};
        
        for(int num : numbers){   
            total = num + total;            
            System.out.println(total);           
        }
        
    }
    
}
