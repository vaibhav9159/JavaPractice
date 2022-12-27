package Tricky;

public class COuntCharOccurence {

	
	// we can also use StrinhUtils class to count macthes, need to download the jar file apache common 
	public static void main(String[] args) {
	
		String se= "SHiva SHakti";
		getCharOccurence(se, 'S');
		getCHarCount(se, 'H');
		System.out.println(getCharCountSTreams(se, 'i'));
					
	}
	
	//1
	public static void getCharOccurence(String s, char val)
	{	int count=0;
		for(char ch:s.toCharArray())
		{
			if(ch==val)
			{
				count++;
			}
		}System.out.println(count);
	}
	//2
	public static void getCHarCount(String s, char value)
	{
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==value)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	//3 streams 
	public static long getCharCountSTreams(String s, char a) {
	
	 return s.chars().filter(m->(char)m==a).count();
	}
	
}
