package javaSession_26thNov2022;

public class Test extends Encapsulation_Concept{ //extend the Test Class to encapsulation concept.

	public static void main(String[] args) {
		//In this Test Class create an Object of the parent class encapsulation c. 
		Encapsulation_Concept ec = new Encapsulation_Concept();
		ec.setName("Farhan");
		ec.setAge(20);
		System.out.println(ec.getAge());
		System.out.println(ec.getName());

	}

}
