package automationCode_9thOct2022_4thClass;

public class Increment_Decrement_Operators {
	
	// ++ Increments  -- Decrements
	// int i = 1;
	// i++ it is a post increment operator
	// ++i  it is a pre increment operator it is used to increment the value
	//of some variable before using it in an expression
	// i--  it is a post decrement operator
	// --i   it is a pre decrement operator

	public static void main(String[] args) {
	
		int i = 1;
	     //i++;  // the value is 2
		 //++i;  //it is a pre increment operator and the value is 2
		 //i--;  //it is a post decrement operator and the value is 0
		 //--i;   //it is a pre decrement operator and the value is 0
		 // System.out.println(i);
		int l = 2; // here l is 2   increment operator 
		int k = l++;   
		System.out.println(l); // l is 3
		System.out.println(k); // k is 2
		int m = 2; // here m is 2
		int n = ++m; 
		System.out.println(m);  //m is 3
		System.out.println(n);  //n is 3 
		
		int a = 2; // here a is 2   decrement operator 
		int b = a--;   
		System.out.println(a); // a is 1
		System.out.println(b); // b is 2
		int c = 2; // here c is 2
		int d = --c; 
		System.out.println(c);  //c is 1
		System.out.println(d);  //d is 1 

		
	}

}
