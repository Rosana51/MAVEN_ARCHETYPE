package automationCode_9thOct2022_4thClass;

public class Concatenation_Operator {
	
	// Concatenation is joining, it is not adding
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		System.out.println(i + j); //30
		
		char c1 = 'a'; //ascii value of a lower case a=97 and 1=49
		char c2 = '1';
		System.out.println(c1 + c2);  //146
		
		String name1 = "Karina";
		String name2 = "Mina";
		System.out.println(name1 + name2);  //KarinaMina
		
		System.out.println(i + j + name1 +name2); //30 KarinaMina
		System.out.println(name1 + name2 + i + j); // KarinaMina1020
		System.out.println(name1 + name2+(i + j));  // KarinaMina30
	
		

	}

}
