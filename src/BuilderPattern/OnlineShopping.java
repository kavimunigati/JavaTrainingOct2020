package BuilderPattern;



public class OnlineShopping {
	/** Launch the website
	 * search the application
	login to the app
	search the product 
	add to cart
	make payment
	logout*/
	//The below functions are the behaviour functions
	//in "builderpattern" we have to use the class for returntype
	//eg: change public void function name to 
	//public classname function name and end with return this.
	public OnlineShopping browser(String browser){
		System.out.println("launched the browser" + browser);
		return this;
		}
	public OnlineShopping searchApp(String App) {
		System.out.println("App name" + " "+ App);
		return this;
	}
	public OnlineShopping dologin(String Un, String Pw) {
	System.out.println("logged into the website" + Un + " " + Pw);
	return this;
	}
	public OnlineShopping searchProduct(String Product) {
		System.out.println("Product name" + " "+ Product);
		return this;
	}
	public OnlineShopping addtocart(String product) {
		System.out.println("product added to cart"+ " "+ product);
		return this;
	}
	public OnlineShopping payment(String CC, String CVV) {
		System.out.println("card details added"+  CC +  CVV);
				return this;
	}
	public OnlineShopping logout(String logout) {
		System.out.println("logged out of app");
		return this;
	}

	
}
