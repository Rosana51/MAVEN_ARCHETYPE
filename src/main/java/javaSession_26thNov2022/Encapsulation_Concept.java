package javaSession_26thNov2022;

public class Encapsulation_Concept {
//Encapsulation is to make sure that "sensitive" data is hidden from users.
//Encapsulation is a mechanism to store variables and methods of a class together.
//first 1. declare Class variables/ attributes as private. 2. provide public "get" and
//"set" methods to access and update the value of a private variable.
	
	private String name; //declare instance variables as private
	private int age;
	
	public int getAge() {  //create 2 methods age and name
		return age;  //create return methods for age and name
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int newAge) { //retrieved
		age = newAge;
	}
	
	public void setName(String newName) {
		name = newName;
	}

	
}
