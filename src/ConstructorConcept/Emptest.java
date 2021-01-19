package ConstructorConcept;

import Encapsulation.EncapEmployee;

public class Emptest {

	public static void main(String[] args) {
		// calling the encapEmployee class and creating the object
		//setting and getting the emp data for private variables.
		//we can create any nuber of objects  and call them with getters and setters.
		EncapEmployee e2 =new  EncapEmployee();
		 e2.name ="hello";
		 e2.age =16;
		 e2.setSalary(120.99);
		 System.out.println(e2.getSalary());
		 e2.setTax(10);
		 System.out.println(e2.getTax());
		
		  System.out.println(e2.name + " "+ e2.age);
				
		  EncapEmployee e3 =new  EncapEmployee();
		     e3.name ="hi";
			 e3.age =21;
			 e3.setSalary(120);
			 System.out.println(e3.getSalary());
			 e3.setTax(5);
			 System.out.println(e3.getTax());
			
			  System.out.println(e3.name + " "+ e3.age);
			  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			  
		  EncapEmployee e4 =new  EncapEmployee();
		     e4.name ="Java";
			 e4.age =50;
			 e4.setSalary(100);
			 e4.setTax(7);
			 System.out.println(e3.name + " "+ e3.age + " "+ e4.getSalary()+ " "+ e4.getTax());

	}

}
