package Tricky;

public class ReverseAnInteger {

	
	public static void main(String[] args) {
	
		int a = 12345;
		int rev = 0;
	
		//1st method to revers a num
		String aNum =String.valueOf(a);
		StringBuffer sf = new StringBuffer(aNum);
		System.out.println(sf.reverse());
		
	//2nd method 	
		
		while(a!=0)
		{
			rev = rev*10+a%10;
			a=a/10;
		}
		System.out.println(rev);

		
		
	}

}
