package JavaSessions;

public class CallingMethods {
// calling both static and void methods from methods
// we are creating 4 methods and trying to call from one to another.
	// we can call from one method to another as all the methods are
	//interconnected with the objects created in the heap memory
	// we can call from static to void but not void to static as void is objectified.
	
	public void m1() {
		System.out.println("calling m1");
		m2();
	}
public void m2() {
	System.out.println("calling m2");
	m3();
	}
public void m3() {
	System.out.println("calling m3");
	m4();
}
public void m4() {
	System.out.println("calling m4");
}
public static void s1() {
	System.out.println("calling s1");
s2();
}
public static void  s2() {
	System.out.println("calling s2");
	s3();
}
public static void s3() {
	System.out.println("calling s3");
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingMethods cm =new CallingMethods();
		cm.m1();
		//Static memory does not need to be objectified as it is stored in metaspace or CMA
		s1(); // or CallingMethods.s1();
	}

}
