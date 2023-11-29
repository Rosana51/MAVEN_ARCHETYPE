package javaSession_26thNov2022;

public class Dog extends Animal { //extend the Animal Class

	public static void main(String[] args) {
		// This is the Child Class
		Dog d = new Dog();//Create the Dog Object 
	}
	
	Dog() { //create a non-parameterized constructor 
//The parameterized super() must always be the first statement in the body of the constructor
//of the subclass, otherwise, we get a compilation error. 
//The compiler does not call the default constructor of the superclass in this case.
		super("Romeo"); //call the supper constructor directly (parent//parameterized 
		System.out.println("This is Child class constructor");
	
	}

}
