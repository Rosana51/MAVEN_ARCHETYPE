package javaSession_13thNov2022_13thClass;

public class Poly_Overload {
	//Polymorphism Method Overloading 1 - 4 & 4.1
	public static void main(String[] args) {
	//polymorphism. Poly means many and morphism means forms
	//two types of polymorphism. 1. compile Time Polymorphism/ Static Polymorphism
	//2. Run Time Poymorphism / Dynamic Polymorphism
		
	//	(this is explained on this class Poly_Overload)
	//Criterias to attain compile (static) Time polymorphism 
	//1. achieved by Method Overloading
	//2. Method name should be the same, Class should be the same, Different Argumets/Parameters
	
	//(This is explained on the Class MainMethod_Overloading)
	//Ctriterias to attain Run (Dynamic) Polymorphism
	//1. Achived by Method overriding
	//2. Method name should be same, Class should be different, same arguments/parameters
		
		Poly_Overload obj = new Poly_Overload();
		obj.display();
		obj.display(10);
		obj.display(11,12);
		obj.display("java");
		obj.display("hello", "world");
		obj.display(new StringBuffer("anything"));
		obj.display(new StringBuilder("Anything"));
		obj.display("name", new StringBuffer("anything"), new StringBuilder("anything"));
	
	}
	public void display() {
		System.out.println("This is a non-parameterized method");
	}
	public void display(int i) {
		System.out.println("This is a single int type parameterized method");
	}
	public void display(int j, int k) {
		System.out.println("This is a multiple int type parameterized method");
	}
	public void display(String S) {
		System.out.println("This is a single String type parameterized method");
	}
	public void display(String s1, String s2) {
		System.out.println("This is multiple String type parameterized method");
	}
	public void display(StringBuffer s3) {
		System.out.println("This is a single StringBuffer type parameterized method");
	}
	public void display(StringBuilder s4) {
		System.out.println("This is a single StringBuilder type parameterized method");
	}
	public void display(String s5, StringBuffer s6,StringBuilder s7 ) {
		System.out.println("This is multiple String, StringBuffer and StringBuilder type parameterized method");
		
	}

}
