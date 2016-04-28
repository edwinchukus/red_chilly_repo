/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.application;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class RunnerClass {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
//        Customer customer = new Customer();
        Nwofor customer = new Nwofor();
        
        String accountName = customer.getAccountName();
        String accountNumber = customer.getAccountNumber();
        
        double bal = customer.getOpeningBal();
     
        
        Account account = new Account(bal, accountName, accountNumber);
        System.out.println("Enter your deposit amount please");
        double deposit = scanner.nextDouble();
        account.acceptDeposit(deposit);
        double balance = account.viewAccountBalance(accountName);
        
//        double answer = account.getMaxWidrawal();
        System.out.println("Your balance "+balance);
        
    }
    
    
}
