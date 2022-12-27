package OOPSConceptPart2;

//constructors can be overloaded
// hidden constructor is always their which gets executed first when an object is created 
public class ConstructorConcept {

	public ConstructorConcept()
	{
		System.out.println("deafult constrc"); // will be printed by deafult if objtec is created and nothing is declared 
	}
	
	public ConstructorConcept(int a)
	{
		System.out.println("single param constrc");
	}
	
	public ConstructorConcept(int a, int b)
	{
		System.out.println("multi param constrc");
	}
	
	public static void main(String[] args) {
	
		ConstructorConcept c = new ConstructorConcept();
		ConstructorConcept c1 = new ConstructorConcept(10);
		ConstructorConcept c2 = new ConstructorConcept(20,30);
		

	}

}
