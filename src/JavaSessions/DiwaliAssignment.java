package JavaSessions;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

public class DiwaliAssignment {

	public static void main(String[] args) {
//  Write a Java program to create a new array list, add some colors (string) and print out the collection
ArrayList<String> colors =new ArrayList<String>();
colors.add("red");
colors.add("blue");
colors.add("Green");
colors.add("Yellow");
colors.add("White");
System.out.println(colors);


//Write a Java program to insert an element into the array list at the first and last positions.

colors.add(0,"Orange");
colors.add(5,"Black");
System.out.println(colors);

// Write a Java program to retrieve an element (at a specified index) from a given array list.
System.out.println(colors.get(3));

//4. Write a Java program to update specific array element by given element.
colors.set(0, "Brown");//method 1
System.out.println(colors);

// Write a Java program to remove the third element from a array list.
System.out.println(colors.remove(2));
System.out.println(colors);

//Write a Java program to print all the elements of a ArrayList using the position of the elements
for(String c:colors) {
System.out.println(c);
}
//Write a Java program to search an element in a array list.

ArrayList<String> Laptop = new ArrayList<String>();
Laptop.add("Dell");
Laptop.add("Mac book pro");

if (Laptop.contains("Mac book pro")) {
    System.out.println("Found the Laptop");
    } 
else if (Laptop.contains("Lenovo")) {
	System.out.println("Not this Laptop");
}
else if (Laptop.contains("Dell")) {
	System.out.println("Neither this Laptop ");
}
else {
    System.out.println("Laptop not found");
    }
		
//Write a Java program to reverse elements in a array list

System.out.println(colors);

System.out.println("**************");
Collections.reverse(colors);
System.out.println(colors);

//Write a Java program to extract a portion of a array list.

System.out.println(colors.subList(0,3));
System.out.println("__________________________________");

System.out.println(colors);//before swap
Collections.swap(colors, 0, 5);		
System.out.println(colors);//after swap
		
	//10. Write a Java program to empty an array list.
ArrayList<Object> student =new ArrayList<Object>();
student.add("Mark");
student.add(29);
student.add('M');
student.add(true);
System.out.println(student);//Array list with data
student.removeAll(student);// removing all the data from array list



		
		
		
		
		
	}

}
