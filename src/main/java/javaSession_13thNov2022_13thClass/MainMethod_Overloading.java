package javaSession_13thNov2022_13thClass;

public class MainMethod_Overloading {
//Polymorphism Method Overloading 2 - 4 & 4.1
	public static void main(String[] args) { //this is the main method the center of execution in java class. 
	//(This is explained on this Class MainMethod_Overloading)
	//Criterias to attain Run (Dynamic) Polymorphism 
	//1. Achieved by Method overriding
	//2. Method name should be same, Class should be different, same arguments/parameters
		      //create a new main method that is also static.We can overload this method i
		MainMethod_Overloading.main(10);	
		main(10);
		main(args = new String[3], args = new String[4]);
	}
	public static void main(int i) {
		System.out.println("This is an int type of parameter main method");
	}
	public static void main(String [] args1,String[] args2) {
		System.out.println("This is a multiple parameters main method");
	}
}

