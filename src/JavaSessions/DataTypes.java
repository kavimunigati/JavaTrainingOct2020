package JavaSessions;
/**
 * this is for multiple line comment
 * @author kavim
 *
 */
// only for single line comment
public class DataTypes {

	public static void main(String[] args) {
	/**
	 * there are two types of data types
	 * 1. Primitive type : where the values can be created directly
	 *   a. Boolean type which is boolean True or False
	 *   b. Numeric type
	 *     i. Character : Char
	 *     ii. integrel value: 
	 *            Integer: byte, short, int,long
	 *            Floating- point: Float and Double
	 *            float : 10.00
	 *             double : 30.33333568467
	 *         
	 *     
	 * 2. Non-primitive Data types: where values need to be created from objects and not defined.
	 *       String, array, classes, interface, objects, etc
	 * 
	 */
		//byte :
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte b =10;
		b = 20; // now the value of b is updates to 20 instead of 10 
		byte b1 =  100;
		byte b2 =-100;
		byte b3 = 0;
		byte b4 = 127; // we see red mark  as error here as  the range of byte is only upto 127
		byte age = 30; // this is as use case for using byte.
		System.out.println(b);
		//we see the yellow marking if we declare variables and dont use them any where.
				
		//short:
		//size: 2 bytes = 16 bits
		//range: -32768 to 32767
		short s = 100;
		short s1 = 30;
		short s2 =-10;
		System.out.println(s);
		System.out.println(s1);
		
		//int:
		//size: 4 bytes= 32 bits
		//range: -214783648 to 214783648
		int i =1000;
		int distance = 10000; //use case for using example  as distance
		
		//long:
		//size : 8 bytes =64 bits
		long population = 109988888;//all these are usecases for long
		long dist = 267867898;
		long phone =565689765;
		
		//float:
		//size : 4 bytes=32 bits
		//range = after . it may take upto 7 digits
		 //we should use "f" after the value for float as java
		//does not understand the point value unless we provide "f" or (float)in braces
		//and would error out with red mark
	
		float f1=12.33f;
		float f2 =100;// this is allowed in float as it is considered as 100.00
		float f3 = (float)100.99;
		
		//double:
		// size: 8 bytes =64 bits
		//range: after . it may take upto 16 digits
		double d = 12.334;
		double d1 =1000;
		
		//char:
		// size: 2 bytes = 16 bits
		//unicode chars like chinese or japnese or any language.
		//range: 0-9 and a to z, A to Z
		//Calculations for char is done as per ASCII standards
		char c = 'a';// char's must be written in single quotes and only single digits
		char c3 ='@';// any special characters are allowed
		char gender ='F'; //usecse for char
		char currency = '$'; // usecase for char
		char c4 ='c';
		System.out.println(c4 + b);//*119 as the value of 'c4 =c' in ASCII is 99 
		//and the value of b is declared in byte data type.    
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		
		System.out.println(c3);
		System.out.println(gender);
				
	//boolean:
	// size: takes around 0.999 bits which is less than 1 bit
		
	boolean bl1 =true;
	boolean bl2 = false;
	System.out.println(bl1);
	
	//String: is a default class and must be written in Cap S and value must be written
	// in "" double quotes.
	String  str = "Hello Java";
	String str1 = "100";
	String str2 = "Kavitha";
	System.out.println(str);
	
	System.out.println(4/2);//2
	System.out.println(5/2);//2 as both 5 and 2 are integers
	System.out.println(5.0/2);//2.5 as we have to give floating value to atleast one of the integers.
	System.out.println(7.0/2.0);
	
	
	
	
	
	
	
		
				
				
		
		
		
		
		
		
		
		
				
				
		
		
				
		

	}

}
