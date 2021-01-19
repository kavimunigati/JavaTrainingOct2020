package AbstractClassConcept;

public class TestPage {

	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.Header();
		lp.Timeout();
		lp.Title();
		lp.url();
		lp.dologin();
		lp.Logo();
		lp.Color();
		Page.Structure();// inheriting the Static method, so calling by class name.
//the Page(Parent) constructor will be checked at the child class and call with the child class referenece.
//so when we print we see the "page--------default constructor"
//like wise we also see the child class constructor being called as "LoginPage-----------Default Constructor" in print
		

	//Topcasting: creating the object ref  of the parent class with child class object name
	//as Abstract class cannot create objects
	Page p =new LoginPage();
	p.dologin();
	p.Header();
	p.Logo();
	p.Title();
	p.url();
	Page.Structure();//inheriting the Static method, so calling by class name.
//the Page(Parent) constructor will be checked at the child class and call with the child class referenece.
//so when we print we see the "page--------default constructor"
//the child class Constructor will not be shwn in parent class ref object.
	

	}
}
