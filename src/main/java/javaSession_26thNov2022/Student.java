package javaSession_26thNov2022;

public class Student extends Human{

	public static void main(String[] args) {
		// 
		Student child = new Student();//create the Object of the Class
		child.display(); //
		
	}
	
	public void essay() { //create 2 methods essay and display
		System.out.println("This is Child class' essay ");
	}
	public void display() {
		essay();        //This is the child class' essay, line 12
		super.essay(); //This is Parent class' essay.
		
	}

}
