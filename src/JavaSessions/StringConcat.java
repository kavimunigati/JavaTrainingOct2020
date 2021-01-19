package JavaSessions;

public class StringConcat {

	public static void main(String[] args) {
	
		String a ="hello";
		String b = "world";
		
		int x = 30;
		int y =90;
		double d = 12.90;
		double r=30.99;
		
		char c ='c';
		char e= 'd';
		
		
	//the "+" symbol works as a addition operator for primitive data type like int and double and 
	//	as a concat operator for string or any non primitive datatypes.
	//the system printing starts from left to right
	// so, when the primitive data types are in the left the addition takes place and concats the string
	// where as if the String data types are t in the feft , all the int and double wil also be considered as string.
		
System.out.println(a + b);
System.out.println(x+y+a+b);
System.out.println(d+a+r+b);
System.out.println(d+r+x+y+a+b);
System.out.println(a+b+d+r+ (x+y));//if the primitive data is given in braces it will not be considered as string
System.out.println("good morning and " + a+b);
System.out.println("the value of " + (x+y) + " is correct");
System.out.println(c+d);// 111.9 calculated ASCII generated  values
System.out.println(x+c);// value of c is calculated as per ASCII standerds.  
	}

}
