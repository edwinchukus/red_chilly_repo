/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dot.com;

/**
 *
 * @author Edwin
 */
public class Huxley {
    
    
    private double openingBalance = 30000.00; 
    private double currentBalance;
    private String customerName = "David Huxley";
    private String accountNumber = "9994942";
    
    public Huxley(double currentBalance){
        this.currentBalance = currentBalance;
    }
    
    public String getAccountName(){
        return customerName;
    }
    
    
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public double getOpeningBal(){
        return openingBalance;
    }
    
    public double getCurrentBal(){
        return currentBalance;
    }

    
}
