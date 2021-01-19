package Encapsulation;

public class Callstudent {

	public static void main(String[] args) {
		//4.creating object of EncapStudent class and call in the Call student class
		
EncapStudent std=new EncapStudent("Anitha", "Ani", 101, 100);
EncapStudent std1=new EncapStudent("Vanitha", "Vani", 102,100);
EncapStudent std2=new EncapStudent("sunitha", "suni", 103, 80);
EncapStudent std3=new EncapStudent("Lalitha", "Lilly", 104, 60);

//5. call the return type or getting the values
System.out.println(std.name + " " + std.Teacher+ " " + std.getID()+ " " + std.getMarks());
System.out.println(std1.name + " " + std1.Teacher+ " " + std1.getID()+ " " + std1.getMarks());
System.out.println(std2.name + " " + std2.Teacher+ " " + std2.getID()+ " " + std2.getMarks());
System.out.println(std3.name + " " + std3.Teacher+ " " + std3.getID()+ " " + std3.getMarks());


//.setting up the field or modifing the field
std3.setMarks(70);
System.out.println(std3.name + " " + std3.Teacher+ " " + std3.getID()+ " " + std3.getMarks());

	}

}
