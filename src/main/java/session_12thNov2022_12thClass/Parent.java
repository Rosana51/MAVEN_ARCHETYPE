package session_12thNov2022_12thClass;
// Concept of Inheritance
//Inheritance is the process by which objects of one class acquire the properties of objects of 
//another class. It supports the concepts of hierarchical classification.
//Write 2 methods for the parent. The parent can inherit the GrandParent Only.

public class Parent extends GrandParent { 
	public void burgalow() { 
		System.out.println("Parent's bungalow");
	}
	
	public void farmhouse() {
		System.out.println("Parent's farmhouse");
	}
	
	//private void box() {
	//	System.out.println("Parent's private box");
	
	
	public static void ngo() {
		System.out.println("Parent's static ngo method");
	}

}
