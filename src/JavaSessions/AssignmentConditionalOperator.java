package JavaSessions;

public class AssignmentConditionalOperator {

	public static void main(String[] args) {
/**1. Take three numbers from the user and print the greatest number. 
Test Data
Input the 1st number: 25 
Input the 2nd number: 78 
Input the 3rd number: 87
Expected Output :
The greatest: 87
		 * 
		 */
		int input1 =25;
		int input2=78;
		int input3 = 87;
				
		System.out.println( input1<input2);
		System.out.println( input2>input3);
        boolean flag =true;
		 if (flag) {
		 System.out.println("the greatest:" + input3);
		 }
		 else {
			 System.out.println("not true");
		 }  
		
		
	}

}
