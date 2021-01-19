package JavaSessions;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
		int b= 20;
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a<b); 
		
		if (a>b) {
			System.out.println("hello");
		}
		else {
			System.out.println("Hi");
		};
if (true) {
	System.out.println("its not correct");
}
if (false) {//Dead code
	
	/**In Eclipse, "dead code" is code that will never be executed. ... 
	 * It's not an error, because it's still valid java, but it's a useful warning, 
	 * especially if the logical conditions are complex, and where it may not be intuitively 
	 * obvious that the code will never be executed.
	 * 
	 */
	System.out.println("its correct");	
}
/**
 * Flag variable is used as a signal in programming to let the program know that a certain condition has met.
 *  It usually acts as a boolean variable indicating a condition to be either true or false.
 * a programmer can declare boolean flag to be a true or false.
 */
Boolean flag = false;
if (flag) {
	System.out.println("a is not greater than b");
}
else {
	System.out.println("value of b is greater");
}

double marks =95.80;
if (marks<=100) {
	System.out.println("grade A");
}
if (marks<90){
System.out.println("grade B");
}
   if (marks<80){
		System.out.println("grade C");
  }
   if (marks<70)
	{
		System.out.println(" detained");
	}

 else {
	System.out.println("not applicable");
	}
	}
}

	
	
	
	


