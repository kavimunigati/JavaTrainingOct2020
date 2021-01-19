package Inheritance;

public class TestBank {

	public static void main(String[] args) {
		System.out.println("***Super grand parent class***");
		RBIInheritance RBI= new RBIInheritance();
		RBI.Guidelines_Homeloans();
		RBI.Guidelines_Personalloans();
		
	System.out.println("*** grand parent class***");
	
	Regional_Banks RB =new Regional_Banks();
	RB.Guidelines_Personalloans();
	RB.Guidelines_Homeloans();
	RB.miscellenious_loans();
		
		System.out.println("*** parent class***");
		
		BankHeadOffice HO =new BankHeadOffice();
		HO.Guidelines_Personalloans();
		HO.Guidelines_Homeloans();
		HO.miscellenious_loans();
		HO.StudentLoan();
			
		System.out.println("***Child class***");	
		
		BranchOffice BO=new BranchOffice() ;
		BO.Guidelines_Personalloans();
		BO.Guidelines_Homeloans();
		BO.miscellenious_loans();
		BO.Augriculture_loans();
		BO.StudentLoan();
		BO.Vehicle_loan();
		
	}

}
