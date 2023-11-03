package javaSessionString_20thNov2022_15thClass;

public class StringIntroduction {
//String is the most powerful Class in Java, because it is a Class, its a datatype, it is
//linear data structure, as well is known as array of characters.and has many
//operations than any other classes,"String is God of all Classed in Java"
	
//String Objects can be created using String, StringBuilder and StringBuffer. 
	public static void main(String[] args) {

		char c = '1';
		String S1 = "sfsdf945345435%";
    
		char[] c1 = {'s', 'e', 'l', 'e', 'n', 'i', 'u', 'm'};
		String S2 = new String(c1);
		System.out.println(c1);
		
		String S3 = new String();
		String S4 = "Java";
		int i=4;
//create StringBuilder that also creates String Object. Same for StringBuffer.
		StringBuilder S5 = new StringBuilder();
		StringBuffer S6 = new StringBuffer();
	}

}
