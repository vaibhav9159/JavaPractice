package OOPSConceptPart2;

public class BMW extends car{
		
	
	public void engine()
	{
		System.out.println("child engine");
	}
	
	public void color()
	{
		System.out.println("child color");
	}
	
	public void safety()
	{
		System.out.println("child safety");
	}

	public static void main(String[] args) {

		BMW b = new BMW();
		b.color();
		b.engine();
		b.model();

	}

}
