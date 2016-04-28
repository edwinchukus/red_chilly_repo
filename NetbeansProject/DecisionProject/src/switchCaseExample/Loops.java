/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchCaseExample;

/**
 *
 * @author Edwin
 */
public class Loops {
    
    
    
    public void callWhileLoop(int s){
        while(s < 20){
            System.out.println("Hello Sheriff, how are you?");
            s ++;
        }       
    }
    
    
    public void callDoWhileLoop(int e){
        do{
           System.out.println("What is going on guys?");
            e ++; 
        }while(e < 20);
    }
    
    
   public void callForLoop(int i){
       for(i = 0; i < 20; i++){
        System.out.println("Wierd?");             
       }
   }
    
   
   public void callEnhancedForLoop(String cashAmount){
       double [] amounts = {20.00, 52.00, 54.00, 85, 1000.00, 50000};
       if(cashAmount.equalsIgnoreCase("50000")){
           for (double amount : amounts){
             if(amount == 50000){
                 System.out.println(amount);
             }
           }
       }
   }
    
}
