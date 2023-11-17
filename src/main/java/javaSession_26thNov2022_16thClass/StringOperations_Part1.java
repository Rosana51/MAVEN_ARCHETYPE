package javaSession_26thNov2022_16thClass;

public class StringOperations_Part1 {

	public static void main(String[] args) {
		//Determine the length of null
		String S0 = null;
		//System.out.println(S0.length()); // it throws a NullPointerException
		
		// Determine the length of the String
		String S1 = "I am learning Automation with Java Selenium";
		System.out.println("Length of S1 is : " + S1.length()); //it prints 43
		
//isEmpty() -This method should return true if the String is empty, or return false if is not.
		String S2 = ""; //is Empty returns boolean, true or false.
		System.out.println(S2.isEmpty()); // it prints true because the string is empty.
	    String S3 = "Hello";
	    System.out.println(S3.isEmpty());//it returns false because we enter a value "Hello".
	    
//trim() - this method removes the blank spaces before and after the String.
	    String S4 = "   I am Working    "; //first give 3 spaces, then 4 spaces = 7spaces
	    System.out.println(S4.length()); //it prints 19. technically there are 12 spaces
	    String trimmedvalue = S4.trim();
	    System.out.println(trimmedvalue);
	    System.out.println(trimmedvalue.length());//It prints 12.
	    
//Use trim() and length() method together it is allowed, but NOT allowed length().trim()
	    String S5 = "   I am working very hard      "; //first 3 spaces then 6 spaces = 9spaces.
	    System.out.println(S5.length()); // It prints 31
	    int trimmedValueThenLength = S5.trim().length(); //use trim and length method together.
	    System.out.println(trimmedValueThenLength); //it prints 22.

//Comparing two Strings. equals() - this method returns boolean (true or false).
	    String S6 = "Python";
	    String S7 = "Java";
	    System.out.println(S6.equals(S7));//it returns false.
	    
//equalsIgnoreCase() - returns boolean as well.
	    String S8 = "HelloWORLD";
	    String S9 = "helloworld"; //it will ignore the lower and upper case
	    System.out.println(S8.equalsIgnoreCase(S9)); //and it returns true.
	    
//compareTo() - This method 
	    String S10 = "I am going out";
	    String S11 = "I am comming home";//it prints 4 because it takes the unicode value 
	    System.out.println(S10.compareTo(S11)); //and compares those values .
//CompareTo String S12 to String S13.    
	    String S12 = "a"; //the unicode value of lower case a is 97
	    String S13 = "A";//the unicode value of upper case is 65
	    System.out.println(S12.compareTo(S13)); //it prints 32. the value is 97-65= 32
	    
//CompareToIgnoreCase() since we are comparing ignoring case, it compares two equal values.
	    System.out.println(S12.compareToIgnoreCase(S13));//And returns 0.
	   
//Concat() - method concatenates values and returns a new value
	    String S14 = "Dummy";
	    String S15 = "Value";
	    String S16 = S14 + S15 ;
	    System.out.println(S16);
	    String S17 = "Horse"; //1 Object it is created in the SCP = SLP location.
	    String S18 = S17.concat("White"); //it doesn't concatenate
	    System.out.println(S17);//it prints Horse, it doesn't chance the value to white.
	    System.out.println(S18);//it prints HorseWhite. 

//join() - method joins String values.
	    String S19 = "Mercedes";
	    String S20 = "Jaguar";
	    String S21 = "Audi";
	    System.out.println(String.join("/", S19, S20, S21));
	    //to print, add forward slash to separate the values.
	    
//substring() - method is a part of a String or it can be said subset of the String.
//there are two variants the int startIndex and int startIndex, int endIndex.
	    String S22 = "ToyotaHondaNissan";
	    System.out.println((S22.substring(0, 17))); //use the int startIndex, int endIndex.
//the indexing starts at 0 and the total words in String S22 are 17. it prints all the letters.

	}
	
	

}
