package JavaSessions;

import java.util.Scanner;

public class FunctionStudentMarks {

	
//Function: which takes studentnames and  returns marks
	//in tthe arguments we give the student name which is string
	// return value is int
	// so, we change the void to int in the method.

public int Studentmarks(String Studentname) {
	
	System.out.println("marks scored by "+" " + Studentname);
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	int marks=0;
	if(Studentname.equals("kavitha")) {
		marks=99;
	}
	else if(Studentname.equals("Anitha")) {
		marks=98;
	}
	else if(Studentname.equals("vanitha")) {
		marks=97;
	}
	else if(Studentname.equals("Rohith")) {
		marks=96;
	}
	else  {
		System.out.println("student name not found");
		marks=-1;
	}
	return marks;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FunctionStudentMarks sm=new  FunctionStudentMarks ();
		int mark =sm.Studentmarks("Hello");
		System.out.println(mark);
	}

}

