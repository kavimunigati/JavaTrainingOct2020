package Encapsulation;

public class EncapStudent {
	//1. declare data /values
public String name;
public String Teacher;
private int ID;
private int marks;


//2. create function
public EncapStudent(String name, String Teacher, int iD, int marks) {
	
	this.name = name;
	this.Teacher = Teacher;
	this.ID = iD;
	this.marks = marks;
}
//create the setters and getters

public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}



}


