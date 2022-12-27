package JavaPrograms;

public class StringToInteger {
	public static void main(String[] args) {

		String s= "11";
		System.out.println(stringToInt(s) + 10);
		

	}
	
	// asc value 0f 0 = 48 , typecasting 0 string to int and the capturing chars getting their asci value , formual is sum*10 + (asc-zeroasc)
	public static int stringToInt(String str)
	{
		int sum = 0;
		char ch[] = str.toCharArray();
		int zeroAsc =(int)'0';
		
		for(int i=0;i<ch.length;i++)
		{
			int asc = (int)ch[i];
			sum = sum*10+(asc -zeroAsc);
		}
		return sum;
	}
	

}
