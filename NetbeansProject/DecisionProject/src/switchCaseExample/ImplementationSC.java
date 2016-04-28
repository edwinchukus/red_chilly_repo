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
public class ImplementationSC {
    
    
    
    
    
    public void selectABrowser(String browserName){
        switch(browserName){
            case "FF":
                System.out.println("Test running on Firefox Browser ...");
//                WebDriver driver = new FirefoxDriver();
                break;
            case "CH":
                System.out.println("Test running on Chrome Browser ...");
                break;
            case "IE":
                System.out.println("Test running on Internet Explorer Browser ...");
                break;  
            case "SF":
                System.out.println("Test running on Safari Browser ...");
                break;  
            default: 
                System.out.println("There is no such browser setup in this test; try Firefox, IE, Chrome or Safari");
                break;
        }     
        
    }
    
    
    
    
    public double showPhoneAmount(String phoneName){
            double amount = 0.0;
            if(phoneName.contains("iP")){
                amount = 1500.00;
                if(phoneName.contentEquals("iPhone 4")){
                    amount = amount - 16;
                }else if(phoneName.contentEquals("iPhone 5")){
                    amount = amount - 10;
                }else if(phoneName.contentEquals("iPhone 6")){
                    amount = amount - 5;
                }else if(phoneName.contentEquals("iPhone 6s")){
                    amount = amount - 2;
                }                
            }else if(phoneName.startsWith("Samsung")){
              amount = 1200.00;
              if(phoneName.endsWith("Galaxy 3")){
                    amount = amount - 25;
                }else if(phoneName.endsWith("Galaxy 4")){
                    amount = amount - 15.50;
                }else if(phoneName.endsWith("Galaxy 5")){
                    amount = amount - 5.25;
                }else if(phoneName.endsWith("Galaxy 6")){
                    
                }     
            }else if(phoneName.contains("Nokia".toLowerCase())){
              amount = 500.00;
              if(phoneName.contains("1")){
                    amount = amount - 25;
                }else if(phoneName.endsWith("2")){
                    amount = amount - 15.50;
                }else if(phoneName.endsWith("3")){
                    amount = amount - 5.25;
                }else if(phoneName.endsWith("4")){
                    
                }     
            }else{
                amount = 0.00;
            }
            return amount;
        }
    
}
