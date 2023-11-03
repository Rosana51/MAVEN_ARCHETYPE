package javaSessionString_20thNov2022_15thClass;

public class MemoryLocationsForStrings {
	//Strings are basically stored in Heap Memory
	//There are five types of memory Storage areas in java
	// 1. Heap Area[String Constant Pool / String Literal Pool (Manipulate size)]
    // 2. Method Area
	// 3. Stack Area
	// 4. Native MethodArea
	// 5. PC Register	
//whenever we use the new Keyword to create an object, it is stored in the Heap Area.
//within the Heap Area there is a special division known as String Constant Pool(SCP) or 
//called String Literal Pool (SLP) and Literal words are store here.
	public static void main(String[] args) {
		String S1 = new String(); // this is a String Object 
		String S2 = "Python";     // this is also a String Object
		String S3 = new String ("Java");
//String S1- one Object is created in the heap area. This object has no literal word.
//and The String is referred by S1.
//String S2- This String has a literal word Python and one Object is created
//then store within the (SLP/SCP). And referred by S2.
//String S3- in this String two Objects are created. The new keyword creates an Object in 
//the Heap Area. And the literal word "Java" creates another Object in the (SLP/SCP).
//The Object created in the Heap Area is referred by S3. And the Object within the SLP/SCP
//is referred by jvm internal.
		
		String S4 = new String("America");
		//2 Objects are created - 1 in HA, 1 in SLP
		String S5 = new String("Brazil");
		//2 Objects are created - 1 in HA, 1 in SLP
		String S6 = new String("America");
		//1 Object is created - 1 in HA. because America is a literal word and it already
		//exist in the SLP. The new Keyword means new Object and is created ONLY in HA.
		String S7 = "America";
		//0 Objects is created - because there is NO new Keyword. America is a literal word
		//and it already exist in the SLP. It is referred by the S7 NOT the jvm internal.
		String S8 = "India";
       //1 Object is created - the literal word India is store in the SLP.
		
		String S9 = "Labrador";
		String S10 = new String("Labrador");
// Que: Which one of these 2 examples is better to use when creating Objects for 
// designing Framework and Why? Ans: S9 has one Object created. If there is less Objects
//created in the memory the occupation is less. Therefore, the compiler takes less time
// to execute, it gets lighter and faster.
	}

}
 