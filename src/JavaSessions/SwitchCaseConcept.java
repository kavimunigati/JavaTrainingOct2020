package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		//Switch case statement is used when we have number of options (or choices)
		//and we may need to perform a different task for each choice.
		//the condition gets checked first and switches to the statement that satisfies.
		//this is the best practice to execute when have multiple lines of code to check
		//as it checks that particular condition and breaks ones satisfied.
		//switch ctrl+space will give the key and case.
		
 String browser ="Chrome";
 switch (browser){
 
 case "Chrome":
	 System.out.println("launch Chrome");
 break;
 
 case "IE":
	 System.out.println("launch IE");
	 break;
	 
 case "opera":
	 System.out.println("launch Opera");
	 break;
	 
	 default:
		 System.out.println("please lauch the valid browser:" + browser);
		 break;
	 
	 
	 
 }
 
 System.out.println("______________________________________________________________");
		
		int speed =30;
		switch (speed){
		case 100:
			System.out.println(" internet speed is high speed");
			break;
		 
			case 90:
				System.out.println(" internet speed is speed");
				break;
				
				case 80:
					System.out.println(" internet speed above average");
					break;
					 
					case 70:
						System.out.println(" internet speed is average");
						break;
					
						case 60:
							System.out.println(" internet speed is slow");
							break;
		default:
			System.out.println("internet is super slow");
break;
}
	}
}
					
				
				
		
		
		
		
		
		
		
		
		
		
						
		
		
	

	

