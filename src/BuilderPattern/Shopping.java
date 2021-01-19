package BuilderPattern;

public class Shopping {

	public static void main(String[] args) {
		/** Launch the website
		 * search the application
		login to the app
		search the product 
		add to cart
		make payment
		logout*/
		/**for calling builder types, we have to initilize the object only ones and
		 * dont need to use the obj ref for every function loke the below example.
		 * where we use the obj ref name shop only ones and rest just give dot indent 
		 * to get the recommendations of the functions and parameters
		 * create obj just ones and just call the rest of the functions
		*/
		
		//example 1. i phone shopping
		OnlineShopping shop=new OnlineShopping();
		shop.browser("Chrome")
		.searchApp("Amazon")
		.dologin("cust@gmail.com", "custPw123")
		.searchProduct("Phone")
		.addtocart("iphone")
		.payment("123 456 7890", "999")
		.logout(null);
		
		System.out.println("**************************");
		//example 2. laptop shopping
	
		shop.browser("IE")
		.searchApp("Deals to go")
		.dologin("dealcust@gmail.com", "dealcustPw123")
		.searchProduct("laptop")
		.addtocart("Macbook")
		.payment("123 654 7890", "990")
		.logout(null);
		
		System.out.println("**********************");
		
		//example3 tv shopping
		shop.browser("IE")
		.searchApp("BestBuy")
		.dologin("bestcust@gmail.com", "bestcustPw123")
		.searchProduct("TV")
		.addtocart("Samsung")
		.payment("123 654 0978", "990")
		.logout(null);
		
		
	}

}
