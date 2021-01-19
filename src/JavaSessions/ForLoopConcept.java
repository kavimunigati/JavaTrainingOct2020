package JavaSessions;

public class ForLoopConcept {

	public static void main(String[] args) {

		for(int k = 1; k<=10; k++) {
			System.out.println(k);//12345...10
		}

		
		for (double a=100.987;a<=120.987;) {
			System.out.println(a);
			a++;
		}
		char c1;
		for (c1='a'; c1<='z';) {
			System.out.println(c1);
			c1++;
		}
		//for (String name="Kavitha"; name<=10 name++) {
			//System.out.println(name);
		//}
		// print even numbers only from 2 to 12
		for (int e=2; e<=12; e=e+2) {
			System.out.println(e);
		}
		System.out.println("____________________________");
		//another method for increment or decrement
		for (int e1=4; e1<=24; ) {
			System.out.println(e1);
			e1=e1+2;
		}
		System.out.println("____________________________");
		for (float e2=4f; e2<=24;e2++ ) {//Incremented here and 
			System.out.println(e2);
			e2++;// incremented here as well for alternate numbers
		
		//print only odd numbers from 1 to 15 
		for (int o=1; o<=15; o=o+2) {
			System.out.println(o);
		}
		//print multiples of 3 from 3 to 30
		for (int m =3; m<=130; m=m+3) {
			System.out.println(m);
		}
		//print every 5th number from 1 to 100
		for (int f=1; f<=100; f=f+5) {
			System.out.println(f);
		}
		//print reverse order from 10 to 1
		for(int r=10; r>=1; r--) {
			System.out.println(r);
		}
		//print reverse order of every 4th number from 20 to2
		for(double d=20; d>=2; d=d-4) {
			System.out.println(d);
		}
		
		System.out.println("*********************");
		//Nested for loop
		//For loop inside a for loop is called nested for loop
		for (int t=50; t<=60;t++) {
			for(int u=1; u<=5;u++) {
		System.out.println(t +""+u);
	}
	}
		}
	}
}
