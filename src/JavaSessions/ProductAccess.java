package JavaSessions;

import java.util.ArrayList;

public class ProductAccess {

	public static void main(String[] args) {
		//here in the ProductAccess class we are creating the objects of the product class 
		// below we are creating the Arraylist for product access as 
		ArrayList<String>dealerlist =new ArrayList<String>();
		
		Product laptop =new Product();
		laptop.name="macbook";
		laptop.id=101;
		laptop.sellerlist =dealerlist;
		//here we are linking the ArraiList of product to array list of Product access
		
		
		dealerlist.add("BestBuy");
		dealerlist.add("Costco");
		dealerlist.add("Sams");
		System.out.println(laptop.name);
		System.out.println(laptop.name);
		System.out.println(dealerlist);
		
		
		//creating another object
		Product windowslaptop =new Product();
		windowslaptop.name="Thinkpad";
		windowslaptop.id=102;
		windowslaptop.sellerlist=dealerlist;
		
		System.out.println(	windowslaptop.name);
        System.out.println(windowslaptop.id);
        System.out.println(dealerlist);
        
        //creating 3rd object
        Product tablet = new Product();
        tablet.name="Ipad pro";
        tablet.id=2010;
        tablet.sellerlist=dealerlist;
        System.out.println(	tablet.name);
        System.out.println(tablet.id);
        System.out.println(dealerlist);
        
	}

}
