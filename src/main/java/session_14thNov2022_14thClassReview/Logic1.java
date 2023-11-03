package session_14thNov2022_14thClassReview;

public class Logic1 {

	public static void main(String[] args) {  //this is the main method, it is the center of
		//execution in Java Class.
		//We can create public, private, protected, and default methods.
		int i = 1;
		System.out.println(i);
		logic(); //to be able to print the logic method we have to ask the main method
		        //by calling directly or use the Class name. Same applies to the other methods.
        deposit();
        //security();
	}
//default void unknown() { //we cannot use the default access modifier to create a method 
	//It works only for creating a method inside interface.
	
	public static void logic() {
		System.out.println("There is a certain logic");
	}
	private static void deposit() {
		System.out.println("There is a certain deposit");
	}
//	private void money() { call this methods
		
	//protected void security() {
		
	//}
	
	//void unknown() {
		
	}
