package JavaSessions;

import java.util.Scanner;

public class MethodsAssignment {
//2.Define a method that returns the product of two numbers entered by user
	
	//Some input some return method
/**	public int product(int a, int b) {
		System.out.println( "The product of the  two integers is" );
	int c =a*b;
	return c;
	
	}
	/**8. Write a program which will ask the user to enter his/her marks (out of 100). 
	 * Define a method that will display grades according to the marks entered as below:
	Marks        Grade
	91-100         AA
	81-90          AB
	71-80          BB
	61-70          BC
	51-60          CD
	41-50          DD
	<=40          Fail*/
	public void Getgrades(int marks) {
		if (marks<=100); {
			if (marks>=91) {
				System.out.println("grade AA");
			}
			else if (marks>=81){
			System.out.println("grade AB");
			}
			else if (marks>=71){
					System.out.println("grade BB");
			  }
			else if (marks>=61)
				{
					System.out.println(" grade BC");
				}
			else if (marks>=51)
			{
				System.out.println("grade CD");
			}
			else if (marks>=41)
			{
				System.out.println(" grade DD");
			}

			 else {
				System.out.println("Fail");
				}}}
	//5.Define a method to find out if number is prime or not.
	public String GetPrimeNumbers(int x) {
		if ( x >=1) {
			return "It is a Prime number"; 
		}
			else 	{
				return "not a prime number";
			}
		
		}

	//6. A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
	
	 public String VoteElligibility(int voter_age) {
						 
		 if(voter_age>=18) {
			 return "eligible";
		 }
		 else if(voter_age <18) {
			 return "Not eligible";
		 }
		 else {
			 return "invalid";
		 }
	 }
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int voter_age = input.nextInt();
		MethodsAssignment ma=new MethodsAssignment();
		String v= ma.VoteElligibility(voter_age);
		 System.out.println(v);
		
		
		
		//First objectify the class
		// then link the obj ref to function name
		//add is the reference name given to the return "c"  
		
        
	/**MethodsAssignment ma1=new MethodsAssignment();
	//question 1 and 2
		int p1= ma1.product(500,700);
        System.out.println(p1);
        
	//8th question
        ma.Getgrades(63);
			 
			//5th question
        String y= ma.GetPrimeNumbers(2);
			 System.out.println(y);*/
			 
		// String v1= ma.VoteElligibility(66);
		//	 System.out.println(v1);
        
        	}

}
