package JavaSessions;

public class IfElseString {

	public static void main(String[] args) {
		// when using string in the if else condition we have to use 
		//.equals to compare with another string.
		//.equals is a method of a string class 
		//unlike <,>or == when comparing primitive datatype like int, float, double and boolean 

		String browser = "Opera";
		if (browser .equals("chrome")){
		System.out.println("launch Chrome");
		}
		 else if (browser .equals("Firefox")){
			System.out.println("launch firefox");
			}
		 else if (browser .equals("IE")){
			System.out.println("launch IE");
			}
		 else if (browser .equals("Safari")){
			System.out.println("launch Safari");
			}
		 else {
			 System.out.println("please provider the correct browser name"+" "+ browser);
		
		 }
	}
}
		
	
