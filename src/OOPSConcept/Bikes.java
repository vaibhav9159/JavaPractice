package OOPSConcept;

public class Bikes {

	int model ;
	int engineCC;
	
	public static void main(String[] args) {
		
		// new -> operator, Bikes - class, a,b,c-> object reference variables, new Bikes()-> object 
		Bikes a = new Bikes();
		Bikes b = new Bikes();
		Bikes c = new Bikes();
				
		a.model=2011;
		a.engineCC= 149;
		b.model=2015;
		b.engineCC=150;
		c.model=2023;
		c.engineCC=155;
		
		System.out.println("before assigning variables");
		System.out.println(a.model);
		System.out.println(a.engineCC);
		System.out.println(b.model);
		System.out.println(b.engineCC);
		System.out.println(c.model);
		System.out.println(c.engineCC);	
	
	//shifting reference variables , in this case a refers to b, b refers to c and c refers to b , so a is left alone as a is already referred to b.
		a=b;
		b=c;
		c=a;
		
		
		
	}

}
