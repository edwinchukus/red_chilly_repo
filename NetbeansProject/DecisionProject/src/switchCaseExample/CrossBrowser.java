/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchCaseExample;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class CrossBrowser {
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter FF for Firefox, CH for Chrome, IE for Internet Explorer and SF for Safari");
        System.out.println("Enter Phone Name");
        String browser = scanner.nextLine();
        
        ImplementationSC imp = new ImplementationSC();
        double ss = imp.showPhoneAmount(browser);
        System.out.print(ss);
        
    }
    
}
