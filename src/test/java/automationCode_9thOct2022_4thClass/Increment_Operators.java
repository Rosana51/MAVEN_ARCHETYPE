package automationCode_9thOct2022_4thClass;

public class Increment_Operators {

	public static void main(String[] args) {
		// Increment and Decrement
		// a++ post increment -increments the value of the a variable by one
		// b will hold the value of the expression
		// ++a pre increment -increments the value of the a variable before using an expression 
		int a = 5;
		int b = a++ + a++ + ++a - a-- - --a - --a; // a=5  b=0
		 //a     6     7     8     7     6      5
		// b     5  +  6  + 1+7 -  8  -  6   -  5
		int c = b++ + ++b + b++ - b-- - --b; // b=1 c=0
		// b     1      2     3    2     1
		// c     0   +  2  +  2  - 3   -  1
		int d = c++ + c++ + ++c - c-- - --c; // c=1  d=0
		// c     1     2     3     2     1
		// d     0  +  1  +  3  -  3  -  1
		System.out.println(a); //5
		System.out.println(b); //1
		System.out.println(c); //1
		System.out.println(d);  //0
		
		int e = 12;
		int f = e++ + ++e - --e - e++ + e++;  //e=15   f=14
		  //e    13    14    13    14    15
		  //f    12 +  13 -  12 -  13 +  14
		int g = f++ + ++f - f-- - --f +  ++f; //f=15  g=15
		// f     16   17    15     14     15 
		// g     15 + 17  - 17   - 15  +  15 
		int h = g++ + ++g - --g  - g-- + g++; // g=16   h=15 
		 // g    16    17    16     15    16
		 // h    15  + 16  - 15  -  16 +  15
		
		System.out.println(e);//15
		System.out.println(f);//15
		System.out.println(g);//16
	    System.out.println(h);//15
		
		int i = 5;
		int j = i++ + ++i - --i - i-- + ++i;  // i=6  j=6
		 // i    6     7     6     5     6
		 // j    5  +  7   - 6  -  6  +  6 
		int k = j-- - ++j + j++ - --i - ++i; // i=6   j=7    k= -5 
		 // i                      5     6  
		 // j   5      6     7     6     7
		 // k   6  -   6  +  6   - 5   - 6
		int l = --k + i++ + ++j - --k + ++k;  //i=7    j=8   k=-6 l=
		 // i          7
		 // j                8
		 // k  + -5              - -4  + -5
		 // l  + -6  + 7  +  8  - -6  + -7           
	    
	    System.out.println(i); // 7
		System.out.println(j); // 8
		System.out.println(k); // -6
	    System.out.println(l); // ??
	    
	    // try post increment 
	    
	    int m = 1;
	    int n = m++;  //m value is 1 and increments by 1 m=2
	    int o = n++; // n takes the value of m 1 and increments by 1 n=2
	    int p = o++; //o takes the value of n 1 and increments by 1 o=2
	                 // p takes the value of o 1 so p=1    
	    System.out.println(m); // 2
		System.out.println(n); // 2
		System.out.println(o); // 2
	    System.out.println(p); // 1
	    // try pre increment
	    int q = 1;
	    int r = ++q;  //q is 1 and increments itself by 1 the latest value of q=2
	    int s = ++r; //r takes the latest value of q=2 and increases itself by 1 r=3  
	    int t = ++s; //s takes the latest value of r=3 and it increases itself by 1 s=4
	    //t takes the latest value of s=4 and t=4
	    System.out.println(q); // 2
		System.out.println(r); // 3
		System.out.println(s); // 4
	    System.out.println(t); // 4
	    System.out.println("**************************************************************");
        
	    int u = 1; //video time 4:01  clear
	    int v = u++ + ++u; //u=3  v=4
	     // u    2      3
	     // v    1  +  1+2  v picks up the value of u=1 
  //then it increases by 1 and gets the latest value of u=2 adding those values v=4
	    int w = ++v + v++; //v=6  w= 10
	    //  v    5     6
	    //  w   1+4  + 5
	    int x = w++ + ++w + w++ + u++; // u=4 v=6 w=13  x=37
	    //  u                       4
	    //  w    11   `12    13  
	    //  x   10  +  1+11 + 12 + 3
	    
	        System.out.println(u); // 4
	 		System.out.println(v); // 6
	 		System.out.println(w); // 13
	 	   System.out.println(x); // 37
	}

}
