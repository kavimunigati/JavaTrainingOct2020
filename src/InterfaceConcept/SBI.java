package InterfaceConcept;

public class SBI implements FederalBankUSA,FederalReserveUK, RBI  {



	@Override
	public void Federal_Reserve_Act() {
		System.out.println("SBI.............US Federal_Reserve_Act");
	}

	@Override
	public void Currency_exchange_rates() {
		System.out.println("SBI........US Currency_exchange_rates");
	}

	@Override
	public void Holidays_list() {
		System.out.println("SBI......US Holiday_list");
		
	}
	@Override
	public Object Customer_details() {
		System.out.println("SBI......Customer_Details");
		String name;
		int acc_num;
		return "name, acc_num";
	}
	@Override
	public void Foreign_funds() {
		System.out.println("SBI....UK Foreign_funds ");
		
	}

	@Override
	public void Transaction_rules() {
		System.out.println("SBI....UK Transaction_rules ");
		
	}

	@Override
	public void Aleign_deposits() {
		System.out.println("SBI....UK Aleign_deposits ");
	}

	@Override
	public void RBI_Guidelines() {
		System.out.println("SBI....RBI_Guidelines  ");
	}

	@Override
	public void RBI_International_Banking() {
		System.out.println("SBI....RBI_International_Banking ");
		
	}
//We override the method even though we have the same method in multiple interfaves
	@Override
	public void Emergency_Banking() {
		System.out.println("SBI.............US  Emergency_Banking");
		System.out.println("SBI.............UK  Emergency_Banking");
		System.out.println("SBI.............RBI  Emergency_Banking");
	}
		//SBI own methods/ rules
		public void NRI_Banking() {
			System.out.println("SBI .............NRI_Banking");
		}

		@Override
		public void World_bank_Guidelines() {
			System.out.println("World Bank ....Guidelines");
			
		}

		

		
			
		}
	

	
	


