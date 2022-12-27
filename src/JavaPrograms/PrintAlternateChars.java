package JavaPrograms;

public class PrintAlternateChars {

	public static boolean isPrime(int n)
	{
		if(n<2)
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void getPrime(int num)
	{
		if(isPrime(num))
		{
			System.out.println(num + " is a prime number");
		}
		
		for(int i = 2;i<=num;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i + " is a prime number");
			}
		}
		
	}
	
	public static void printAltenateStringChar(String s)
	{
		char[] strArr = s.toCharArray();
		for(int i=0;i<strArr.length;i+=2)
		{
			System.out.println(strArr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		getPrime(2);
		printAltenateStringChar("Namaste");

	}

}
