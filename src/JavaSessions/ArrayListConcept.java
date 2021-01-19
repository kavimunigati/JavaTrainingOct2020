package JavaSessions;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
  ArrayList ar	= new ArrayList();//"ar" is the object reference or ArrayList name and "new Arraylist" is the object.
  System.out.println(ar.size());
  
  //".add" is a method to add or append the elements or items to the Arraylist.
  ar.add(100);//0 index of the arrayLIst
  ar.add(200);//1
  ar.add(300);//2
  ar.add(400);//3
  System.out.println(ar.size());//to find the length of the ArrayList
  //below we are adding more elements to the array list as this is dynamic in nature and size can be increased  or decreased.
  ar.add(500);//4
  ar.add(600);//5
  ar.add(700);//6
  System.out.println(ar.size());
  
  ar.add(800);//7, so we have 7 indexes in the array list now
  System.out.println(ar.size());
  System.out.println(ar.get(3));//".get" method is to fetch a particular index from the Array list.400, 
  System.out.println(ar.remove(4));// ".remove" is a method to remove a index in the array list
  System.out.println(ar.size());//when we check the size we see that index 4 is removed and 5 is resized to 4th place.
  System.out.println(ar);// after removing we see that the array list does not have the value of index 4.
  
  ar.add(900);
  System.out.println(ar.size());
  ar.add(12.55);
  ar.add("kavitha");
  
  //for loop
  for (int i=0; i<ar.size(); i++)
  System.out.println(ar.get(i));// we use get method in for loop to fetch the ArrayList.
  
  //For each loop
  for(Object e :ar) {
  System.out.println(e);
  System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
  //using iterator method
  //"iter" is the reference name for this iterator method
  //we are trying to iterate  the array list using Iteration method,
  //just like we did using for and for each loop
  // we are using ".hasnext " method tp  iterate
  //".hasnext" is used when we are not sure if there is another value, and it keeps iterating until next value.
  //in syso, we use the .next method to find the next value to print
  //ones, it does not find the next value, it comes out of loop as the condition is failed.
  Iterator iter =ar.iterator();
  while(iter.hasNext()) {
  System.out.println(iter.next());//
  }
  }
	}

}
