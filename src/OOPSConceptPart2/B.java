package OOPSConceptPart2;

// it will call parent class constrtuctor first 
public class B extends A implements Banks{

	public B()
	{
		System.out.println("deafult constrc B child");
	}
	
	public B(int i)
	{	super(i);
		System.out.println("B child super keyword to call parent param constr" );
	}
	
	
	public static void main(String[] args) {
	
		B b1 = new B();
		B b2 = new B(20);  // created to pass value for secon param constrctr called using super keyword from child to parent claSS
	
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
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
