package OOPSConceptPart2;

public class ConstructorWithThisSUperKeywords {

	String name;
	int age;
	
	public ConstructorWithThisSUperKeywords()
	{
		System.out.println("deafult constrc");
	}
	
	
	public ConstructorWithThisSUperKeywords(String name, int age)
	{
		this.name=name;  // global variable is initialized using this keyword
		this.age=age;    // global variable is initialized using this keyword
		
		System.out.println("multiple param constrc " + name);
		System.out.println("multiple param constrc " + age);
	}
	
	public static void main(String[] args) {

		ConstructorWithThisSUperKeywords c = new ConstructorWithThisSUperKeywords();
		ConstructorWithThisSUperKeywords c1 = new ConstructorWithThisSUperKeywords("shiva" , 30);
				
	}

}
