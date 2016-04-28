/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassMethodVariableObject;

import java.util.Scanner;
/**
 *
 * @author Edwin
 */
public class ZooKeeper {
    
       Bird pigon  ;
       
       
       
        public static void main(String[] args) {
            Bird printer = new Bird();
             
            
            printer.fly();
            printer.dive();
            printer.sing();
            printer.walk();
            
            
            Bird vulture = new Bird();
            vulture.fly();
            vulture.dive();
            vulture.sing();
            vulture.walk();
            
            
            Bird hawk = new Bird();
            hawk.dive();
            
            
            Bird swan = new Bird();
            swan.dive();
            
            BlueCar mercedes = new BlueCar();
            mercedes.horn();
            
            
            Scanner scanner = new Scanner(System.in);
            scanner.hashCode();
            
        }
}
