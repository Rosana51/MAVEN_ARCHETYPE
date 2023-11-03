package javaSession_13thNov2022_13thClass;

public class Child extends Method_Overriding {

	public static void main(String[] args) {
		Child child = new Child(); //Child acquires its own methods
		child.cash();
		child.office();
		
		//Child childp = (Child) new Method_Overriding(); //child acquires the parent's methods  
		//childp.cash();  //it refers to parent. but it doesn't work it throws an exception.
		//childp.office();
		
		Method_Overriding mo = new Method_Overriding();//parent acquires its own methods
		mo.cash();
		mo.office();
		
		Method_Overriding mp = new Child(); //parent class wants to acquire the Child's methods
		mp.cash();
		mp.office();
	}
	public void cash() {
		System.out.println("This is Child's cash method");
	}
	public void office() {
		System.out.println("This is Child's office method");
	}

}
