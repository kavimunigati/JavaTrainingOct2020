package InterfaceConcept;

public class Amazontest {
	
	// creating driver reference from the inferface and later use it to top casting  the child class.
	/**we are using the static key word  below because the main method is static in nature and id we want 
	 to use "driver" reference , we have to make it static or else we cann ot use the reference.*/
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//Cross browser testing Chrome, FF,safari.
		String browser ="FireFoxBrowser";
		
		//Top casting the parent interface reference"Driver" with child class.
		
		if( browser.equals("ChromeDrive") ){
		driver=new ChromeDriver();
	}
	
	else if(browser.equals("FireFoxBrowser") ){
	driver=new FireFoxBrowser();
}
    else if( browser.equals("safariBrowser") ){
    driver=new SafariBrowser();
}
else {
	System.out.println("please enter correct Browser");
}
	driver.launchURL("http://www.amazon.com");// to see where the method is declared press Ctrl and mouse over the method, and select Open declaration.

	String title= driver.Gettitle();
	System.out.println(title);
	driver.EnterText("search", "Laptop");
	driver.click("Search");
	driver.closeBrowser();
	}

}
