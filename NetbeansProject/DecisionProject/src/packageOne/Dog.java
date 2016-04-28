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
public class Dog {
    
    private String tailShape;
    private int numberOfLegs;
    private double dogSpeed;
    private boolean isColourBlackOrWhite;
    private double distance ;
    
    public Dog(double dogSpeed, int numberOfLegs, double distance){
        this.dogSpeed = dogSpeed;
        this.numberOfLegs = numberOfLegs;
          this.distance = distance;
    }
    
    public double computeDogTime(){
       double runTime = distance/dogSpeed;
       return runTime;
    }
    
    public double getDistanceByLegs(){
        double time = computeDogTime();
        double distnaceByLegs = numberOfLegs * time;
        return distnaceByLegs;
    }
    
    public void setDogSpeed(double dogSpeed){
        this.dogSpeed = dogSpeed;
    }
    
    public void setNumberOfLegs(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }
    
    public void setDistance(double distance){
        this.distance = distance;
    }
    
}
