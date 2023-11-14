package javaSession_26thNov2022_16thClass;


public class Immutable {

	public static void main(String[] args) {
//Strings are immutable in nature they are the only classes in Java that are immutable.
//Immutable Strings in Java guarantee that their value will not change.
		
		String S1 = new String("Welcome");//this is the original value of String
		S1.concat("Home");//Here we are trying to change the value of String.
		
		System.out.println(S1);//the output prints only Welcome
//Except, whenever we try to change something in the String Object, instead of changing it,
// it creates a new Object. We cannot see the change of the original Object when we print.
//Therefore, its being concatenated "WelcomeHome" in the Heap Area internally it does change.
	// Now concatenate To Class
	S1 = S1.concat("To Class");
	System.out.println(S1);//the output its "WelcomeTo Class" 
	//This behavior only happens with Strings.
//In this Example we have thousand of Student. which at some point all of them are studying
//Physics except Student3 that its studying Chemistry. On the database example one Physics
//Object it created for all students. Then Java will create another Object name:Chemistry.
//
	String Student1 = "Physics";
	String Student2 = "Physics";
	String Student3 = "Chemistry";
	String Student1000 = "Physics";
	
	
	}
	

}
