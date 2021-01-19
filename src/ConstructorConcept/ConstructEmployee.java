package ConstructorConcept;

public class ConstructEmployee {
	

String name;
int id;
int age;
double salary;
String dept;

// create the constructors 
//right click on the mouse ->  source -> generate constructor using fields 
//here we are creating functions in a class and initiliazing the local variables.
//" this " key word is used to initialise the class variable with local variable.
//this.classvariable = local variable


public ConstructEmployee(String name, int id, int age, double salary, String dept) {
	this.name = name;
	this.id = id;
	this.age = age;
	this.salary = salary;
	this.dept = dept;
}

public ConstructEmployee(String name, int id) {
	
	this.name = name;
	this.id = id;
}

	public ConstructEmployee(String name, int age, double salary, String dept) {

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
	}

	public ConstructEmployee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
public static void main(String[]args) {
	// object need to be created for every function in the constructors.
	
	ConstructEmployee ce1 =new ConstructEmployee ("Kavitha", 101, 43, 100, "IT");//1st object
			System.out.println(ce1.name + ce1.id +ce1.age+ce1.salary+ce1.dept);
			
	ConstructEmployee ce2 =new ConstructEmployee("kav", 40, 101);//2nd object
	System.out.println(ce2.name + ce2.id + ce2.age + ce2.dept);
		
}
}
