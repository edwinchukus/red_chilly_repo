
package banking.application;


 
public class Customer {
    
    public double openingBalance = 200.00; 
    private double currentBalance;
    private String customerName = "Edwin Nwofor";
    private String accountNumber = "23584253";
    
    
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
