package session_12thNov2022_12thClass;

public class Execution {
	
	public static void main(String[] args) {
		
		GrandParent qp = new GrandParent(); //create an object for GrandParent
		qp.gold();
		qp.cash();
		
		Parent parent = new Parent();//create an object for parent
		parent.burgalow(); //Uni/Single Level Inheritance (Super Class to)
		parent.farmhouse();
		parent.gold();
		parent.cash();
		
		Child child = new Child();// create an object for child
		child.guitar(); //Multi-Level (GrandParent to Parent to Child) Inheritance
		child.superCar();
		child.burgalow();
		child.farmhouse();
		child.gold();
		child.getClass();
	}
	//child.box(); cannot extend a Private method of the parent class.

}
