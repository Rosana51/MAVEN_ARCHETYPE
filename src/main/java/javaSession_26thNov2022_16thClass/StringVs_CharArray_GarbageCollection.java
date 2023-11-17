package javaSession_26thNov2022_16thClass;

public class StringVs_CharArray_GarbageCollection {
	
//If there is a password, will you store in String or Char Array??
// Reasons to use Char over Strings to store passwords.
//1. garbage collection does not apply in String, (the memory will be keep being occupied).
//2. the password value is encoded in Char Array, but String passwords can be retrieved as it is.

//What is Garbage Collection in Java? it is the automated process of deleting
	//code(unused Objects) that is not longer need or used. 
//Objects are physical entities that Occupies memory in Java. Java's collection follow 2 way
//approach. One it will remove the unnecessary occupied memory thats not being used and or 
//will align them where it can be used.
	public static void main(String[] args) {
	
	//	String password = "Password"; //the name of password "Password", will not be deleted.
	//	password = "Password$#@!";//and if we assign new value to "Password","Password$#@!"
		
//this new value will also stay in the memory. If we change many times the password, the 
//memory will keep being occupied for multiple number of passwords.It Is Not a Good Practice
		// To Store Password Literal in Strings.
		
		String password = new String("Password#9876");
	// Use a Character Array to store password.
		char[] chpassword = new char[] {'P', 'a', 's', 's', 'w', 'o', 'r', 'd', '#', '9', '8', '7', '6'};

		System.out.println("The password in the String object is : "  + password);
		//the String password value prints as it is, and it is retrievable.
		
		System.out.println("The password in the Char Array is :" + chpassword);
		//The Character password value prints in encoded value.
		

	}

}
