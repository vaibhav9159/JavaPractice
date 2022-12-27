package OOPSConceptPart2;

public class C implements Banks{

	public static void main(String[] args) {
	
		C c1 = new C();
		Banks.transactionHistory();  // static method from interface called
		c1.maxLimit();               // default method from interface
		c1.credit();
	}

	@Override
	public void credit() {
		System.out.println("Overriden method from interface credit");
		
	}

	@Override
	public void dedit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferMoney() {
		// TODO Auto-generated method stub
		
	}
	
	

}
