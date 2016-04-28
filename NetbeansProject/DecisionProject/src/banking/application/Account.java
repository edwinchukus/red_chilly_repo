
package banking.application;

public class Account {
    
    protected static double openingBalance; 
    private double currentBalance; 
    private static double maxWithrawal = 500.00;
    private String accountName; 
    private String accountNumber; 
    
    
    
    
    public Account(double openingBalance, String accountName, String accountNumber){
        this.openingBalance = openingBalance;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }
    
    
    public void transferMoney(double amount){
        
    }
    public double viewAccountBalance(String number){
        double newBalance = 0.0;
        if(number.contains(accountNumber)){
         newBalance = currentBalance;   
        }else{
          newBalance = 0.0;
        }
        return newBalance;
    }
    
    public void withrawMoney(double amount){
        
    }
    
    public void acceptDeposit(double amount){
       this.currentBalance = currentBalance + amount + openingBalance;
    }


    public double getMaxWidrawal(){
        return maxWithrawal;
    }
    
}
