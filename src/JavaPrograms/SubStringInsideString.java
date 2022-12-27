package JavaPrograms;

public class SubStringInsideString {

	public static boolean subSTring(String text, String subText)
	{
		return text.matches("(.*)" + subText + "(.*)");
	}
	
	public static boolean subSTring1(String text, String subText)
	{
		return text.contains(subText);
	}
	
	public static void main(String[] args) {
	
		System.out.println(subSTring("bharat mata ki jai, vande mataram", "vande"));
		System.out.println(subSTring1("bharat mata ki jai, vande mataram", "vande"));


	}

}
