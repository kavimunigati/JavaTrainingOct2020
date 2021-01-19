package AbstractClassConcept;

public abstract class Page {
	
	//we can create constructors in abstract class
public Page() {
	System.out.println("page--------default constructor");
}
	// Abstract class : cannot create object of Abstract class
//we can create both abstract and non abstract methods
//abstract class does not have any body or define body in the method
// when there are both abstract and non abstract methods, it is called Partial abstraction
//we can create Final and Static methods in Abstract class
// We can achieve 0 to 100% abstraction in abstract class.
//methods are always 100% abstraction in Interface.
//

	public abstract void Title();// abstract method
	public abstract void Header();//abstract method
	public abstract void url();//abstract method
	public void dologin() {// non abstract method
		System.out.println("Page-----dologin");
	}
	public final void Logo() {//Final and non abstract method and this cannot be overridden to child class 
		System.out.println("page---------logo");
	}
	public static void Structure() {//Static and non abstract method and this cannot be overridden to child class
		System.out.println("Page-----Stracture");
	}
}
