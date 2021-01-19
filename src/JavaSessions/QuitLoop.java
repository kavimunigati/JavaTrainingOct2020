package JavaSessions;

public class QuitLoop {

	public static void main(String[] args) {
	////Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered	
		int counter = 1;

	    while (counter <= 10) {

	      System.out.println(counter);

	      if (counter % 7 == 0) {
	        System.out.println("Quit when muliple of 7 found");
	        break;
	      }
	      counter++;
	      
	    }
	    System.out.println("********************");
/**
 * Question 3: Try to print the following pattern on the console:
n = 4
n = 3
n = 2
n = 1
n = 0
 */
	    int nu[] = new int[5];
	    nu[0]=1;
	    nu[1]=2;
	    nu[2]=3;
	    nu[3]=4;
	    nu[4]=5;
	    //==>Start the counter "i" with array.length-1
	    // here I am taking "nu" which is my array and length-1
	    //or i = highest index  in the array
	  // counter "i" should be greater than orequal to 0(>=0) as '0' is the first index in array.
	    for (int i=nu.length-1; i>=0;i--) {
	    	System.out.println("n =" + i);
	    }
	    System.out.println("***********************");
	    
	    for (int j=5; j>=0;j=j-1)// start the counter "j" from the max number you want to get the print.
	    	System.out.println("n ="+ j);
		}
	}

