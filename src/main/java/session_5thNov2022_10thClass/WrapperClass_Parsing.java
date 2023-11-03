package session_5thNov2022_10thClass;

public class WrapperClass_Parsing {
	//Parsing - is to read the value of one object to convert it to another type.

	public static void main(String[] args) {
		
		String price1 = "12.98";
		String price2 = "7.70";
	
		System.out.println(price1 + price2); //this will just concatenate it prints 12.987.70
		
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		
		double sum = p1+p2;
		
		System.out.println(sum);
		
		String a = "25";
		String b = "35";
		
		int val1 = Integer.parseInt(a);
		int val2 = Integer.parseInt(b);
		int result = val1+val2;
		System.out.println(result);
		
		

	}

}
