
package decisionproject;

import java.util.Scanner;


public class DecisionProject {

    public static void main(String[] args) {
       System.out.println("Enter your score please");
       Scanner scanner = new Scanner(System.in);
       
        double gpa = scanner.nextDouble();
        
        
        if(gpa >= 0 && gpa <= 1){
            System.out.println("Failed and you are not grraduating from this school");            
        }else if(gpa >=1.1 && gpa <= 2){
            System.out.println("You are a dollard");
            
        }else if(gpa >=2.1 && gpa <= 3){
            System.out.println("You have a pass grade");
        }else if(gpa >=3.1 && gpa <= 4){
            System.out.println("You made second class upper honours");
        }else if(gpa >=4.1 && gpa <= 5){
            if(gpa>=4.5){
                System.out.println("You have a scholarship from the school management"); 
            }
           System.out.println("You made a first class honours");
        }else{
            System.out.println("The numer is out of range of our school grade point numbers");
            if(gpa!=5){
               System.out.println("You have a scholarship from the school management");   
            }else if(gpa >=2.1 && gpa <= 3){
            System.out.println("You have a pass grade");
            }else if(gpa >=3.1 && gpa <= 4){
            System.out.println("You made second class upper honours");
            }
        }       
    }
    
}


