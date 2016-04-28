
package packageOne;

/**
 *
 * @author Edwin
 */
public class TestRun {
    
    public static void main(String[] args) {
        Car mercedes = new Car(true, "Mercedes Benz 2.0", 14, 14000, 4);
//        Car mercedes = new Car();
        String carName = mercedes.getCarName();
        System.out.println(carName);
        
        
        mercedes.setCarName("Toyota Camry 1.6");
        
        String carNameM1 = mercedes.getCarName();
        System.out.println(carNameM1);
        
        
        
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        
        Car volvo = new Car(false, "White Volvo 1.6", 25, 12500, 4);
//        volvo.showValues();
        
        String carName1 = volvo.getCarName();
        System.out.println(carName1);
        double carPrice1 = volvo.getCarPrice();
        System.out.println(carPrice1);
        
//        volvo.carName = "******###%%%%%%%%%%%%^^^^^^^&@*******";
//        volvo.carPrice = 956921;
        
        String carName2 = volvo.getCarName();
        System.out.println(carName2);
        
        double carPrice2 = volvo.getCarPrice();
        System.out.println(carPrice2);
        
        
        
        Car mazda = new Car(false, "Old Mazda 0.6", 15, 1000, 4);
        String name = mazda.getCarName();
        System.out.println(name);
        

    }
}
