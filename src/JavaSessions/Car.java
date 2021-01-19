package JavaSessions;

public class Car {
	//below are the variables created in car class and can be used across the object created. 
String name;
String model;
String colour;
int price;
static int wheels = 4;
static int steering = 1;
static int brakes =1;

	public static void main(String[] args) {
//objects can never hold Static values. in the below example, we have given the value of wheels,steering,brakes which 
//is 4 and 1 in all the objects, int value takes the space of 4 bytes, as wheels =4, steering =1,brakes =1  is a common property in
//in all the objects, we are making the wheels as static in nature, so that it does not take up 4 bytesin all the 
//objects created. this way we can save lots of memory space in the heap.
//Static variables are stored in CMA(Common Memory Allocation" also known as "MetaSpace".
// Static variables declared are common properties to all the objects
//values for Static variables must be declared at the class level
// to access the static variables, we have to use the class.variable and not object.variable		
		
		
Car car1 =new Car();
car1.name ="Tesla";
car1.model="Model 3";
car1.colour ="Grey";
car1.price =50;
//car1.wheels =4;
System.out.println(car1.name);//accessing using Obj ref name
System.out.println(car1.colour);//accessing using Obj ref name
System.out.println(car1.model);//accessing using Obj ref name
System.out.println(car1.price);//accessing using Obj ref name
System.out.println(Car.wheels);//accessing using Class name
System.out.println(Car.steering);//accessing using Class name
System.out.println(Car.brakes);//accessing using Class name


Car car2 =new Car();
car2.name ="Lexus";
car2.model="2008";
car2.colour =" greenish Grey";
car2.price =45;
//car2.wheels =4;
System.out.println(car2.name);
System.out.println(car2.colour);
System.out.println(car2.model);
System.out.println(car2.price);
System.out.println(Car.wheels);
System.out.println(Car.steering);
System.out.println(Car.brakes);

Car car3 =new Car();
car3.name ="Toyota";
car3.model="corolla";
car3.colour ="Grey";
car3.price =18;
//car3.wheels =4;
System.out.println(car3.name);
System.out.println(car3.colour);
System.out.println(car3.model);
System.out.println(car3.price);
System.out.println(Car.wheels);
System.out.println(Car.steering);
System.out.println(Car.brakes);


	}

}
