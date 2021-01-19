package JavaSessions;

import java.util.Scanner;

public class VoterAge {
	

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
		
		VoterAge  age=new VoterAge ();
		age.VoteElligibility(70);
		System.out.println(age);

	}

}
