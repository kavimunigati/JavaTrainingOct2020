package ConstructorConcept;

public class CallConstructorConcept {
	
	public static void main (String[]args) {
	
		ConstructEmployee ce1 =new ConstructEmployee ("Kavitha", 101, 43, 100, "IT");//1st object
		System.out.println(ce1.name + ce1.id +ce1.age+ce1.salary+ce1.dept);
		

}
}