package JavaSessions;

public class IfElseCondition {
// when we code all the conditions with if if if statements, all the conditions that satisfy will be printed.
	
	public static void main(String[] args) {
		double marks =80.00;//change the number to check different scores
		if (marks<=100); {
			if (marks>=90.00) {
				System.out.println("grade A");
			}
			 if (marks>=80){
			System.out.println("grade B");
			}
			 if (marks>=70){
					System.out.println("grade C");
			  }
			 if (marks>=60)
				{
					System.out.println(" detained");
				}

			 else {
				System.out.println("not applicable");
				}
				}
			System.out.println("__________________________________________");
			
			//when a condition is with "If else if " then only one statement which satisfies gets printed.
			
			if (marks<=100); {
				if (marks>=90.00) {
					System.out.println("grade A");
				}
				else if (marks>=80){
				System.out.println("grade B");
				}
				else if (marks>=70){
						System.out.println("grade C");
				  }
				else if (marks>=60)
					{
						System.out.println(" detained");
					}

				 else {
					System.out.println("not applicable");
					}
					}
				
			}

		
	}

	

