package AbstractClassConcept;

public class LoginPage  extends Page{
//we can  a constructor for login page
	public LoginPage() {
		System.out.println("LoginPage-----------Default Constructor");
	}
	
	@Override
	public void Title() {
		System.out.println("Page----Title");
	}

	@Override
	public void Header() {
		System.out.println("Page------Header");
	}

	@Override
	public void url() {
		System.out.println("Page----------URL");
		
	}

	public void Timeout() {
		System.out.println("Login Page---------TimeOut");
	}
public void Color() {
	System.out.println("LoginPage----------Color");
}
}
