package InterfaceConcept;

public class ChromeDriver implements WebDriver {
	//creating constructor
public ChromeDriver() {
	System.out.println("launch chrome browser");
}

@Override
public void launchURL(String url) {
	System.out.println("launch the URL:"  + url);
	
}

@Override
public String Gettitle() {
 String title ="Amazon";
	return title;
}

@Override
public void click(String element) {
	System.out.println("clicking on the element: "+ element);
	
}

@Override
public void EnterText(String element, String value) {
	System.out.println("text the value in element:" + "value =" + value );
}

@Override
public void closeBrowser() {
	System.out.println("close browser");
	
	
}



}

