package JavaSessions;

public class BrowserFunction{
 
	// function: which takes browsername(String) and launches the browser
		// accordingly:
		// return type: void
	//void does not have any return type.
public void launchBrowser(String BrowserName) {

if (BrowserName.equals("Chrome")){
	System.out.println("Chrome Launched");
	}
else if (BrowserName.equals("IE")){
	System.out.println("IE Launched");
	}	
else if (BrowserName.equals("Firefox")){
	System.out.println("Firefox Launched");
	}	
else {
	System.out.println("please launch the correct browser");
}

}	
	public static void main(String[] args) {
		// Objectify the Class
		//then link the object ref to function name
		
		 BrowserFunction br =new  BrowserFunction();
		 br.launchBrowser("Google");

	}

}
