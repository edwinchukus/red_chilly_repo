/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassMethodVariableObject;

/**
 *
 * @author Edwin
 */
public class Bird {
    
    
    public  String birdName = "Eagle";
    public  boolean hasTwoLegs = true;
    public  double distanceToFly = 1.2;
    public  char bloodGroup = 'A';
    public  int birdAge = 3;
 
    

    
    public void fly(){
        System.out.println("Yes I am an "+birdName+ " and I can fly as a bird");
        System.out.println(birdName + " "+hasTwoLegs );
    }

    public void walk(){
        System.out.println("I can walk as a bird");
        System.out.println("Does this bird have a leg? : "+hasTwoLegs);
        System.out.println(birdName + " "+hasTwoLegs+ " "+ distanceToFly+ " "+ bloodGroup+ " "+birdAge );
    }


    public void sing(){
        System.out.println("I can sing as a bird");
        System.out.println(birdName + " "+hasTwoLegs+ " "+ distanceToFly+ " "+ bloodGroup+ " "+birdAge );
    }

    public void dive(){
        System.out.println("I can dive as a bird");
        System.out.println(birdName + " "+hasTwoLegs+ " "+ distanceToFly+ " "+ bloodGroup+ " "+birdAge );
    }

    

}
