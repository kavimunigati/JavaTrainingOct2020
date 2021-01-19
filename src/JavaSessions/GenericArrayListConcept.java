package JavaSessions;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericArrayListConcept {

	public static void main(String[] args) {
		//Generic in array list defines what type of data is stored in the Array List
		//generic data type is defined within the diamond bracket followed by Array List
		//when the generic data type is defined, it does not allow other type of data to be stored, 
		//which errors out  with a red error sign.
		//the data type must be mentioned as full name of data called wrapper class.
		//Integer should be mentioned instead of int 
		//when creating an Array list, it must be imported from Java.utils package.
		
		//Generic created with Integer
		ArrayList<Integer> marks =new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		marks.add(300);
		marks.add(400);
		System.out.println(marks.size());// prints the size of array list
		System.out.println(marks);// prints all the list
		System.out.println(marks.get(2));//gets only indexed number
		
		//iterating using for each loop
		for(int m :marks) {
			System.out.println(m);
		}
		System.out.println("____________________________--");
		//JDH 8 Streams using lambda
		marks.stream().forEach(m -> System.out.println(m));
		System.out.println("____________________________--");
		
		//Generic created with string
		ArrayList<String> names = new ArrayList<String>();
		names.add("Srini");
		names.add("Vineeth");
		names.add("Kavitha");
		names.add("God");
		
		System.out.println(names.size());// prints the size of array list
		System.out.println(names);// prints all the list
		System.out.println(names.get(3));//gets only indexed number
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		//iterating using streams
		names.stream().forEachOrdered(n -> System.out.println(n));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		//iterating with for each loop
		for(String n:names) {
			System.out.println(n);
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
		//iterating using iterator method
		Iterator n= names.iterator();
		while(n.hasNext()) {
			System.out.println(n.next());
		}
		
		//Generic creating with Object using different data types.
		
		ArrayList<Object> student =new ArrayList<Object>();
		student.add("Shanmukh");
		student.add(2);
		student.add('M');
		student.add(true);
		System.out.println(student.size());// prints the size of array list
		System.out.println(student);// prints all the list
		System.out.println(student.get(0));//gets only indexed number
		
		//For each loop
		for(Object s:student) {
			System.out.println(s);
		}
		System.out.println("**********************");
		//iterating using iteration method
		Iterator stu = student.iterator();
		while(stu.hasNext()) {
			System.out.println(stu.next());
		}
		
		System.out.println("**********************");
		//iterating using streams
		student.stream().forEach(s -> System.out.println(s));
		
		
		
			
		
		
		
		
		
		
		
		
	}

}
