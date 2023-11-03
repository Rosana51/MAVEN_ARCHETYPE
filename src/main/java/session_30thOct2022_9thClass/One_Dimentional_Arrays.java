package session_30thOct2022_9thClass;

public class One_Dimentional_Arrays {

	public static void main(String[] args) {
		// TODO Declare, Create, Initialize, and Retrieve 1-D Arrays.
		
// Declare, this is a way to declare an array [] this means 1-D
		//int [] a; // popular way of writing arrays. Here a is 1-D
		//int [] a1, b1; // here both a1 and b1 are 1-D
//Create, define or determine the type of data the array will hold.
		//int [] a2 = new int [3];
//Initialize, we need to enter some values to the memory spaces.
		int [] a3 = new int [3]; // size of the array is 3 values
		a3[0] = 120;
		a3[1] = 121;
		a3[2] = 122;	
//Retrieve	
		System.out.println(a3.length); // prints 3
// other ways of Initialize are:
		int [] a4 = {120, 121, 122};
		System.out.println(a4.length); // prints 3 values
		
		int [] a5 = new int[] {10, 20, 30, 40, 50};
		System.out.println(a5.length); // prints 5 
		
		int[]a6 = {999, 888, 777, 666, 555, 444, 333, 222, 111}; //prints 9 values
		System.out.println(a6.length);
		
		for(int e=0; e<a6.length; e++) {
			System.out.println(a6[e] + " "); //It prints 999, 888, 777, 666, 555, 444, 333, 222, 111
		}
	}

}
