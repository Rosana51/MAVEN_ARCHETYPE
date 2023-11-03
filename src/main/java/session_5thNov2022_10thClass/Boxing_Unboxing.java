package session_5thNov2022_10thClass;

public class Boxing_Unboxing {

	public static void main(String[] args) {
	//Boxing (do this manually) - conversion of primitive data type to Wrapper Class Object
	//convert the int variable into a wrapper class Integer valueOf(int i) Integer. This
	//will return a wrapper class Integer.
		int x=20;
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		
		//Autoboxing automatically it will do it.
		int  a = 100;
		Integer b = a;
		System.out.println(b);
		
  //Unboxing- the Integer result is a object of wrapper class which is contain a value 50
  //we can covert this wrapper class to a primitive datatype int. Returns the conversion
  //value represented by this object after conversion type int.
		Integer result = 50;
		int newResult = result.intValue();
		System.out.println(newResult);
	//Autounboxing
		Integer marks = 90;
		int newMarks = marks;
		System.out.println(newMarks);
		
		
		
	}
}
			
 