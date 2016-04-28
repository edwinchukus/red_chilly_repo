
package packageOne;


// Encapsulation

public class Car {
    
    private String myName;
    private boolean hasHorn;
    private String carName;
    private float petrolTank;
    private double carPrice;
    private int numTryes;
    
    public Car(boolean hasHorn, String carName, float petrolTank, double carPrice, int numTryes){
      this.hasHorn = hasHorn;
      this.carName = carName;
      this.petrolTank = petrolTank;
      this.carPrice = carPrice;
      this.numTryes = numTryes;
    }   
   
    
    public void setCarName(String carName){
        this.carName = carName;
    }
    
    
    public void setCarPrice(double carPrice){
        this.carPrice = carPrice;
    }
    
    
    public String getCarName(){
        return carName;
    }
    
    
    public boolean getHornStatus(){
        return hasHorn;
    }
    
    
    public double getTankSize(){
        return petrolTank;
    }
    
    
    public double getCarPrice(){
        return carPrice;
    }
    
    
    public int getNumberOfTyres(){
        return numTryes;
    }
    
    public void showValues(){
         System.out.println("Does it have horn "+ hasHorn);
         System.out.println("The car Name is "+ carName);
         System.out.println("The petrol Tank size is "+ petrolTank);
         System.out.println("The car was bought at "+ carPrice);
         System.out.println("This car has "+ numTryes + " tryes");
         
         
    }
    
    
    public void move(){
        System.out.println("Moving....");
    }
    
    
    public void drive(){
      System.out.println("Driving...");  
    }

    /**
     * @return the myName
     */
    public String getMyName() {
        return myName;
    }

    /**
     * @param myName the myName to set
     */
    public void setMyName(String myName) {
        this.myName = myName;
    }
    
    
    
}
