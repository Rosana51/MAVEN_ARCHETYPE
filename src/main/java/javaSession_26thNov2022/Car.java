package javaSession_26thNov2022;

public class Car extends Vehicle { //extend the Car Class to the Vehicle Class
	
//Vehicle is the parent class and car is the child class,
	
    int maxSpeed = 120; // Write same variable as the Vehicle with different speed.
    
	public static void main(String[] args) {	
		
		Car child = new Car(); //create the Object of the Child Class.
		child.display();
	}
	 //the super Keyword keyword, it refers to the parent Class (Vehicle).
	public void display() {  
		System.out.println("Maximum Speed is  : " + super.maxSpeed);
	}//It prints, Maximum Speed 100; the value of the parent class variable.

}
