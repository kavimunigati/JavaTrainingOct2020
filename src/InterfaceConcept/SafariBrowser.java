package InterfaceConcept;

public class SafariBrowser implements WebDriver {
	//	//creating constructor
	public SafariBrowser() {
		System.out.println("Launch safari browser");
	}

	@Override
	public void launchURL(String url) {
		// TODO Auto-generated method stub
		
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
