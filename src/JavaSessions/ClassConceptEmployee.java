package JavaSessions;

public class ClassConceptEmployee {
// the variables created immediately under the class are called Class variables
	//we can just declare the variables under the class variables, but cannot give any values
	//eg: string name ="kavitha" is not a good practice
	//Eg: String name .....good practice
	
	//the below are the Class variables
	String name;
	int age;
	double salary;
	boolean ispermenent ;
	char gender;
			
		public static void main(String[] args) {
			//create the object using the keyword called:new
			ClassConceptEmployee e1= new ClassConceptEmployee();
			//e1 is the reference
			//new ClassConceptEmployee is the object
			//when ever we want to call the class variables, we have to use them with the reference name
			
			e1.name ="kavitha";
			e1.age =43;
			e1.salary= 100;
			e1.gender = 'F';
			e1.ispermenent =true;
			
			// we can create multiple objects under each class
			//we are creating one more object with a different reference name
			ClassConceptEmployee e2= new ClassConceptEmployee();
			e2.name ="Srinivas";
			e2.age =52;
			e2.salary= 100;
			e2.gender = 'M';
			e2.ispermenent =true;
			System.out.println(e1.name+""+e1.age+""+e1.gender);
			System.out.println(e2.salary+""+e2.name);
			
			// here I am creating another object with Ref name as e3
			// i am accesing only limited variables
			//and trying to print all the variables in tghe class
			ClassConceptEmployee e3= new ClassConceptEmployee();
			e3.name ="Vineeth";
			e3.age =22;
			System.out.println(e3.name+" "+e3.age+" "+e3.gender+" "+e3.ispermenent+" "+e3.salary);
			//Vineeth 22  false 0.0
			//even though we are trying to access only two variables from the class,
			//when printed out, will give the defult values
			//The default value for int is 0
			//The default value for String is Null
			//The default value for double is 0.0
			//The default value for boolean is false
			//The default value for char is space
			new ClassConceptEmployee();
			e2.name ="Srinivas";
			e2.age =52;
			e2.salary= 100;
			e2.gender = 'M';
			e2.ispermenent =true;
			
			}

}
