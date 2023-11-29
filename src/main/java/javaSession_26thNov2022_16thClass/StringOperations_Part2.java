package javaSession_26thNov2022_16thClass;

public class StringOperations_Part2 {

	public static void main(String[] args) {
		// Strings can be updated using methods:replace(); replaceFirst(); replaceAll().
//replace() - method we can choose to replace the old character by new character 
		String S1 = "I am learning Selenium"; //write the string   
		System.out.println(S1.replace("am", "am not"));//and replace the character.
		//It prints I am not learning Selenium.
		
		String S2 = "Can an animal run";//
		System.out.println(S2.replace("an","some"));//it replaces all of the an for some.
	//it prints Csome some someimal run. If we replace Can for some its Can an animal run.

//replaceFirst()- method it will replace the first instance of the an.
		System.out.println(S2.replaceFirst("an","some"));
 //it prints, Csome an animal run. it only changes Can the rest of the characters its ignored.

//replaceAll() - method will replace everything.
		System.out.println(S2.replaceAll("an","some"));//prints:Csome some someimal run.
//replaceAll() can work with regular expressions whereas replace() cannot. 		
//Regular expression replaces all the an for the add characters and removes the spaces
		System.out.println(S2.replaceAll("an(.)","add"));//with this expression ( . )
         // It prints: Caddaddaddmal run.
		System.out.println(S2.replaceAll("an(.*)","add"));//it prints: Cadd
		
		// Strings can be searched using certain method
//indexOf(); lastIndexOf(); charAt(); contains(); endsWith(); startsWith()
//indexOf()- method returns the position of the first occurrence of the specified character
	//or string in a specified string.
		String S3 = "Seleniumefefefe"; //line 32 to 38 String S3 = Selenium.
		System.out.println(S3.indexOf(5)); //*Any integer will always return -1*.
		System.out.println(S3.indexOf('m'));//prints 7. it starts counting from zero m=7
		System.out.println(S3.indexOf("ium")); //prints 5, it starts from zero ium=5
		
//lastIndexOf()- method picks the last character value, and starts counting from zero.
		System.out.println(S3.lastIndexOf('e')); //value is e=3 if we choose m is = to 7.
		
//charAt()- method returns the char value of a character in a string at a given/specified 
          //index. We use the String S3 Seleniumefefefe
		System.out.println(S3.charAt(14));//prints e, 14 = e.
		
//contains() - method checks whether a string contains a sequence of character, then it 
	//returns true if the characters exist and false if is not. String S3 Seleniumefefefe
		System.out.println(S3.contains("f"));//prints true
		
//endsWhith() - method is a convenience method that checks if a String ends with another
		//given string. it could be either true or false. String S3 Seleniumefefefe
		System.out.println(S3.endsWith("fefe"));//prints true.
		
//startsWith() - method checks whether a string starts with the specified character(s)
	//it prints true if the value is true and false if is not. String S3 Seleniumefefefe
		System.out.println(S3.startsWith("Sele")); // prints True.
		
//Case conversion methods- we have the toUpperCase() and toLowerCase methods.
//toUpperCase()- method converts a string to upper case letters.
		String S4 = "DancingmonKEY"; 
		System.out.println(S4.toUpperCase());	
//toLowerCase - method converts a string to lower case letters.
		System.out.println(S4.toLowerCase());
		
//Type Conversion methods - are the valueOf() and toChartArray() methods.
//valueOf() - method converts different types of values into string, example:
		int i = 1;
		int j = 2;
		System.out.println(i + j); //it prints 3.
		
		String S5 = String.valueOf(i); //*converts primitive data type into to String.
		String S6 = String.valueOf(j); 
		System.out.println(S5);//it prints 1.
		System.out.println(S6);//it prints 2.
		System.out.println(S5 + S6);//it prints 12, because it converts the data types to Strings
		
//toChartArray() - method converts this string into character array. It returns a newly created
		//character array. Use String S4 "DancingmonKEY"
		char[] ch = S4.toCharArray();
		System.out.println(ch);
		
	}
	
	
}
