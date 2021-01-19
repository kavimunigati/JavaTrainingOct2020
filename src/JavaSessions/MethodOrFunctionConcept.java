package JavaSessions;

public class MethodOrFunctionConcept {
//Function can not be written within the function
// the public static void main(String[] args) {
	//all this is a function from upper flower braces to lower one.
//}
	//there are 3 different methods in java
	//1. No Input no return method
	// when we give void,that means we cannot get any return
	// if we do not want any return type, we should use void in the function.
	public void test(){// 0 parameter function
	//which means we cannot pass any parameters here
		// we cannot also get any return in this function
				// if we want any out put, we have to create a n object in the main method.
		System.out.println("test Function");
		
	}
	//2. No input some return
	// when we give void, we cannot get any return, so here we are giving some string so,
	//we replace String with void.
	public String gettrainername( ) {
		System.out.println("get trainer name");
		String name ="kavitha";
		return name;
	}
	
	//No input some return with int values
	public int gettotal() {
		System.out.println("get total");
		int a=10;
		int b=20;
		int c=a+b+5;
		return c;
	}
	//some input and return with int
	//Function: which takes country as pARAMETER AND RETURNS CAPITAL
	public int add(int x, int y ) {
		int z = x+y;
		return z;
	}
	//some input and return with string
	public String Getcapitalname(String CountryName) {
		System.out.println("The capital of " + CountryName +" " + "is");
		
		
		if(CountryName.equals("India")){
			return "New Delhi";
		}
		else if(CountryName.equals("USA")){
			return "Washingtion DC";
	} 
		else if(CountryName.equals("Russia")){
			return "Moscow";
		}
		else if(CountryName.equals("Japan")){
			return "Tokyo";
	}
		else {
			System.out.println("The capital of "+ CountryName +" " + "is not Found");
			return null;
		}
		
	}
	
	

	public static void main(String[] args) {
		// here we are creating object for the methods
				 MethodOrFunctionConcept testobj =new  MethodOrFunctionConcept();
		 //below we are calling the function to the testobj created
		 // now when we run, it goes to the test method, gets the print value and prints.
				 //below is for method 1
		 testobj.test();
		 
		//method 2 with string
		String n=testobj.gettrainername();// we are holding the string values and returning the string
		System.out.println(n);//n is the reference given to name.
		
		//method 2 with int
		int total = testobj.gettotal();// total is the returning value
		System.out.println(total);
		
		//method 3 with int
		int sum = testobj.add(100, 200);// here we are giving the dynamic values to the variables declared in function.
		System.out.println(sum);//sum is the ref name given to Z
		
		//method 3 with string
		String capital = testobj.Getcapitalname("Russia");//capital returns the return value of countries.
		System.out.println(capital);
	}

}
