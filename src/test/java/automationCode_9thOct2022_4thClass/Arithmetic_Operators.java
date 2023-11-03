package automationCode_9thOct2022_4thClass;

public class Arithmetic_Operators {
	
	// Arithmetic Operators  + - / * % ++ --

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		System.out.println(i+j);//30
		String name1 = "Karina";
		String name2 = "Mina";
		System.out.println(name1 + name2);//KarinaMina
		System.out.println(name1 + name2 +i +j);//KarinaMina1020
		System.out.println(name1 + name2 +(i + j));//KarinaMina30
		
		int a = 1;
		int b = 2;
		System.out.println("The sum of these two integers is: " + (a + b)); //3
		System.out.println(200 + 200); //4
		System.out.println(-200 -330); //530
		System.out.println(100/10);// 10
		System.out.println(2 * 2);//4
	
		int c = 1;
		int d = 2;
		System.out.println("The sum of these two integers is : " + (c+d)); // 3
		System.out.println(200 + 400);  // 600
		System.out.println(-220 - 400);  // -620
		System.out.println(200 / 10);   // 20
		System.out.println(20 * 400);   // 8000
		
		
	}
}
