package javaSession_13thNov2022_13thClass;

public class AutomaticPromotion {
	// Polymorphism Method Overloading 3 - 4 & 4.1
//convert one datatype to another it follows the Compile Static Time Polymorphism
//Name the same, Class should be the same, Different arguments/parameters
//Write the object with the name of the class and use the object reference to see the methods
	public static void main(String[] args) {
		AutomaticPromotion ap = new AutomaticPromotion();
		ap.show(10);
		ap.show("java");
		ap.show('a');

	}
	public void show (int i) {
		System.out.println("This is an int parameter method");
	}
	public void show(String S) {
		System.out.println("This is an String parameter method");
	}
	

}
