package buyer;

public class AnimalClass {
	
private String name1 =  "Cattle";  
private String name2;
private String name3 ;


public AnimalClass(String name1,String name2,String name3){
	this. name1 = name1;
	this.name2 =  name2;
	this.name3=   name3;
	
}	

public void showvalues(){
	System.out.println("My name is " + name1 +" and I can run" );
}
public void showvalues1(){
	
	System.out.println("My name is " + name2 + "and I can walk" );
}
	public void showvalues2(){
		System.out.println("My name is " + name3 + " and I can jump" );
	}
	



//public void run(){
//	System.out.println("my name is Goat and can run");
	
	

//
//public void walk(){
//	System.out.println("My name is Goat and i can walk");
//	
//}
//public void talk(){
//	System.out.println("My name is Sheep and I can talk");
//	
//}
public void jump(){
	System.out.println("my name is goat and can jump");	
}


}

