package JavaSessions;

public class Assignment {

	public static void main(String[] args) {
	/** Data Types:
		1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		Expected Output :
		Hello 
		Naveen K
   */
		System.out.println("Hello \nNaveen k");
				
		/**2. Write a Java program to print the sum of two numbers. 
            Test Data: 
              74 + 36 
         Expected Output :
              110
		*/
		
		System.out.println(74+36);
			
		/**3. Write a Java program to divide two numbers and print on the screen. 
               50/3,Expected Output :16
	 */
		System.out.println(50/3);
		
/** Write a Java program to print the result of the following operations. Change your test data accordingly.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9 
c. 20 + -3*5 / 8 
d. 5 + 15 / 3 * 2 - 8 % 3 
*/
System.out.println(-5+(8*6));//43
System.out.println((55+9) % 9);//1
System.out.println(20+(-3*5) / 8);//19
System.out.println(5 + 15 / 3 * 2 - 8 % 3 );//13
System.out.println(">>>>>>>>>>>>>>>>>>>>>");

int w= -5 + 8 * 6;
int x=(55+9) % 9;
int y= 20 + -3*5 / 8 ;
int z= 5 + 15 / 3 * 2 - 8 % 3 ;
System.out.println(w + "\n" + x + "\n" + y + "\n" + z);

/**Write a Java program to compute the specified expressions and print the output. Go to the editor
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
Expected Output:2.138888888888889
 * 
 */
//using float data type
		 float a1= 3.5f;
		  float a2= 4.5f;
		 float a3= 25.5f;
		 float a4= 40.5f;
		 float a5 = ((a3*a1-a1*a1)/(a4-a2));
		 
//float datatype to double
		 double dd = ((a3*a1-a1*a1)/(a4-a2));// when a float is converted to double the value varies after decimal.
		 System.out.println(a5);
		 System.out.println(dd);
		 //or
		 System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) );
	//double data type	 
		 double d1= 3.5;
		 double d2= 4.5;
		 double d3= 25.5;
		 double d4= 40.5;
		 double d5 = ((d3*d1-d1*d1)/(d4-d2));
		 System.out.println(d5);
		 
		 //Try to concat "Hello Selenium" with a character 't'.
		 
		 String s =" Hello senenium";
		 //char z ='t';
		 System.out.println(s + z);//Hello seneniumt
		 
		 //Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
		 //"Your Toal amount is. 3700".
		 
		 int v1=100;
		 int v2 =200;
		 int v3 =3400;
		 
		 int v4 = v1+v2+v3;
		 System.out.println("Your Total amount is:" + v4);
		 
		 //What should be the output for :
          byte b3 = 065; 
          System.out.println(b3);//53
	}

}
