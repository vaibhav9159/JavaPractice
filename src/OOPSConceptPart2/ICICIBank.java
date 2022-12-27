package OOPSConceptPart2;

public class ICICIBank implements Banks{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void credit() {
		System.out.println("icici bank interface credit");
		
	}

	@Override
	public void dedit() {
		
		System.out.println("icici bankinterface dedit");
	}

	@Override
	public void transferMoney() {
		System.out.println("icici bank interface transfermoney");
		
	}
	
	public void loan() {
		System.out.println("icici bank loan");
		
	}

}
