package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {
	
		//achieved run time polymor here
		ICICIBank i = new ICICIBank();
		i.credit();
		i.dedit();
		i.transferMoney();
		i.loan();
		
		
		// dynamic polymor - can access overridden methods only 
		
		Banks b = new ICICIBank();
		b.credit();
		b.dedit();
		b.transferMoney();
		
		System.out.println(Banks.min_bal); 
		
	}

}
