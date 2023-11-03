package session_12thNov2022_12thClass;

public class Student {
	//create a constructors
   //A constructor is a block of code that initializes a newly created object.
 //The constructor is called when an Object of a class is created.
//Constructor does not have a return type like void. We can use Access modifiers: private, public,
//protected and default.
//Declare the variables globally. 
	String name;
	int student_id;
	int age;
	String hobby;
	public static void main(String[]args) {
		
//create the 3 parameterize Objects. Objects are a collection of all non-static entity of the class.	
	Student S1 = new Student("Aman", 101, 9);
	System.out.println(S1.name + " " + S1.student_id + " " + S1.age);
	
	Student S2 = new Student("Raul", 102, 9);
	System.out.println(S2.name + " " + S2.student_id + " " + S2.age);
	
	Student S3 = new Student("Mona", 103, 9);
	System.out.println(S3.name + " " + S3.student_id + " " + S3.age);
	
	Student S4 = new Student("Singing"); //create a student without parameterizing then parameterized.
	System.out.println(S4.hobby);
	}
//Use parameterized Constructor (user-defined) such as:Name, student id, and age.
//because we declared local variables we can use this. keyword to call the variables locally.
    public Student(String name, int student_id, int age) {
    	this.name = name;
    	this.student_id = student_id;
    	this.age = age;	
	}
    public Student(String hobby) {    
    	this.hobby = hobby;
    
    	
    }
}
