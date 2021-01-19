package ConstructorConcept;

public class ConstructHouse {

	String modelname;
	int lot_number;
	int area;
	int bedrooms;
	int garage;
	long price;
	
	// create the constructors 
	//right click on the mouse ->  source -> generate constructor using fields 
	// Select fields to initialize and generate
	// we can create as many constructors as needs 
	
	public ConstructHouse(String modelname, int lot_number, int area, int bedrooms, int garage, long price) {
		
		this.modelname = modelname;
		this.lot_number = lot_number;
		this.area = area;
		this.bedrooms = bedrooms;
		this.garage = garage;
		this.price = price;
			}

	public ConstructHouse(String modelname, int lot_number, long price, int i, int j) {
		
		this.modelname = modelname;
		this.lot_number = lot_number;
		this.price = price;
	}

	public ConstructHouse(int area, int bedrooms, long price) {
		
		this.area = area;
		this.bedrooms = bedrooms;
		this.price = price;
	}


		
}
