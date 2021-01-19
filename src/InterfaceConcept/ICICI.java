package InterfaceConcept;

public class ICICI implements FederalBankUSA,FederalReserveUK, RBI {

	@Override
	public void World_bank_Guidelines() {
		System.out.println("world Bank....ICICI....Guidelines");
		
	}

	@Override
	public void RBI_Guidelines() {
		System.out.println("RBI....ICICI....Guidelines");
		
	}

	@Override
	public void RBI_International_Banking() {
		System.out.println("RBI....ICICI....Int banking");
		
	}

	@Override
	public void Foreign_funds() {
		System.out.println("UK....ICICI....Foreign funds");
		
	}

	@Override
	public void Transaction_rules() {
		System.out.println("UK....ICICI....Transaction rules");
		
	}

	@Override
	public void Aleign_deposits() {
		System.out.println("UK....ICICI....Aleign depostis");
		
	}

	@Override
	public void Federal_Reserve_Act() {
		System.out.println("US....ICICI....Federal_Reserve_Act");
		
	}

	@Override
	public void Currency_exchange_rates() {
		System.out.println("US....ICICI....Currency_exchange_rates");
		
	}

	@Override
	public void Holidays_list() {
		System.out.println("US....ICICI....Holiday list");
	}

	@Override
	public void Emergency_Banking() {
		System.out.println("US....ICICI....Emer Bank");
	}

	@Override
	public Object Customer_details() {
		System.out.println("US....ICICI....customer details");
		return null;
	}

}
