package JavaSessions;

public class TimeComplexity {

	public static void main(String[] args) {
		// Time complexity is used to measure the time taken to execute a piece of code.
		//which is denoted by a notation called big O of n
		//written as O(n)
		//"n" represents the number of iterations executed.
		
		int i=1;
		System.out.println(i);
		//this is executed only 1 time is denoted as O(1)
		
		int a=1;
		int b=2;
		int c=3;
		int d=a+b-c;
		System.out.println(d);// since this code is also ececutrd only ones is still a O(n)
		
		for(int e=1; e<=10;e++) {
			System.out.println(e); 
		}// this is executed for 10 times and called O(n).
		

	}

}
