package InterfaceConcept;

public interface WebDriver {
	//creating methods for WebDriver
	public void launchURL(String url);//// to see where the method is implemented press Ctrl and mouse over the method, and select Open implementation.
	public String Gettitle();
	public void click(String element);
	public void EnterText(String element, String value);
	public void closeBrowser();
	
	
	

	
		

}
