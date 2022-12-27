package Tricky;

public class EscapreCharacters {

	public static void main(String[] args) {

		
		System.out.println("\"/Namaste/\"");
		System.out.println("/'Namaste'/");
		System.out.println("'/'Namaste'/'");
		System.out.println("\"/'Namaste'/\"");
		System.out.println("\"Namaste\"");
		System.out.println("\"Bharat\" \"Mata\" ki 'Jai'");
		System.out.println(xpath("shiva"));

	}
	
	public static String xpath(String name)
	{
		String xpath = "//input[@id='"+name+"']";
		return xpath;
		
	}

}
