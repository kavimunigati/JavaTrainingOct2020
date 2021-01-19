package Encapsulation;

public class EncapEmployee {

	public String name;
	public int age;
	private double salary;//private variables cannot be assessed out side of the class
	private int tax;//private variables cannot be assessed out side of the class
	
//Encapsulation: when you have to hide all the private variables with the help public methods
//we can access the private variables, in the same class created, to access the information
//in other classes we have to create  Getter and setters.		
//to implement the private variables we create the getter and setter methods.
//to implement the getter and setter : Source->generate getters and setter-> select the variable ->generate
//in the below function , i am trying to retreive the salary and tax variable which is private
//	to link the salary from  class variables to the salary in the set salary function we use "this" key word.	
	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	
	
	public static void main(String[] args) {
		 EncapEmployee e1 =new  EncapEmployee();
		 e1.name =("kavitha");
		 e1.age = (46);
		 e1.salary=120.00;
		 e1.tax=7;
		  System.out.println(e1.name + " "+ e1.age + " "+ e1.salary + " "+e1.tax);
				 
		
		

	}

	

}
