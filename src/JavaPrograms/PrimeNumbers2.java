package JavaPrograms;

public class PrimeNumbers2 {

	public static boolean isPrimeNumber(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
	return true;
	}
	
	public static void getPrimeNumber(int nu)
	{
		for(int i=2;i<=nu;i++)
		{
			if(isPrimeNumber(i))
				System.out.println(i +" ");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(-4));
		System.out.println(isPrimeNumber(0));
		System.out.println(isPrimeNumber(3));
		getPrimeNumber(7);  
		System.out.println("~~~~~~~~~ ");	

		int lower = 1, upper = 20;


	     for (int i = lower; i <= upper; i++)
	       if (isPrime (i))
	        System.out.println (i);
	   }

	   static boolean isPrime (int n)
	   {
	     int count = 0;

	     // 0, 1 negative numbers are not prime
	     if (n < 2)
	       return false;

	     // checking the number of divisors b/w 1 and the number n-1
	     for (int i = 2; i < n; i++)
	       {
	     if (n % i == 0)
	        return false;
	       }

	     // if reached here then must be true
	     return true;

	} 
	
	

}
