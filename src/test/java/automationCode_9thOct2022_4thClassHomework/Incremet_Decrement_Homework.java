package automationCode_9thOct2022_4thClassHomework;

public class Incremet_Decrement_Homework {

	public static void main(String[] args) {
		// Week-4 Homework Increment Decrement
		int i = 1;// j=1 confuse???
		int j = ++i   -   --i;  // i=1  j=1 
		 // i    2         1
		 // j    1+1  -    1  = 1
		int k = j-- - --i + i-- - --j; // i=1  j=1  k=1
		 // i          1   ? 1  
		 // j   1   -  1  +  1  -  0
		 // k   1   -  1  +  1  -  0
		//int l = --k - k-- + i-- - --i + j++ - --j;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);


	}

}
