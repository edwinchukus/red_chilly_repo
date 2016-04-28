/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageOne;

/**
 *
 * @author Edwin
 */
public class Test {
    
    public static void main(String[] args) {
        Dog ekuke = new Dog(10, 100000, 4);
//        ekuke.setDogSpeed(100);
//        ekuke.setDistance(1000);
//        ekuke.setNumberOfLegs(4);
        
        double time = ekuke.computeDogTime();
        System.out.println(" Total Dog's time spent on race "+ time);
        
        double dist = ekuke.getDistanceByLegs();
        System.out.println(" Total Dog's distance covered on race is "+dist);
        System.out.println("vhfkhnjkhghjhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        
        Dog wisky = new Dog(5000, 4, 1000000);
//        ekuke.setDogSpeed(100);
//        ekuke.setDistance(1000);
//        ekuke.setNumberOfLegs(4);
        
        double time1 = wisky.computeDogTime();
        System.out.println(" Total Dog's time spent on race "+ time1);
        
        double dist1 = wisky.getDistanceByLegs();
        System.out.println(" Total Dog's distance covered on race is "+dist1);
    }
    
}
