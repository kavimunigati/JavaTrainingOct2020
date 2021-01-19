package InterfaceConcept;

public class TestBanking {
 

	public static void main(String[] args) {
		SBI bank=new SBI();
		bank.Federal_Reserve_Act();
		bank.Aleign_deposits();
		bank.Customer_details();
		bank.Emergency_Banking();
		bank.Emergency_Banking();
		bank.Currency_exchange_rates();
		bank.Foreign_funds();
		bank.Holidays_list();
		bank.RBI_International_Banking();
		bank.NRI_Banking();
		bank.RBI_Guidelines();
		bank.World_bank_Guidelines();
		bank.RBI_International_Banking();
		bank.Emergency_Banking();
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		ICICI ic=new ICICI();
		ic.Aleign_deposits();
		ic.Currency_exchange_rates();
		ic.Customer_details();
		ic.Emergency_Banking();
		ic.Federal_Reserve_Act();
		ic.Foreign_funds();
		ic.Foreign_funds();
		ic.Holidays_list();
		ic.RBI_Guidelines();
		ic.RBI_International_Banking();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		ICICI_Local local=new ICICI_Local();
		local.Aleign_deposits();
		local.local_bank();
		local.Holidays_list();
		local.Federal_Reserve_Act();
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		//Top casting FederalBankUSA
		FederalBankUSA US =new SBI();
		US.Customer_details();
		US.Emergency_Banking();
		US.Federal_Reserve_Act();
		US.Holidays_list();
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		//Topcasting FederalReserveUK
		FederalReserveUK UK =new SBI();
		UK.Aleign_deposits();
		UK.Emergency_Banking();
		UK.Foreign_funds();
		UK.Transaction_rules();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		//Topcasting RBI
		RBI ind =new SBI();
		ind.Emergency_Banking();
		ind.RBI_International_Banking();
		ind.RBI_Guidelines();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	    //Topcasting World bank
		World_Bank wb= new SBI();
		wb.World_bank_Guidelines();
		
		 
	}

}
